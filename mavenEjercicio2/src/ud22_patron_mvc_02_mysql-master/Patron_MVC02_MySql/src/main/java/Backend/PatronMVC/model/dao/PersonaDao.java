package Backend.PatronMVC.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import Backend.PatronMVC.model.conexion.Conexion;
import Backend.PatronMVC.model.dto.Persona;

/**
 * Clase que permite el acceso a la base de datos CRUD
 *
 */
public class PersonaDao {

	public void registrarPersona(Persona miPersona)
	{
		Conexion conex= new Conexion();
		
		try {
			Statement st = conex.getConnection().createStatement();
			String sql= "INSERT INTO persona VALUES ('"+miPersona.getIdPersona()+"', '"
					+miPersona.getNombrePersona()+"', '"+miPersona.getApellidoPersona()+"', '"
					+miPersona.getDireccionPersona()+"', '"+miPersona.getDNIPersona()+"', '"+miPersona.getFechaPersona()+"');""');";
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "Se ha registrado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
			System.out.println(sql);
			st.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Registro");
		}
	}

	public Persona buscarPersona(int codigo) {
		Conexion conex = new Conexion();
		Persona persona = new Persona();
		boolean existe = false;
		try {
			String sql = "SELECT * FROM persona where id = ? ";
			PreparedStatement consulta = conex.getConnection().prepareStatement(sql);
			consulta.setInt(1, codigo);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				existe = true;
				persona.setIdPersona(Integer.parseInt(res.getString("id")));
				persona.setNombrePersona(res.getString("nombre"));
				persona.setApellidoPersona(res.getString("apellido"));
				persona.setDireccionPersona(res.getString("direcion"));
				persona.setDNIPersona(Integer.parseInt(res.getString("DNI")));
				persona.setFechaPersona(res.getString("fecha"));

			}
			res.close();
			conex.desconectar();
			System.out.println(sql);

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, no se conecto");
			System.out.println(e);
		}

		if (existe) {
			return persona;
		} else
			return null;
	}

	public void modificarPersona(Persona miPersona) {

		Conexion conex = new Conexion();
		try {
			String consulta = "UPDATE persona SET id= ? ,nombre = ? , apellido=? , direccion=? , DNI= ?, fecha=? WHERE id= ? ";
			PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);

			estatuto.setInt(1, miPersona.getIdPersona());
			estatuto.setString(2, miPersona.getNombrePersona());
			estatuto.setString(2, miPersona.getApellidoPersona());
			estatuto.setString(4, miPersona.getDireccionPersona());
			estatuto.setInt(5, miPersona.getDNIPersona());
			estatuto.setString(6, miPersona.getFechaPersona());
			estatuto.setInt(7, miPersona.getIdPersona());
			estatuto.executeUpdate();

			JOptionPane.showMessageDialog(null, " Se ha Modificado Correctamente ", "Confirmaci�n",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println(consulta);

		} catch (SQLException e) {

			System.out.println(e);
			JOptionPane.showMessageDialog(null, "Error al Modificar", "Error", JOptionPane.ERROR_MESSAGE);

		}
	}

	public void eliminarPersona(String codigo) {
		Conexion conex = new Conexion();
		try {
			String sql = "DELETE FROM persona WHERE id='" + codigo + "'";
			Statement st = conex.getConnection().createStatement();
			st.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, " Se ha Eliminado Correctamente", "Informaci�n",
					JOptionPane.INFORMATION_MESSAGE);
			System.out.println(sql);
			st.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null, "No se Elimino");
		}
	}

}

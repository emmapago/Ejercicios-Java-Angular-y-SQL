package mavenEjercicio3;

public class CinetificosServ {

	package mavenEjercicio3;

	/*
	 * Esta clase permite realizar las operaciones asociadas a la l�gica de negocio
	 * como tal, desde ella realizamos las validaciones y llamadas a las operaciones
	 * CRUD del sistema.
	 * 
	 * En caso de que se requieran procesos adicionales asociados a la l�gica de
	 * negocio, aqu� ser� donde se creen los m�todos para dichos procesos, por
	 * ejemplo el m�todo validarRegistro determina si los datos son correctos y
	 * permite registrar la AsignadoA en el Dao.
	 */

	import javax.swing.JOptionPane;

	import Backend.model.dao.CientificosDao;
	import Backend.model.dto.Cientificos;
	import Backend.controller.CientificosController;

	private CientificosController CientificosController;
	public static boolean consultaCientificos=false;
	public static boolean modificaCientificos=false;

	// Metodo de vinculaci�n con el controller principal
	public void setCientificosController(CientificosController CientificosController) {
				this.setController(CientificosController);		
			}

	// Metodo que valida los datos de Registro antes de pasar estos al DAO
	public void validarRegistro(Cientificos miCientificos) {
				CientificosDao miCientificosDao;
				if (miCientificos.getIdCientificos() > 99) {
					miCientificosDao = new CientificosDao();
					miCientificosDao.registrarCientificos(miCientificos);						
				}else {
					JOptionPane.showMessageDialog(null,"El documento asignadoA debe ser mas de 3 digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
					
				}
				
			}

	// Metodo que valida los datos de consulta antes de pasar estos al DAO
	public Cientificos validarConsulta(String codigoCientificos) {
			CientificosDao miCientificosDao;
				
				try {
					int codigo=Integer.parseInt(codigoCientificos);	
					if (codigo > 99) {
						CientificosDao = new CientificosDao();
						consultaCientificos=true;
						return miCientificosDao.buscarCientificos(codigo);						
					}else{
						JOptionPane.showMessageDialog(null,"El documento asignadoA debe ser mas de 3 digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
						consultaAsignadoA=false;
					}
					
				}catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"Debe ingresar un dato numerico","Error",JOptionPane.ERROR_MESSAGE);
					consultaAsignadoA=false;
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"Se ha presentado un Error","Error",JOptionPane.ERROR_MESSAGE);
					consultaAsignadoA=false;
				}
							
				return null;
			}

	// Metodo que valida los datos de Modificaci�n antes de pasar estos al DAO
	public void validarModificacion(Cientificos miCientificos) {
			CientificosDao miCientificosDao;
				if (miCientificos.getNombreCientificos().length()>5) {
					miCientificosDao = new CientificosDao();
					miCientificosDao.modificarCientificos(miCientificos);	
					modificaCientificos=true;
				}else{
					JOptionPane.showMessageDialog(null,"El nombre de la Persona debe ser mayor a 5 digitos","Advertencia",JOptionPane.WARNING_MESSAGE);
					modificaCientificos=false;
				}
			}

	// Metodo que valida los datos de Eliminaci�n antes de pasar estos al DAO
	public void validarEliminacion(String codigo) {
			CientificosDao miCientificosDao=new CientificosDao();
				miCientificosDao.eliminarCientificos(codigo);
			}

	public CientificosController getCientificosController() {
				return CientificosController;
			}

	public void setController(CientificosController CientificosController) {
		this.CientificosController = CientificosController;
	}

}

}

}

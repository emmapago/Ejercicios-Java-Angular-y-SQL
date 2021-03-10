/*
 * Esta clase permite realizar las operaciones asociadas a la l�gica de negocio como tal, desde ella realizamos las validaciones 
 * y llamadas a las operaciones CRUD del sistema.
 * 
 * En caso de que se requieran procesos adicionales asociados a la l�gica de negocio, aqu� ser� donde se creen los m�todos para 
 * dichos procesos, por ejemplo el m�todo validarRegistro determina si los datos son correctos y permite registrar la persona en
 * el Dao.
 */

package Backend.PatronMVC.model.service;

import javax.swing.JOptionPane;

import Backend.PatronMVC.model.dao.VideoDao;
import Backend.PatronMVC.model.dto.Video;
import Backend.PatronMVC.controller.VideoController;

public class VideoServ {

	private VideoController videoController;
	public static boolean consultaVideo = false;
	public static boolean modificaVideo = false;

	// Metodo de vinculaci�n con el controller principal
	public void setvideoController(VideoController videoController) {
		this.setVideo(videoController);
	}

	// Metodo que valida los datos de Registro antes de pasar estos al DAO
	public void validarRegistro(Video miVideo) {
		VideoDao miVideoDao;
		if (miVideo.getIdVideo() > 99) {
			miVideoDao = new VideoDao();
			miVideoDao.registrarVideo(miVideo);
		} else {
			JOptionPane.showMessageDialog(null, "El documento del video debe ser mas de 3 digitos", "Advertencia",
					JOptionPane.WARNING_MESSAGE);

		}

	}

	// Metodo que valida los datos de consulta antes de pasar estos al DAO
	public Video validarConsulta(String codigoVideo) {
		VideoDao miVideoDao;

		try {
			int codigo = Integer.parseInt(codigoVideo);
			if (codigo > 99) {
				miVideoDao = new VideoDao();
				consultaVideo = true;
				return miVideoDao.buscarVideo(codigo);
			} else {
				JOptionPane.showMessageDialog(null, "El documento de la persona debe ser mas de 3 digitos",
						"Advertencia", JOptionPane.WARNING_MESSAGE);
				consultaPersona = false;
			}

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Debe ingresar un dato numerico", "Error", JOptionPane.ERROR_MESSAGE);
			consultaPersona = false;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha presentado un Error", "Error", JOptionPane.ERROR_MESSAGE);
			consultaPersona = false;
		}

		return null;
	}

	// Metodo que valida los datos de Modificaci�n antes de pasar estos al DAO
	public void validarModificacion(Video miVideo) {
		PersonaDao miVideoDao;
		if (miVideo.getTituloVideo().length() > 5) {
			miVideoDao = new VideoDao();
			miVideoDao.modificarVideo(miVideo);
			modificaVideo = true;
		} else {
			JOptionPane.showMessageDialog(null, "El titulo debe ser mayor a 5 digitos", "Advertencia",
					JOptionPane.WARNING_MESSAGE);
			modificaPersona = false;
		}
	}

	// Metodo que valida los datos de Eliminaci�n antes de pasar estos al DAO
	public void validarEliminacion(String codigo) {
		VideoDao miVideoDao = new VideoDao();
		miVideoDao.eliminarVideo(codigo);
	}

	public VideoController getVideoController() {
		return videoController;
	}

	public void setController(VideoController videoController) {
		this.videoController = videoController;
	}

}

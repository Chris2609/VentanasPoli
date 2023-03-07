package controlador;

import vista.GestionarInscripciones;

public class ControladorGestionarIns {

	GestionarInscripciones gestionarIns = new GestionarInscripciones();
	
	public ControladorGestionarIns(GestionarInscripciones gestionarIns) {
		this.gestionarIns = gestionarIns;
	}
	
	public void inicializar() {
		gestionarIns.setTitle("Gestor Inscripciones");
		gestionarIns.setLocationRelativeTo(null);
		gestionarIns.setVisible(false);
	}
	
}

package controlador;

import vista.GestionarActividades;
import vista.GestionarUsuarios;

public class ControladorGestionarAct {

	GestionarActividades gestionarAct = new GestionarActividades();
	
	public ControladorGestionarAct(GestionarActividades actividades) {
		gestionarAct = actividades;
	}
	
	public void inicializar() {
		gestionarAct.setTitle("Gestor Actividades");
		gestionarAct.setLocationRelativeTo(null);
		gestionarAct.setVisible(false);
	}
}

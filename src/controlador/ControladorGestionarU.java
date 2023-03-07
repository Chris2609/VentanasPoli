package controlador;

import vista.GestionarUsuarios;

public class ControladorGestionarU {

	GestionarUsuarios gestionarU = new GestionarUsuarios();
	
	public ControladorGestionarU(GestionarUsuarios usuarios) {
		gestionarU = usuarios;
	}
	
	public void inicializar() {
		gestionarU.setTitle("Gestor Usuarios");
		gestionarU.setLocationRelativeTo(null);
		gestionarU.setVisible(false);
	}
	
}

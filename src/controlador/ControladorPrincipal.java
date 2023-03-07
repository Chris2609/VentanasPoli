package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Principal;

public class ControladorPrincipal implements ActionListener{

	Principal ventanaP = new Principal();

	public ControladorPrincipal(Principal principal) {
		ventanaP = principal;
		
		ventanaP.btnGestionarUsuarios.addActionListener(this);
		ventanaP.btnGestionarActividades.addActionListener(this);
		ventanaP.btnGestionarInscripciones.addActionListener(this);
	}

	public void inicializar() {
		ventanaP.setTitle("Desktop");
		ventanaP.setLocationRelativeTo(null);
		ventanaP.setVisible(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == ventanaP.btnGestionarUsuarios) {
			System.out.println("Has pulsado Gestionar Usuarios");
		}
		
		if(e.getSource() == ventanaP.btnGestionarActividades) {
			System.out.println("Has pulsado Gestionar Actividades");
		}
		
		if(e.getSource() == ventanaP.btnGestionarInscripciones) {
			System.out.println("Has pulsado Gestionar Inscripciones");
		}
	}
	

}

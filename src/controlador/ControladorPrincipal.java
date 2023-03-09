package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.GestionarActividades;
import vista.GestionarInscripciones;
import vista.GestionarUsuarios;
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
		ventanaP.setTitle("Gestor Polideportivo");
		ventanaP.setLocationRelativeTo(null);
		ventanaP.setVisible(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == ventanaP.btnGestionarUsuarios) {
			
			GestionarUsuarios gestorU = new GestionarUsuarios();
			ControladorGestionarU controladorU = new ControladorGestionarU(gestorU);
			controladorU.inicializar();
			gestorU.setVisible(true);
			
		} else if(e.getSource() == ventanaP.btnGestionarActividades) {
			
			GestionarActividades gestorAct = new GestionarActividades();
			ControladorGestionarAct controladorAct = new ControladorGestionarAct(gestorAct);
			controladorAct.inicializar();
			gestorAct.setVisible(true);
			
		}else if(e.getSource() == ventanaP.btnGestionarInscripciones) {
			
			GestionarInscripciones gestorIns = new GestionarInscripciones();
			ControladorGestionarIns controladorIns = new ControladorGestionarIns(gestorIns);
			controladorIns.inicializar();
			gestorIns.setVisible(true);
			
		}
	}
	

}

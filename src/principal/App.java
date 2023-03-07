package principal;

import controlador.ControladorPrincipal;
import vista.Principal;

public class App {

	public static void main(String[] args) {
		
		Principal ventanaP = new Principal();
		ControladorPrincipal principalC = new ControladorPrincipal(ventanaP);
		principalC.inicializar();
		ventanaP.setVisible(true);
		
	}
	
}

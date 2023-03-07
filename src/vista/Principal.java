package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	public JButton btnGestionarUsuarios; 
	public JButton btnGestionarActividades;
	public JButton btnGestionarInscripciones;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Gestor Polideportivo\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		btnGestionarUsuarios = new JButton("Gestionar Usuarios");
		btnGestionarUsuarios.setBounds(140, 14, 147, 40);
		btnGestionarUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnGestionarUsuarios);
		
		btnGestionarActividades = new JButton("Gestionar Actividades");
		btnGestionarActividades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGestionarActividades.setBounds(140, 101, 147, 40);
		contentPane.add(btnGestionarActividades);
		
		btnGestionarInscripciones = new JButton("Gestionar Inscripciones");
		btnGestionarInscripciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGestionarInscripciones.setBounds(140, 177, 147, 40);
		contentPane.add(btnGestionarInscripciones);
	}
}

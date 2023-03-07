package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionarUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textNombreApe;
	private JTextField textDNI;
	private JTextField textCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GestionarUsuario dialog = new GestionarUsuario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GestionarUsuario() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			textNombreApe = new JTextField();
			textNombreApe.setBounds(102, 34, 86, 20);
			contentPanel.add(textNombreApe);
			textNombreApe.setColumns(10);
		}
		
		JLabel lblNombreApe = new JLabel("Nombre y Apellido");
		lblNombreApe.setBounds(10, 37, 92, 14);
		contentPanel.add(lblNombreApe);
		
		textDNI = new JTextField();
		textDNI.setColumns(10);
		textDNI.setBounds(50, 75, 86, 20);
		contentPanel.add(textDNI);
		
		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setBounds(10, 78, 30, 14);
		contentPanel.add(lblDNI);
		{
			JLabel lblCodigo = new JLabel("Código");
			lblCodigo.setBounds(10, 113, 61, 14);
			contentPanel.add(lblCodigo);
		}
		{
			textCodigo = new JTextField();
			textCodigo.setColumns(10);
			textCodigo.setBounds(60, 110, 86, 20);
			contentPanel.add(textCodigo);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Insertar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Volver");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

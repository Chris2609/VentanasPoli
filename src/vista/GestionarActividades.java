package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class GestionarActividades extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textidAct;
	private JTextField textDiasSemana;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GestionarActividades dialog = new GestionarActividades();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GestionarActividades() {
		setTitle("Gestionar Actividades");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblidAct = new JLabel("ID Actividad");
			lblidAct.setBounds(22, 32, 89, 14);
			contentPanel.add(lblidAct);
		}
		{
			textidAct = new JTextField();
			textidAct.setBounds(90, 29, 78, 20);
			contentPanel.add(textidAct);
			textidAct.setColumns(10);
		}
		{
			JLabel lblDasA = new JLabel("Días a la \r\nsemana");
			lblDasA.setBounds(22, 60, 89, 14);
			contentPanel.add(lblDasA);
		}
		{
			textDiasSemana = new JTextField();
			textDiasSemana.setColumns(10);
			textDiasSemana.setBounds(112, 57, 78, 20);
			contentPanel.add(textDiasSemana);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Modificar");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

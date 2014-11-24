import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class VentanaConversor extends JFrame {

	private JPanel contentPane;
	private JTextField cajaEuros;
	private JTextField cajaDolares;
	private JTextField cajaMensaje;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public VentanaConversor(float valorConversion) {
		
		//Se muestra el título de la ventana
		setTitle("Ventana Conversi\u00F3n Dolares");
		setResizable(false);
		
		//Se muestran las propiedades de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 348, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Enunciado de la ventana
		JLabel lblIntroducirUnValor = new JLabel("INTRODUCIR UN VALOR EN EUROS ENTRE 0 Y 500 \u20AC");
		lblIntroducirUnValor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIntroducirUnValor.setBounds(21, 27, 334, 14);
		contentPane.add(lblIntroducirUnValor);
		
		//Texto Euros
		JLabel lblEuros = new JLabel("Euros");
		lblEuros.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEuros.setBounds(21, 67, 93, 14);
		contentPane.add(lblEuros);
		
		//En el siguiente cuadro se escriben los euros
		cajaEuros = new JTextField();
		cajaEuros.setBounds(21, 87, 150, 20);
		contentPane.add(cajaEuros);
		cajaEuros.setColumns(10);
		
		//Texto Dólares
		JLabel lblDlares = new JLabel("D\u00F3lares");
		lblDlares.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDlares.setBounds(21, 134, 93, 14);
		contentPane.add(lblDlares);
		
		//En el siguiente cuadro se muestra la conversión de euros a dólares
		cajaDolares = new JTextField();
		cajaDolares.setColumns(10);
		cajaDolares.setBounds(21, 155, 150, 20);
		contentPane.add(cajaDolares);
		
		//Botón convertir
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Inicializamos un float con la variable euros
				float euros;
				
				//Intentamos los que se muestra a continuación
				try{
					euros=Float.parseFloat(cajaEuros.getText());					
					cajaDolares.setText(String.valueOf(euros*valorConversion));
					if(euros>0 && euros<=500){
						cajaMensaje.setText("TODO OK");	
					}else if(euros<=0){
						cajaMensaje.setText("Los euros deben estar entre 0 y 500 €");	
					}else if(euros>500){
						cajaMensaje.setText("Los euros deben estar entre 0 y 500 €");	
					}
				
				//si no se cumple lo anterior
				}catch(Exception e1){
					cajaMensaje.setText("Se ha producido un error en la conversión");	
				}
				
			}
		});
		
		btnConvertir.setBounds(208, 154, 89, 23);
		contentPane.add(btnConvertir);
		
		//Texto Mensaje de control
		JLabel lblMensajeDeControl = new JLabel("Mensaje de control");
		lblMensajeDeControl.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMensajeDeControl.setBounds(21, 203, 211, 14);
		contentPane.add(lblMensajeDeControl);
		
		//El siguiente cuadro está desabilitado por lo que no se puede escribir en él, sólo muestra un mensaje
		cajaMensaje = new JTextField();
		cajaMensaje.setForeground(Color.RED);
		cajaMensaje.setFont(new Font("Tahoma", Font.BOLD, 11));
		cajaMensaje.setEditable(false);
		cajaMensaje.setColumns(10);
		cajaMensaje.setBounds(21, 228, 276, 20);
		contentPane.add(cajaMensaje);
	}
}

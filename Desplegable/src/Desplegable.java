import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class Desplegable extends JFrame {

	private JPanel contentPane;
	JComboBox comboBox = new JComboBox();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desplegable frame = new Desplegable();
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
	public Desplegable() {
		
		setTitle("Desplegable");
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		comboBox.setBounds(32, 30, 153, 20);
		contentPane.add(comboBox);
		
		String nombres[]=new String[4];
		nombres[0]="Jose Antonio";
		nombres[1]="Manoli";
		nombres[2]="Sofia";
		nombres[3]="Mario";
		
		comboBox.addItem(nombres[0]);
		comboBox.addItem(nombres[1]);
		comboBox.addItem(nombres[2]);
		comboBox.addItem(nombres[3]);
		
		comboBox.setSelectedItem(nombres[2]);
		
			
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				switch((String)comboBox.getSelectedItem()){
				
				case "Jose Antonio":
					textField.setText("Jose Antonio es el padre");
					break;
					
				case "Manoli":
					textField.setText("Manoli es la madre");
					break;
					
				case "Sofia":
					textField.setText("Sofia es la hija mayor");
					break;
					
				default:
					textField.setText("Sólo queda Mario, el pequeño de la casa");
					break;
				
				}
				
				
			}
		});
		
		textField = new JTextField();
		textField.setBounds(32, 131, 402, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEleccin = new JLabel("Elecci\u00F3n");
		lblEleccin.setBounds(32, 106, 277, 14);
		contentPane.add(lblEleccin);
		
	}
}

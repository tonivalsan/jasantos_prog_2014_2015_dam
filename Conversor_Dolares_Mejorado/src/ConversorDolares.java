import java.awt.EventQueue;




public class ConversorDolares {

	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					float valorConversion=1.25f;
					
					VentanaConversor frame = new VentanaConversor(valorConversion);
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

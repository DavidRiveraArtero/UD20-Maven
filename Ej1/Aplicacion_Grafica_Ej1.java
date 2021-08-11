package com.drivera.ejemplo.UD21_Ej1App;
import javax.swing.*;

public class Aplicacion_Grafica_Ej1 extends JFrame{
	private JPanel contentPane;
	public Aplicacion_Grafica_Ej1() {
		//CUANDO LE DEMOS A LA X SE CERRARA LA VENTANA
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		//HACEMOS QUE LA VENTANA SEA VISIBLE
		setVisible(true);
		
		//CREAMOS EL PANEL
		contentPane = new JPanel();
		
		//INDICAMOS SU DISEÑO
		contentPane.setLayout(null);
		
		//ASIGNAMOS EL PANEL A LA VENTANA
		setContentPane(contentPane);
		
		//TITULO VENTANA
		setTitle("OPCIONES");
	}

}

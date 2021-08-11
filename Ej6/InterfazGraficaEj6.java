package com.UD21.UD21_Ej6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class InterfazGraficaEj6 extends JFrame{
	private JPanel contentPane;
	
	JTextField numAltura;
	JTextField numPeso;
	JTextField Resultado;
	JButton CalcularIMC;
	public InterfazGraficaEj6() {
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
		
		//AÑADIMOS TITULO A LA VENTANA
		setTitle("Saludador");
		
		//TAMAÑO DE LA VENTANA
		setBounds(400,400,450,400);
		
		//CREAMOS EL CONTENIDO
		JLabel TextAltura = new JLabel ("Altura (metros)");
		JLabel TextPeso = new JLabel ("Peso (kg)");
		JLabel TextIMC = new JLabel ("IMC");
		numAltura = new JTextField();
		numPeso = new JTextField();
		CalcularIMC = new JButton("Calcular IMC");
		Resultado = new JTextField();
		
		//POSICION DEL CONTENIDO
		TextAltura.setBounds(20,20,100,20);
		numAltura.setBounds(121,20,70,20);
		TextPeso.setBounds(200,20,100,20);
		numPeso.setBounds(280,20,70,20);
		CalcularIMC.setBounds(70,50,139,20);
		TextIMC.setBounds(221,24,70,70);
		Resultado.setBounds(250,50,70,20);
		
		//AÑADIR CONTENIDO
		contentPane.add(TextAltura);
		contentPane.add(TextPeso);
		contentPane.add(numAltura);
		contentPane.add(numPeso);
		contentPane.add(CalcularIMC);
		contentPane.add(TextIMC);
		contentPane.add(Resultado);
		
		//OPCION RESULTADO
		Resultado.setEditable(false);
		
		CalcularIMC.addActionListener(new ActionListener() {
			double calcular = 0;
			public void actionPerformed(ActionEvent e) {
				String num1 = numAltura.getText();
				String num2 = numPeso.getText();
				
				double altura = Integer.parseInt(num1);
				double elevado = Math.pow(altura, 2);
				double peso = Integer.parseInt(num2);
				calcular = peso/elevado;
				System.out.println(calcular);
				
				
			}
		});
	}
	
}

package com.UD21_Ej2.UD21_Ejercicio2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Aplicacion_Grafica_Ej2 extends JFrame{
	
	private JPanel contentPane;
	
	JButton boton1;
	JButton boton2;
	JTextField sele;
	public Aplicacion_Grafica_Ej2() {
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
		
		//AñÑADIMOS TITULO A LA VENTANA
		setTitle("Ventana con interaccion");
		
		//TAMAÑO DE LA VENTANA
		setBounds(450,400,470,400);
		
		//CREAMOS EL CONTENIDO
		JLabel texto = new JLabel("Has pulsado: ");
		boton1 = new JButton ("Boton 1");
		boton2 = new JButton ("Boton 2");
		sele = new JTextField();
		
		//COLOCAR EL COMPONENTE
		texto.setBounds(80,20,100,70);
		boton1.setBounds(260,40,90,30);
		boton2.setBounds(362,40,90,30);
		sele.setBounds(160,40,90,30);
		
		//AÑADIR EL CONTENIDO
		contentPane.add(texto);
		contentPane.add(boton1);
		contentPane.add(boton2);
		contentPane.add(sele);
		
		//FORMATO VIDAS
		sele.setEditable(false);
		
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sele.setText(boton1.getText());
				
			}
		});
		
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sele.setText(boton2.getText());
				
			}
		});
		
	}
	
}

package com.UD21.UD21_Ej3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class InterfazGraficaEj3 extends JFrame{
	private JPanel contentPane;

	JTextField VecesBoton1;
	JTextField VecesBoton2;
	JButton boton1;
	JButton boton2;
	public InterfazGraficaEj3() {
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
		
		//CREAR EL CONTENIDO
		JLabel TextBoton1 = new JLabel ("Boton 1");
		JLabel TextBoton2 = new JLabel ("Boton 2");
		VecesBoton1 = new JTextField(); 
		VecesBoton2 = new JTextField();
		boton1 = new JButton("Boton 1");
		boton2 = new JButton("Boton 2");
		
		//POSICIONAR CONTENIDO
		TextBoton1.setBounds(30,10,50,50);
		TextBoton2.setBounds(180,10,50,50);
		VecesBoton1.setBounds(81,27,70,20);
		VecesBoton2.setBounds(225,27,70,20);
		boton1.setBounds(50,78,80,30);
		boton2.setBounds(225,78,80,30);
		
		//AÑADIR CONTENIDO
		contentPane.add(TextBoton1);
		contentPane.add(TextBoton2);
		contentPane.add(VecesBoton1);
		contentPane.add(VecesBoton2);
		contentPane.add(boton1);
		contentPane.add(boton2);
		
		//Opciones JTextFiled
		VecesBoton1.setEditable(false);
		VecesBoton2.setEditable(false);
		
		boton1.addActionListener(new ActionListener() {
			int num = 0;
			public void actionPerformed(ActionEvent e) {
				num++;
				VecesBoton1.setText(num+" veces");	
			}
		});
		
		boton2.addActionListener(new ActionListener() {
			int num = 0;
			public void actionPerformed(ActionEvent e) {
				num++;
				VecesBoton2.setText(num+" veces");	
			}
		});
	}
	
}

package UD21_Ej5.UD21_Ej5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;
public class InterfazGraficaEj5 extends JFrame implements MouseListener{
	private JPanel contentPane;
	JButton Limpira;
	JTextPane texto;
	
	
	public InterfazGraficaEj5() {
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
		
		//CREAR CONTENIDO
		Limpira = new JButton("Limpiar");
		texto = new JTextPane();
		
		//POSICIONAR CONTENIDO
		Limpira.setBounds(170,20,100,20);
		texto.setBounds(0,40,430,200);
		
		//AÑADIR CONTENIDO
		contentPane.add(Limpira);
		contentPane.add(texto);
		
		texto.addMouseListener(this);
		
		Limpira.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto.setText("");
				
			}
		});
			
	}
	
		
		
	
	public void mouseClicked(MouseEvent e) {
		
		texto.setText("mouseClicked \n");
		
	}
	public void mousePressed(MouseEvent e) {
		texto.setText("mousePressed \n");
		
	}
	public void mouseReleased(MouseEvent e) {
		texto.setText("mouseReleased \n");
		
	}
	public void mouseEntered(MouseEvent e) {
		texto.setText("mouseEntered \n");
		
	}
	public void mouseExited(MouseEvent e) {
		texto.setText("mouseExited \n");
		
		
	}
	
	
}

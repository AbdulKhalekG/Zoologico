package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI extends JFrame {

	public static JPanel Panel1;
	private JTextField tu_usuario;
	private JLabel lbintroduccion;
	private JButton btnSalir1;
	public static JFrame view;
	

	
	 //Abriendo la aplicacion
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Creando el frame
	public UI() {
		setTitle("APP ZOOLOGICO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Panel1 = new JPanel();
		Panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Panel1);
		Panel1.setLayout(null);
		
		JLabel lbUsuario = new JLabel("USUARIO");
		lbUsuario.setBounds(32, 98, 67, 31);
		Panel1.add(lbUsuario);
		
		tu_usuario = new JTextField();
		tu_usuario.setBounds(120, 103, 86, 20);
		Panel1.add(tu_usuario);
		tu_usuario.setColumns(10);
		
		lbintroduccion = new JLabel("Introduzca su usuario");
		lbintroduccion.setBounds(50, 59, 138, 14);
		Panel1.add(lbintroduccion);
		
		
		final UI3 window3 =new UI3();
		JButton btnAceptar = new JButton("ACEPTAR");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
				window3.setVisible(true);
				dispose();
				
			}
		});
		btnAceptar.setBounds(61, 163, 89, 23);
		Panel1.add(btnAceptar);
		
		btnSalir1 = new JButton("SALIR");
		btnSalir1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Se ha cerrado la aplicacion");
				System.exit(0);
			}
		});
		btnSalir1.setBounds(182, 163, 89, 23);
		Panel1.add(btnSalir1);
		
	
	}
	public static JPanel getJPanel() {
		return Panel1;
	}
}

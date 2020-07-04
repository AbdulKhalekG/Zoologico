package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class UI3 extends JFrame {

	public JPanel contentPane;
	private JPanel Panel3;
	public static JFrame view;

	//Abriendo la aplicacion
 static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI3 frame = new UI3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//Creando el frame
	
	public UI3() {
		contentPane = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Panel3 = new JPanel();
		Panel3.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Panel3);
		Panel3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPCIONES");
		lblNewLabel.setBounds(175, 39, 78, 14);
		Panel3.add(lblNewLabel);
		
		final UI2 window2 = new UI2();
		JButton btnAgregar = new JButton("AGREGAR ANIMAL");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Agrega un Animal");
				window2.setVisible(true);
				dispose();
			}
		});
		btnAgregar.setBounds(112, 79, 181, 23);
		Panel3.add(btnAgregar);
		
		
		JButton btnSalir2 = new JButton("SALIR");
		btnSalir2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		btnSalir2.setBounds(158, 178, 89, 23);
		Panel3.add(btnSalir2);
		
		final MostrarAnimales window4 =new MostrarAnimales();
		JButton btnLista1 = new JButton("MOSTRAR LISTA DE ANIMALES");
		btnLista1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "LISTA DE ANIMALES");
				window4.setVisible(true);
				dispose();
				
				
				
				
				
			}
		});
		btnLista1.setBounds(99, 130, 213, 23);
		Panel3.add(btnLista1);
	}
}

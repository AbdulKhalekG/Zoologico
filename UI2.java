package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;

public class UI2 extends JFrame {

	public static JPanel Panel2;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JTextField text4;
	private JTextField text5;
	public static JFrame view;

	//Abriendo la aplicacion
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI2 frame = new UI2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Creando el frame
	public UI2() {
		setTitle("APP ZOOLOGICO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Panel2 = new JPanel();
		Panel2.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Panel2);
		Panel2.setLayout(null);
		
		JLabel lbDatos = new JLabel("DATOS DE LOS ANIMALES");
		lbDatos.setBounds(137, 11, 133, 14);
		Panel2.add(lbDatos);
		
		JLabel lbEdad = new JLabel("EDAD");
		lbEdad.setBounds(10, 36, 46, 14);
		Panel2.add(lbEdad);
		
		text1 = new JTextField();
		text1.setBounds(10, 51, 86, 20);
		Panel2.add(text1);
		text1.setColumns(10);
		
		JLabel lbAltura = new JLabel("ALTURA");
		lbAltura.setBounds(10, 82, 46, 14);
		Panel2.add(lbAltura);
		
		text2 = new JTextField();
		text2.setBounds(10, 99, 86, 20);
		Panel2.add(text2);
		text2.setColumns(10);
		
		JLabel lbnombre1 = new JLabel("NOMBRE");
		lbnombre1.setBounds(10, 130, 46, 14);
		Panel2.add(lbnombre1);
		
		text3 = new JTextField();
		text3.setBounds(10, 155, 86, 20);
		Panel2.add(text3);
		text3.setColumns(10);
		
		JLabel lbgenero = new JLabel("GENERO");
		lbgenero.setBounds(10, 186, 46, 14);
		Panel2.add(lbgenero);
		
		text4 = new JTextField();
		text4.setBounds(10, 211, 86, 20);
		Panel2.add(text4);
		text4.setColumns(10);
		
		JCheckBox boxcarnivoro = new JCheckBox("CARNIVORO");
		boxcarnivoro.setBounds(281, 62, 97, 23);
		Panel2.add(boxcarnivoro);
		
		JLabel lbcomportamiento = new JLabel("COMPORTAMIENTO");
		lbcomportamiento.setBounds(137, 102, 97, 14);
		Panel2.add(lbcomportamiento);
		
		text5 = new JTextField();
		text5.setBounds(137, 127, 86, 20);
		Panel2.add(text5);
		text5.setColumns(10);
		
		JCheckBox boxherviboro = new JCheckBox("HERVIBORO");
		boxherviboro.setBounds(281, 109, 97, 23);
		Panel2.add(boxherviboro);
		
		JCheckBox boxomnivoro = new JCheckBox("OMNIVORO");
		boxomnivoro.setBounds(281, 154, 97, 23);
		Panel2.add(boxomnivoro);
		
		 
		JButton btnAgregar2 = new JButton("AGREGAR");
		btnAgregar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Usted ha agregado un animal");
				
			}
		});
		btnAgregar2.setBounds(218, 227, 89, 23);
		Panel2.add(btnAgregar2);
		
		
		JButton btnSalir2 = new JButton("SALIR");
		btnSalir2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			
			}
		});
		btnSalir2.setBounds(119, 227, 89, 23);
		Panel2.add(btnSalir2);
	}
	public static JPanel getJPanel() {
		return Panel2;
	}
}

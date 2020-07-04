package GUI;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import ELZOOLOGICO.Main;
import ELZOOLOGICO.Animal;
import ELZOOLOGICO.Carnivoro;
import ELZOOLOGICO.Herviboro;
import ELZOOLOGICO.Omnivoro;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
public class MostrarAnimales extends JFrame {
	


	private JPanel Panel4;
	private JTextField txtTodosLosAnimales;
	private JLabel Leon;
	private JLabel Pinguino;
	private JLabel Tiburon;
	private JLabel Cocodrilo;
	private JLabel Rinoceronte;
	private JLabel Hipopotamo;
	private JLabel Elefante;
	private JLabel Jirafa;
	private JLabel Canguro;
	private JLabel Mono;
	private JLabel Tortuga;
	private JLabel Tigre;
	private JLabel Oso;
	private JLabel Avestruz;
	private JLabel Puercoespin;
	private JLabel lbEdadLeon;
	private JLabel lbEdadPinguino;
	private JLabel lbEdadTiburon;
	private JLabel lbEdadCocodrilo;
	private JLabel lbEdadRinoceronte;
	private JLabel lbEdadHipopotamo;
	private JLabel lbEdadElefante;
	private JLabel lbEdadJirafa;
	private JLabel lbEdadCanguro;
	private JLabel lbEdadMono;
	private JLabel lbEdadTortuga;
	private JLabel lbEdadTigre;
	private JLabel lbEdadOso;
	private JLabel lbEdadAvestruz;
	private JLabel lblNewLabel;
	private JLabel lbAlturaLeon;
	private JLabel lbAlturaPinguino;
	private JLabel lblAlturaTiburon;
	private JLabel lblAlturaCocodrilo;
	private JLabel lbAlturaRinoceronte;
	private JLabel lbAlturaHipopotamo;
	private JLabel lbAlturaElefante;
	private JLabel lbAlturaJirafa;
	private JLabel lbAlturaCanguro;
	private JLabel lbAlturaMono;
	private JLabel lbAlturaTortuga;
	private JLabel lbAlturaTigre;
	private JLabel lbAlturaOsoo;
	private JLabel lbAlturaAvestruz;
	private JLabel lbAlturaPuercoespin;
	private JLabel lbComportamientoLeon;
	private JLabel lbComportamientoPinguino;
	private JLabel lbComportamientoTiburon;
	private JLabel lbComportamientoCocodrilo;
	private JLabel lbComportamientoRinoceronte;
	private JLabel lbComportamientoHipopotamo;
	private JLabel lbComportamientoElefante;
	private JLabel lbComportamientoJirafa;
	private JLabel lbComportamientoCanguro;
	private JLabel lbComportamientoMono;
	private JLabel lbComportamientoTortuga;
	private JLabel lbComportamientoTigre;
	private JLabel lbComportamientoOso;
	private JLabel lbComportamientoAvestruz;
	private JLabel lbComportamientoPuercoespin;
	private JLabel lblGeneroL;
	private JLabel lbGeneroPinguino;
	private JLabel lblNewLabel_32;
	private JLabel lbGeneroCocodrilo;
	private JLabel lbGeneroRinoceronte;
	private JLabel lbGeneroHipopotamo;
	private JLabel lbGeneroElefante;
	private JLabel lbGeneroJirafa;
	private JLabel lbGeneroCanguro;
	private JLabel lbGeneroMono;
	private JLabel lbGeneroTortuga;
	private JLabel lbGeneroTigre;
	private JLabel lbGeneroOso;
	private JLabel lbGeneroAvestruz;
	private JLabel lbGeneroPuercoespin;
	private JTextPane txtpnNombres;
	private JTextPane txtpnEdad;
	private JTextPane txtpnAltura;
	private JTextPane txtpnGenero;
	private JTextPane txtpnComportamientos;
	private JTextPane txtpnListadoDeAnimales;
	private JButton btnNewButton;


	 // Abriendo la aplicacion
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarAnimales frame = new MostrarAnimales();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	 //Creando el frame
	 
	public MostrarAnimales() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 503);
		Panel4 = new JPanel();
		Panel4.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Panel4);
		Panel4.setLayout(null);
		{
			txtTodosLosAnimales = new JTextField();
			txtTodosLosAnimales.setText("Todos los animales");
			txtTodosLosAnimales.setBounds(158, 0, 131, 20);
			Leon = new JLabel();
			txtTodosLosAnimales.setColumns(10);
		}
		{
			Leon = new JLabel("Leon");
			Leon.setBounds(10, 43, 68, 14);
			Panel4.add(Leon);
		}
		{
			Pinguino = new JLabel("Pinguino");
			Pinguino.setBounds(10, 61, 46, 14);
			Panel4.add(Pinguino);
		}
		{
			Tiburon = new JLabel("Tiburon");
			Tiburon.setBounds(10, 81, 46, 14);
			Panel4.add(Tiburon);
		}
		{
			Cocodrilo = new JLabel("Cocodrilo");
			Cocodrilo.setBounds(10, 98, 46, 14);
			Panel4.add(Cocodrilo);
		}
		{
			Rinoceronte = new JLabel("Rinoceronte");
			Rinoceronte.setBounds(10, 123, 83, 14);
			Panel4.add(Rinoceronte);
		}
		{
			Hipopotamo = new JLabel("Hipopotamo");
			Hipopotamo.setBounds(10, 148, 68, 14);
			Panel4.add(Hipopotamo);
		}
		{
			Elefante = new JLabel("Elefante");
			Elefante.setBounds(10, 173, 46, 14);
			Panel4.add(Elefante);
		}
		{
			Jirafa = new JLabel("Jirafa");
			Jirafa.setBounds(10, 198, 46, 14);
			Panel4.add(Jirafa);
		}
		{
			Canguro = new JLabel("Canguro");
			Canguro.setBounds(10, 223, 46, 14);
			Panel4.add(Canguro);
		}
		{
			Mono = new JLabel("Mono");
			Mono.setBounds(10, 248, 46, 14);
			Panel4.add(Mono);
		}
		{
			Tortuga = new JLabel("Tortuga");
			Tortuga.setBounds(10, 273, 46, 14);
			Panel4.add(Tortuga);
		}
		{
			Tigre = new JLabel("Tigre");
			Tigre.setBounds(10, 298, 46, 14);
			Panel4.add(Tigre);
		}
		{
			Oso = new JLabel("Oso");
			Oso.setBounds(10, 323, 46, 14);
			Panel4.add(Oso);
		}
		{
			Avestruz = new JLabel("Avestruz");
			Avestruz.setBounds(10, 348, 46, 14);
			Panel4.add(Avestruz);
		}
		{
			Puercoespin = new JLabel("Puercoespin");
			Puercoespin.setBounds(10, 373, 83, 14);
			Panel4.add(Puercoespin);
		}
		{
			lbEdadLeon = new JLabel("8");
			lbEdadLeon.setBounds(111, 43, 46, 14);
			Panel4.add(lbEdadLeon);
		}
		{
			lbEdadPinguino = new JLabel("3");
			lbEdadPinguino.setBounds(111, 61, 46, 14);
			Panel4.add(lbEdadPinguino);
		}
		{
			lbEdadTiburon = new JLabel("8");
			lbEdadTiburon.setBounds(111, 81, 46, 14);
			Panel4.add(lbEdadTiburon);
		}
		{
			lbEdadCocodrilo = new JLabel("5");
			lbEdadCocodrilo.setBounds(111, 98, 46, 14);
			Panel4.add(lbEdadCocodrilo);
		}
		{
			lbEdadRinoceronte = new JLabel("5");
			lbEdadRinoceronte.setBounds(111, 123, 46, 14);
			Panel4.add(lbEdadRinoceronte);
		}
		{
			lbEdadHipopotamo = new JLabel("34");
			lbEdadHipopotamo.setBounds(111, 148, 46, 14);
			Panel4.add(lbEdadHipopotamo);
		}
		{
			lbEdadElefante = new JLabel("7");
			lbEdadElefante.setBounds(111, 173, 46, 14);
			Panel4.add(lbEdadElefante);
		}
		{
			lbEdadJirafa = new JLabel("4");
			lbEdadJirafa.setBounds(111, 198, 46, 14);
			Panel4.add(lbEdadJirafa);
		}
		{
			lbEdadCanguro = new JLabel("3");
			lbEdadCanguro.setBounds(111, 223, 46, 14);
			Panel4.add(lbEdadCanguro);
		}
		{
			lbEdadMono = new JLabel("5");
			lbEdadMono.setBounds(116, 248, 46, 14);
			Panel4.add(lbEdadMono);
		}
		{
			lbEdadTortuga = new JLabel("34");
			lbEdadTortuga.setBounds(116, 273, 46, 14);
			Panel4.add(lbEdadTortuga);
		}
		{
			lbEdadTigre = new JLabel("7");
			lbEdadTigre.setBounds(116, 298, 46, 14);
			Panel4.add(lbEdadTigre);
		}
		{
			lbEdadOso = new JLabel("7");
			lbEdadOso.setBounds(116, 323, 46, 14);
			Panel4.add(lbEdadOso);
		}
		{
			lbEdadAvestruz = new JLabel("4");
			lbEdadAvestruz.setBounds(111, 348, 46, 14);
			Panel4.add(lbEdadAvestruz);
		}
		{
			lblNewLabel = new JLabel("3");
			lblNewLabel.setBounds(111, 373, 46, 14);
			Panel4.add(lblNewLabel);
		}
		{
			lbAlturaLeon = new JLabel("1.85");
			lbAlturaLeon.setBounds(180, 43, 46, 14);
			Panel4.add(lbAlturaLeon);
		}
		{
			lbAlturaPinguino = new JLabel("1");
			lbAlturaPinguino.setBounds(180, 61, 46, 14);
			Panel4.add(lbAlturaPinguino);
		}
		{
			lblAlturaTiburon = new JLabel("3");
			lblAlturaTiburon.setBounds(182, 81, 46, 14);
			Panel4.add(lblAlturaTiburon);
		}
		{
			lblAlturaCocodrilo = new JLabel("4.85");
			lblAlturaCocodrilo.setBounds(182, 98, 46, 14);
			Panel4.add(lblAlturaCocodrilo);
		}
		{
			lbAlturaRinoceronte = new JLabel("3.7");
			lbAlturaRinoceronte.setBounds(180, 123, 46, 14);
			Panel4.add(lbAlturaRinoceronte);
		}
		{
			lbAlturaHipopotamo = new JLabel("3.9");
			lbAlturaHipopotamo.setBounds(182, 148, 46, 14);
			Panel4.add(lbAlturaHipopotamo);
		}
		{
			lbAlturaElefante = new JLabel("6.2");
			lbAlturaElefante.setBounds(182, 173, 46, 14);
			Panel4.add(lbAlturaElefante);
		}
		{
			lbAlturaJirafa = new JLabel("6.1");
			lbAlturaJirafa.setBounds(182, 198, 46, 14);
			Panel4.add(lbAlturaJirafa);
		}
		{
			lbAlturaCanguro = new JLabel("2.7");
			lbAlturaCanguro.setBounds(182, 223, 46, 14);
			Panel4.add(lbAlturaCanguro);
		}
		{
			lbAlturaMono = new JLabel("3.7");
			lbAlturaMono.setBounds(180, 248, 46, 14);
			Panel4.add(lbAlturaMono);
		}
		{
			lbAlturaTortuga = new JLabel("0.80");
			lbAlturaTortuga.setBounds(182, 273, 46, 14);
			Panel4.add(lbAlturaTortuga);
		}
		{
			lbAlturaTigre = new JLabel("1.60");
			lbAlturaTigre.setBounds(182, 298, 46, 14);
			Panel4.add(lbAlturaTigre);
		}
		{
			lbAlturaOsoo = new JLabel("3.5");
			lbAlturaOsoo.setBounds(180, 323, 46, 14);
			Panel4.add(lbAlturaOsoo);
		}
		{
			lbAlturaAvestruz = new JLabel("1.4");
			lbAlturaAvestruz.setBounds(180, 348, 46, 14);
			Panel4.add(lbAlturaAvestruz);
		}
		{
			lbAlturaPuercoespin = new JLabel("0.53");
			lbAlturaPuercoespin.setBounds(182, 373, 46, 14);
			Panel4.add(lbAlturaPuercoespin);
		}
		{
			lbComportamientoLeon = new JLabel("Corriendo");
			lbComportamientoLeon.setHorizontalAlignment(SwingConstants.CENTER);
			lbComportamientoLeon.setBounds(319, 43, 74, 14);
			Panel4.add(lbComportamientoLeon);
		}
		{
			lbComportamientoPinguino = new JLabel("Caminar");
			lbComportamientoPinguino.setBounds(347, 61, 46, 14);
			Panel4.add(lbComportamientoPinguino);
		}
		{
			lbComportamientoTiburon = new JLabel("Nadar");
			lbComportamientoTiburon.setBounds(347, 81, 46, 14);
			Panel4.add(lbComportamientoTiburon);
		}
		{
			lbComportamientoCocodrilo = new JLabel("Cazar");
			lbComportamientoCocodrilo.setHorizontalAlignment(SwingConstants.CENTER);
			lbComportamientoCocodrilo.setBounds(347, 98, 46, 14);
			Panel4.add(lbComportamientoCocodrilo);
		}
		{
			lbComportamientoRinoceronte = new JLabel("Comer");
			lbComportamientoRinoceronte.setHorizontalAlignment(SwingConstants.CENTER);
			lbComportamientoRinoceronte.setBounds(347, 123, 46, 14);
			Panel4.add(lbComportamientoRinoceronte);
		}
		{
			lbComportamientoHipopotamo = new JLabel("Comer");
			lbComportamientoHipopotamo.setHorizontalAlignment(SwingConstants.CENTER);
			lbComportamientoHipopotamo.setBounds(347, 148, 46, 14);
			Panel4.add(lbComportamientoHipopotamo);
		}
		{
			lbComportamientoElefante = new JLabel("Comer");
			lbComportamientoElefante.setHorizontalAlignment(SwingConstants.CENTER);
			lbComportamientoElefante.setBounds(347, 173, 46, 14);
			Panel4.add(lbComportamientoElefante);
		}
		{
			lbComportamientoJirafa = new JLabel("Correr");
			lbComportamientoJirafa.setHorizontalAlignment(SwingConstants.CENTER);
			lbComportamientoJirafa.setBounds(347, 198, 46, 14);
			Panel4.add(lbComportamientoJirafa);
		}
		{
			lbComportamientoCanguro = new JLabel("Saltar");
			lbComportamientoCanguro.setHorizontalAlignment(SwingConstants.CENTER);
			lbComportamientoCanguro.setBounds(347, 223, 46, 14);
			Panel4.add(lbComportamientoCanguro);
		}
		{
			lbComportamientoMono = new JLabel("Escalando");
			lbComportamientoMono.setHorizontalAlignment(SwingConstants.CENTER);
			lbComportamientoMono.setBounds(331, 248, 74, 14);
			Panel4.add(lbComportamientoMono);
		}
		{
			lbComportamientoTortuga = new JLabel("Quieto");
			lbComportamientoTortuga.setHorizontalAlignment(SwingConstants.CENTER);
			lbComportamientoTortuga.setBounds(347, 273, 46, 14);
			Panel4.add(lbComportamientoTortuga);
		}
		{
			lbComportamientoTigre = new JLabel("Dormir");
			lbComportamientoTigre.setHorizontalAlignment(SwingConstants.CENTER);
			lbComportamientoTigre.setBounds(347, 298, 46, 14);
			Panel4.add(lbComportamientoTigre);
		}
		{
			lbComportamientoOso = new JLabel("Mirando Arriba");
			lbComportamientoOso.setHorizontalAlignment(SwingConstants.CENTER);
			lbComportamientoOso.setBounds(319, 323, 86, 14);
			Panel4.add(lbComportamientoOso);
		}
		{
			lbComportamientoAvestruz = new JLabel("Quieto");
			lbComportamientoAvestruz.setHorizontalAlignment(SwingConstants.CENTER);
			lbComportamientoAvestruz.setBounds(347, 348, 46, 14);
			Panel4.add(lbComportamientoAvestruz);
		}
		{
			lbComportamientoPuercoespin = new JLabel("Caminando");
			lbComportamientoPuercoespin.setHorizontalAlignment(SwingConstants.CENTER);
			lbComportamientoPuercoespin.setBounds(331, 373, 62, 14);
			Panel4.add(lbComportamientoPuercoespin);
		}
		{
			lblGeneroL = new JLabel("M");
			lblGeneroL.setHorizontalAlignment(SwingConstants.CENTER);
			lblGeneroL.setBounds(248, 43, 46, 14);
			Panel4.add(lblGeneroL);
		}
		{
			lbGeneroPinguino = new JLabel("M");
			lbGeneroPinguino.setHorizontalAlignment(SwingConstants.CENTER);
			lbGeneroPinguino.setBounds(245, 61, 46, 14);
			Panel4.add(lbGeneroPinguino);
		}
		{
			lblNewLabel_32 = new JLabel("M");
			lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_32.setBounds(245, 81, 46, 14);
			Panel4.add(lblNewLabel_32);
		}
		{
			lbGeneroCocodrilo = new JLabel("H");
			lbGeneroCocodrilo.setHorizontalAlignment(SwingConstants.CENTER);
			lbGeneroCocodrilo.setBounds(248, 98, 46, 14);
			Panel4.add(lbGeneroCocodrilo);
		}
		{
			lbGeneroRinoceronte = new JLabel("H");
			lbGeneroRinoceronte.setHorizontalAlignment(SwingConstants.CENTER);
			lbGeneroRinoceronte.setBounds(245, 123, 46, 14);
			Panel4.add(lbGeneroRinoceronte);
		}
		{
			lbGeneroHipopotamo = new JLabel("H");
			lbGeneroHipopotamo.setHorizontalAlignment(SwingConstants.CENTER);
			lbGeneroHipopotamo.setBounds(248, 148, 46, 14);
			Panel4.add(lbGeneroHipopotamo);
		}
		{
			lbGeneroElefante = new JLabel("M");
			lbGeneroElefante.setHorizontalAlignment(SwingConstants.CENTER);
			lbGeneroElefante.setBounds(245, 173, 46, 14);
			Panel4.add(lbGeneroElefante);
		}
		{
			lbGeneroJirafa = new JLabel("M");
			lbGeneroJirafa.setHorizontalAlignment(SwingConstants.CENTER);
			lbGeneroJirafa.setBounds(245, 198, 46, 14);
			Panel4.add(lbGeneroJirafa);
		}
		{
			lbGeneroCanguro = new JLabel("H");
			lbGeneroCanguro.setHorizontalAlignment(SwingConstants.CENTER);
			lbGeneroCanguro.setBounds(245, 223, 46, 14);
			Panel4.add(lbGeneroCanguro);
		}
		{
			lbGeneroMono = new JLabel("H");
			lbGeneroMono.setHorizontalAlignment(SwingConstants.CENTER);
			lbGeneroMono.setBounds(245, 248, 46, 14);
			Panel4.add(lbGeneroMono);
		}
		{
			lbGeneroTortuga = new JLabel("H");
			lbGeneroTortuga.setHorizontalAlignment(SwingConstants.CENTER);
			lbGeneroTortuga.setBounds(245, 273, 46, 14);
			Panel4.add(lbGeneroTortuga);
		}
		{
			lbGeneroTigre = new JLabel("H");
			lbGeneroTigre.setHorizontalAlignment(SwingConstants.CENTER);
			lbGeneroTigre.setBounds(245, 298, 46, 14);
			Panel4.add(lbGeneroTigre);
		}
		{
			lbGeneroOso = new JLabel("H");
			lbGeneroOso.setHorizontalAlignment(SwingConstants.CENTER);
			lbGeneroOso.setBounds(245, 323, 46, 14);
			Panel4.add(lbGeneroOso);
		}
		{
			lbGeneroAvestruz = new JLabel("H");
			lbGeneroAvestruz.setHorizontalAlignment(SwingConstants.CENTER);
			lbGeneroAvestruz.setBounds(245, 348, 46, 14);
			Panel4.add(lbGeneroAvestruz);
		}
		{
			lbGeneroPuercoespin = new JLabel("H");
			lbGeneroPuercoespin.setHorizontalAlignment(SwingConstants.CENTER);
			lbGeneroPuercoespin.setBounds(245, 373, 46, 14);
			Panel4.add(lbGeneroPuercoespin);
		}
		{
			txtpnNombres = new JTextPane();
			txtpnNombres.setText("NOMBRES");
			txtpnNombres.setBounds(10, 22, 58, 20);
			Panel4.add(txtpnNombres);
		}
		{
			txtpnEdad = new JTextPane();
			txtpnEdad.setText("    EDAD");
			txtpnEdad.setBounds(89, 22, 58, 20);
			Panel4.add(txtpnEdad);
		}
		{
			txtpnAltura = new JTextPane();
			txtpnAltura.setText("   ALTURA");
			txtpnAltura.setBounds(157, 22, 62, 20);
			Panel4.add(txtpnAltura);
		}
		{
			txtpnGenero = new JTextPane();
			txtpnGenero.setText("GENERO");
			txtpnGenero.setBounds(239, 22, 55, 20);
			Panel4.add(txtpnGenero);
		}
		{
			txtpnComportamientos = new JTextPane();
			txtpnComportamientos.setText("COMPORTAMIENTOS");
			txtpnComportamientos.setBounds(308, 22, 116, 20);
			Panel4.add(txtpnComportamientos);
		}
		{
			txtpnListadoDeAnimales = new JTextPane();
			txtpnListadoDeAnimales.setText("LISTADO DE ANIMALES");
			txtpnListadoDeAnimales.setBounds(157, 0, 124, 20);
			Panel4.add(txtpnListadoDeAnimales);
		}
		{
			btnNewButton = new JButton("SALIR");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					System.exit(0);
				}
			});
			btnNewButton.setBounds(163, 417, 89, 23);
			Panel4.add(btnNewButton);
		}
		
	}
}

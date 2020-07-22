package Servidor;
import javax.swing.*;
import java.net.*;

import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame implements Runnable {
	
	public MarcoServidor(){
		
		setBounds(1200,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		
		Thread mihilo=new Thread(this);
		
		mihilo.start();
		
		}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//System.out.println("Probando");
		
		try {
			ServerSocket servidor=new ServerSocket(3000);
			
			String nick, para, mensaje;
			
			PaqueteEnvio paquete_recibido;
			
			while(true) {
				
				//para aceptar cualquier conexion
			
			Socket misocket=servidor.accept();
			
			ObjectInputStream paquete_datos=new ObjectInputStream(misocket.getInputStream());
			
			paquete_recibido=(PaqueteEnvio) paquete_datos.readObject();
			
			nick=paquete_recibido.getNick();
			
			para=paquete_recibido.getPara();
			
			mensaje=paquete_recibido.getMensaje();
			
			areatexto.append("\n" + nick + ": " + mensaje + " para  " + para);
			
			misocket.close();
			}
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private	JTextArea areatexto;
		
			
	}

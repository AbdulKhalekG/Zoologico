package Servidor;
import javax.swing.*;
import java.awt.event.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.*;


public class Trabajadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoTrabajadores mimarco=new MarcoTrabajadores();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoTrabajadores extends JFrame{
	
	public MarcoTrabajadores(){
		
		setBounds(600,300,280,350);
				
		LaminaMarcoTrabajadores milamina=new LaminaMarcoTrabajadores();
		
		add(milamina);
		
		setVisible(true);
		}	
	
}

class LaminaMarcoTrabajadores extends JPanel{
	
	public LaminaMarcoTrabajadores(){
		
		nick=new JTextField(5);
		
		add(nick);
		
		para=new JTextField(8);
		
		add(para);
	
		JLabel texto=new JLabel("CHAT ZOO");
		
		add(texto);
		
		campochat=new JTextArea(12,20);
		
		add(campochat);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
		EnviarTexto mievento = new EnviarTexto();
		
		miboton.addActionListener(mievento);
		
		add(miboton);	
		
	}
	
	
	private class EnviarTexto implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			//System.out.println(campo1.getText());
			
			try {
				Socket misocket=new Socket("localhost", 3000);
				
				//Objeto
				
				PaqueteEnvio datos=new PaqueteEnvio();
				
				datos.setNick(nick.getText());
				
				datos.setPara(para.getText());
				
				datos.setMensaje(campo1.getText());
				
				//Creamos el flujo para enviar ese objeto por la red hacia el destinatario
				
				ObjectOutputStream paquete_datos=new ObjectOutputStream(misocket.getOutputStream());
				
				paquete_datos.writeObject(datos);
				
				misocket.close();
				
				
				
				
				/*DataOutputStream flujo_salida= new DataOutputStream(misocket.getOutputStream());
				
				flujo_salida.writeUTF(campo1.getText());
				
				flujo_salida.close();*/
				
				
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
			}
			
		}
		
		
	}
		
		
		
	private JTextField campo1, nick, para;
	
	private JTextArea campochat;
	
	private JButton miboton;
	
}

class PaqueteEnvio implements Serializable{
	
	private String nick, mensaje, para;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
	
}

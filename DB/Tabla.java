package DB;

import javax.swing.table.DefaultTableModel;

import 	java.sql.SQLException;

public class Tabla {
	

private DefaultTableModel modelo;


	public void llenartabla() {

		modelo=new  DefaultTableModel();   
		   String datos []= new String[6];
		   String sql="select * from animales";
		        try {
		        	DB.pstmt = DB.conn.prepareStatement(sql);
					DB.rs = DB.pstmt.executeQuery();
		            while(DB.rs.next())
		            {
		                datos[0]= DB.rs.getString("idanimal");
		                datos[1]= DB.rs.getString("nombre");
		                datos[2]= DB.rs.getString("edad");
		                datos[3]= DB.rs.getString("altura");
		                datos[4]= DB.rs.getString("genero");
		                datos[5]= DB.rs.getString("comportamiento");
		               
		                modelo.addRow(datos);
		            }
		            
	// 				tabla.setModel(modelo);
		        } catch (SQLException ex) {
		          
		        }
}

}

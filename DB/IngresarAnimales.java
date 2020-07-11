package DB;

import java.sql.SQLException;

public class IngresarAnimales {
	try {
    	String comportamiento;
		String genero;
		double altura;
		int edad;
		String nombre;
		int idanimal;
		
		String sql="insert into animal values('"+idanimal+"','"+nombre+"','"+edad+"','"+altura+"','"+genero+"','"+comportamiento+"')";
    	
    	DB.stmt = DB.conn.createStatement();
		DB.stmt.executeUpdate(sql);

    } catch (SQLException e) {
    
    	 System.out.print(e);
    	
    }
}
}



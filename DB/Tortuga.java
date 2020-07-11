package DB;
import ELZOOLOGICO.Animal;
import ELZOOLOGICO.Carnivoro;
import ELZOOLOGICO.Herviboro;
import ELZOOLOGICO.Omnivoro;

import java.sql.Statement;

public class Tortuga {
	
	private Tortuga to;
	private DB db;
	
	public Tortuga() {
		
		
		DB.getInstances();
		
		db.dbid("select * from animales where idanimal = '12' ");
		db.dbnombre("select * from animales where idanimal = '12' "); 
		db.dbedad("select * from animales where idanimal = '12' "); 
		db.dbaltura("select * from animales where idanimal = '12' "); 
		db.dbgenero("select * from animales where idanimal = '12' "); 
		db.dbcomportamiento("select * from animales where idanimal = '12' ");
	}
	
	public Tortuga getto() {
		return this.getto();
	}

}
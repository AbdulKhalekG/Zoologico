package DB;
import ELZOOLOGICO.Animal;
import ELZOOLOGICO.Carnivoro;
import ELZOOLOGICO.Herviboro;
import ELZOOLOGICO.Omnivoro;

import java.sql.Statement;

public class Hipopotamo {
	
	private Hipopotamo hi;
	private DB db;
	
	public Hipopotamo() {
		
		
		DB.getInstances();
		
		db.dbid("select * from animales where idanimal = '7' ");
		db.dbnombre("select * from animales where idanimal = '7' "); 
		db.dbedad("select * from animales where idanimal = '7' "); 
		db.dbaltura("select * from animales where idanimal = '7' "); 
		db.dbgenero("select * from animales where idanimal = '7' "); 
		db.dbcomportamiento("select * from animales where idanimal = '7' ");
	}
	
	public Hipopotamo gethi() {
		return this.gethi();
	}

}
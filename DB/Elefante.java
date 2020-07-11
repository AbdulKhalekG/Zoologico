package DB;
import ELZOOLOGICO.Animal;
import ELZOOLOGICO.Carnivoro;
import ELZOOLOGICO.Herviboro;
import ELZOOLOGICO.Omnivoro;

import java.sql.Statement;

public class Elefante {
	
	private Elefante el;
	private DB db;
	
	public Elefante() {
		
		
		DB.getInstances();
		
		db.dbid("select * from animales where idanimal = '8' ");
		db.dbnombre("select * from animales where idanimal = '8' "); 
		db.dbedad("select * from animales where idanimal = '8' "); 
		db.dbaltura("select * from animales where idanimal = '8' "); 
		db.dbgenero("select * from animales where idanimal = '8' "); 
		db.dbcomportamiento("select * from animales where idanimal = '8' ");
	}
	
	public Elefante getel() {
		return this.getel();
	}

}
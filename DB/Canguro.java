package DB;
import ELZOOLOGICO.Animal;
import ELZOOLOGICO.Carnivoro;
import ELZOOLOGICO.Herviboro;
import ELZOOLOGICO.Omnivoro;

import java.sql.Statement;

public class Canguro {
	
	private Canguro ca;
	private DB db;
	
	public Canguro() {
		
		
		DB.getInstances();
		
		db.dbid("select * from animales where idanimal = '10' ");
		db.dbnombre("select * from animales where idanimal = '10' "); 
		db.dbedad("select * from animales where idanimal = '10' "); 
		db.dbaltura("select * from animales where idanimal = '10' "); 
		db.dbgenero("select * from animales where idanimal = '10' "); 
		db.dbcomportamiento("select * from animales where idanimal = '10' ");
	}
	
	public Canguro getca() {
		return this.getca();
	}

}
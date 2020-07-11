package DB;
import ELZOOLOGICO.Animal;
import ELZOOLOGICO.Carnivoro;
import ELZOOLOGICO.Herviboro;
import ELZOOLOGICO.Omnivoro;

import java.sql.Statement;

public class Cocodrilo {
	
	private Cocodrilo co;
	private DB db;
	
	public Cocodrilo() {
		
		
		DB.getInstances();
		
		db.dbid("select * from animales where idanimal = '5' ");
		db.dbnombre("select * from animales where idanimal = '5' "); 
		db.dbedad("select * from animales where idanimal = '5' "); 
		db.dbaltura("select * from animales where idanimal = '5' "); 
		db.dbgenero("select * from animales where idanimal = '5' "); 
		db.dbcomportamiento("select * from animales where idanimal = '5' ");
	}
	
	public Cocodrilo getco() {
		return this.getco();
	}

}
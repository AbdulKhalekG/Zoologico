package DB;
import ELZOOLOGICO.Animal;
import ELZOOLOGICO.Carnivoro;
import ELZOOLOGICO.Herviboro;
import ELZOOLOGICO.Omnivoro;

import java.sql.Statement;

public class Tiburon {
	
	private Tiburon tib;
	private DB db;
	
	public Tiburon() {
		
		
		DB.getInstances();
		
		db.dbid("select * from animales where idanimal = '4' ");
		db.dbnombre("select * from animales where idanimal = '4' "); 
		db.dbedad("select * from animales where idanimal = '4' "); 
		db.dbaltura("select * from animales where idanimal = '4' "); 
		db.dbgenero("select * from animales where idanimal = '4' "); 
		db.dbcomportamiento("select * from animales where idanimal = '4' ");
	}
	
	public Tiburon gettib() {
		return this.gettib();
	}

}
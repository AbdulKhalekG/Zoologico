package DB;
import ELZOOLOGICO.Animal;
import ELZOOLOGICO.Carnivoro;
import ELZOOLOGICO.Herviboro;
import ELZOOLOGICO.Omnivoro;

import java.sql.Statement;

public class Mono {
	
	private Mono mo;
	private DB db;
	
	public Mono() {
		
		
		DB.getInstances();
		
		db.dbid("select * from animales where idanimal = '11' ");
		db.dbnombre("select * from animales where idanimal = '11' "); 
		db.dbedad("select * from animales where idanimal = '11' "); 
		db.dbaltura("select * from animales where idanimal = '11' "); 
		db.dbgenero("select * from animales where idanimal = '11' "); 
		db.dbcomportamiento("select * from animales where idanimal = '11' ");
	}
	
	public Mono getmo() {
		return this.getmo();
	}

}
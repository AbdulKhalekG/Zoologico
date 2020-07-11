package DB;
import ELZOOLOGICO.Animal;
import ELZOOLOGICO.Carnivoro;
import ELZOOLOGICO.Herviboro;
import ELZOOLOGICO.Omnivoro;

import java.sql.Statement;

public class Jirafa {
	
	private Jirafa ji;
	private DB db;
	
	public Jirafa() {
		
		
		DB.getInstances();
		
		db.dbid("select * from animales where idanimal = '9' ");
		db.dbnombre("select * from animales where idanimal = '9' "); 
		db.dbedad("select * from animales where idanimal = '9' "); 
		db.dbaltura("select * from animales where idanimal = '9' "); 
		db.dbgenero("select * from animales where idanimal = '9' "); 
		db.dbcomportamiento("select * from animales where idanimal = '9' ");
	}
	
	public Jirafa getji() {
		return this.getji();
	}

}
package DB;
import ELZOOLOGICO.Animal;
import ELZOOLOGICO.Carnivoro;
import ELZOOLOGICO.Herviboro;
import ELZOOLOGICO.Omnivoro;

import java.sql.Statement;

public class Rinoceronte {
	
	private Rinoceronte rin;
	private DB db;
	
	public Rinoceronte() {
		
		
		DB.getInstances();
		
		db.dbid("select * from animales where idanimal = '6' ");
		db.dbnombre("select * from animales where idanimal = '6' "); 
		db.dbedad("select * from animales where idanimal = '6' "); 
		db.dbaltura("select * from animales where idanimal = '6' "); 
		db.dbgenero("select * from animales where idanimal = '6' "); 
		db.dbcomportamiento("select * from animales where idanimal = '6' ");
	}
	
	public Rinoceronte getrin() {
		return this.getrin();
	}

}
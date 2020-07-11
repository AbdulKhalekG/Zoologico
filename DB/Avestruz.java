package DB;
import ELZOOLOGICO.Animal;
import ELZOOLOGICO.Carnivoro;
import ELZOOLOGICO.Herviboro;
import ELZOOLOGICO.Omnivoro;

import java.sql.Statement;

public class Avestruz {
	
	private Avestruz av;
	private DB db;
	
	public Avestruz() {
		
		
		DB.getInstances();
		
		db.dbid("select * from animales where idanimal = '14' ");
		db.dbnombre("select * from animales where idanimal = '14' "); 
		db.dbedad("select * from animales where idanimal = '14' "); 
		db.dbaltura("select * from animales where idanimal = '14' "); 
		db.dbgenero("select * from animales where idanimal = '14' "); 
		db.dbcomportamiento("select * from animales where idanimal = '14' ");
	}
	
	public Avestruz getav() {
		return this.getav();
	}

}
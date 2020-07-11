package DB;

import ELZOOLOGICO.Animal;
import ELZOOLOGICO.Carnivoro;
import ELZOOLOGICO.Herviboro;
import ELZOOLOGICO.Omnivoro;

import java.sql.Statement;

public class Tigre {
	
	private Tigre ti;
	private DB db;
	
	public Tigre() {
		
		
		DB.getInstances();
		
		db.dbid("select * from animales where idanimal = '1' ");
		db.dbnombre("select * from animales where idanimal = '1' "); 
		db.dbedad("select * from animales where idanimal = '1' "); 
		db.dbaltura("select * from animales where idanimal = '1' "); 
		db.dbgenero("select * from animales where idanimal = '1' "); 
		db.dbcomportamiento("select * from animales where idanimal = '1' ");
	}
	
	public Tigre getti() {
		return this.getti();
	}

}

package DB;

import ELZOOLOGICO.Animal;
import ELZOOLOGICO.Carnivoro;
import ELZOOLOGICO.Herviboro;
import ELZOOLOGICO.Omnivoro;

import java.sql.Statement;

public class Leon {
	
	private Leon Leon;
	private DB db;
	
	public Leon() {
		
		
		DB.getInstances();
		
		db.dbid("select * from animales where idanimal = '2' ");
		db.dbnombre("select * from animales where idanimal = '2' "); 
		db.dbedad("select * from animales where idanimal = '2' "); 
		db.dbaltura("select * from animales where idanimal = '2' "); 
		db.dbgenero("select * from animales where idanimal = '2' "); 
		db.dbcomportamiento("select * from animales where idanimal = '2' ");
	}
	
	public Tigre getle() {
		return this.getle();
	}

}
package DB;
import ELZOOLOGICO.Animal;
import ELZOOLOGICO.Carnivoro;
import ELZOOLOGICO.Herviboro;
import ELZOOLOGICO.Omnivoro;

import java.sql.Statement;

public class Pinguino {
	
	private Pinguino pin;
	private DB db;
	
	public Pinguino() {
		
		
		DB.getInstances();
		
		db.dbid("select * from animales where idanimal = '3' ");
		db.dbnombre("select * from animales where idanimal = '3' "); 
		db.dbedad("select * from animales where idanimal = '3' "); 
		db.dbaltura("select * from animales where idanimal = '3' "); 
		db.dbgenero("select * from animales where idanimal = '3' "); 
		db.dbcomportamiento("select * from animales where idanimal = '3' ");
	}
	
	public Pinguino getpin() {
		return this.getpin();
	}

}
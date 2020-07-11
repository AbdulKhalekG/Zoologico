package DB;
import ELZOOLOGICO.Animal;
import ELZOOLOGICO.Carnivoro;
import ELZOOLOGICO.Herviboro;
import ELZOOLOGICO.Omnivoro;

import java.sql.Statement;

public class Oso{
	
	private Oso os;
	private DB db;
	
	public Oso() {
		
		
		DB.getInstances();
		
		db.dbid("select * from animales where idanimal = '13' ");
		db.dbnombre("select * from animales where idanimal = '13' "); 
		db.dbedad("select * from animales where idanimal = '13' "); 
		db.dbaltura("select * from animales where idanimal = '13' "); 
		db.dbgenero("select * from animales where idanimal = '13' "); 
		db.dbcomportamiento("select * from animales where idanimal = '13' ");
	}
	
	public Oso getos() {
		return this.getos();
	}

}
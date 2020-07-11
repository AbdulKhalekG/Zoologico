package DB;
import ELZOOLOGICO.Animal;
import ELZOOLOGICO.Carnivoro;
import ELZOOLOGICO.Herviboro;
import ELZOOLOGICO.Omnivoro;

import java.sql.Statement;

public class Puercoespin {
	
	private Puercoespin pu;
	private DB db;
	
	public Puercoespin() {
		
		
		DB.getInstances();
		
		db.dbid("select * from animales where idanimal = '8' ");
		db.dbnombre("select * from animales where idanimal = '8' "); 
		db.dbedad("select * from animales where idanimal = '8' "); 
		db.dbaltura("select * from animales where idanimal = '8' "); 
		db.dbgenero("select * from animales where idanimal = '8' "); 
		db.dbcomportamiento("select * from animales where idanimal = '8' ");
	}
	
	public Puercoespin getpu() {
		return this.getpu();
	}

}
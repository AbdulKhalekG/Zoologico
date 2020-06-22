package ELZOOLOGICO;


public class Carnivoro extends Animal {
	public Carnivoro() {
		super();
	}
	public Carnivoro(int age, double height, String name, String genero) {
		super(age, height, name, genero);
	}
	
	public String toString() {
		return "Comportamientos: " + super.getComportamientos() + super.toString();
	}
	@Override
	public void mostrar() {
		System.out.println("\nNombre del Animal: " + getName() +  "\n" + "Edad del Animal: " + getAge() + "\n" + "Altura del Animal: " + getHeight() + "\n" +  "Genero del animal: " + getGenero() +  "\n");
		
	}

}
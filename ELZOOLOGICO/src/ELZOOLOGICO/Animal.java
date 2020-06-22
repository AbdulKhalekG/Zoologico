package ELZOOLOGICO;

import java.util.Scanner;

import interfaces.Comportamientos;


public abstract class Animal implements Comportamientos {
	public String name;
	public int age;
	public double height;
	public String genero;
	public String ComportamientosA;
	
	Scanner scanear = new Scanner(System.in);
	
	public Animal() {}
	
	public Animal (int age, double height, String name, String genero) {
		this.age = age;
		this.height = height;
		this.name = name;
		this.genero = genero;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
		
	}
	
	public double getHeight() {
		return height;
		
	}
	
	public void setHeight(double height) {
		this.height = height;
		
	}
	
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	// interface
	
	public void setComportamientos(String ComportamientosA) {
		this.ComportamientosA = ComportamientosA;
	}
	
	public String getComportamientos() {
		return ComportamientosA;
	}
	
	public String toString() {
		return "Nombre del Animal: " + getName() +  "\n" + "Edad del Animal: " + getAge() + "\n" + "Altura del Animal: " + getHeight() + "\n" +  "Genero del animal: " + getGenero() +  "\n";
		
	}
	
	public abstract void mostrar();

}
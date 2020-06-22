package ELZOOLOGICO;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		//ArrayList
		ArrayList <Animal> Animales = new ArrayList<Animal>();
		ArrayList <Carnivoro> Carnivoros = new ArrayList<Carnivoro>();
		ArrayList <Herviboro> Herviboro = new ArrayList<Herviboro>();
		ArrayList <Omnivoro> Omnivoros = new ArrayList<Omnivoro>();

		//Instancias
		
		Carnivoro c1 = new Carnivoro(7, 1.60, "Tigre", "H");
		c1.setComportamientos("Dormir\n");
		Carnivoro c2 = new Carnivoro(8, 1.85, "Leon", "M");
		c2.setComportamientos("Corriendo\n");
		Carnivoro c3 = new Carnivoro(3, 1, "Pinguino", "M");
		c3.setComportamientos("Caminar\n");
		Carnivoro c4 = new Carnivoro(8, 3.65, "Tiburon", "M");
		c4.setComportamientos("Nadar\n");
		Carnivoro c5 = new Carnivoro(5, 4.85, "Cocodrilo", "H");
		c5.setComportamientos("Cazar\n");
		Herviboro d1 = new Herviboro(5, 3.7, "Rinoceronte", "H");
		d1.setComportamientos("Comer\n");
		Herviboro d2 = new Herviboro(34, 3.9, "Hipopotamo", "H");
		d2.setComportamientos("Comer\n");
		Herviboro d3 = new Herviboro(7, 6.2, "Elefante", "M");
		d3.setComportamientos("Comer\n");
		Herviboro d4 = new Herviboro(4, 6.1, "Jirafa", "M");
		d4.setComportamientos("Correr\n");
		Herviboro d5 = new Herviboro(3, 2.7, "Canguro", "H");
		d5.setComportamientos("Saltar\n");
		Omnivoro e1 = new Omnivoro(5, 3.7, "Mono", "H");
		e1.setComportamientos("Escalando\n");
		Omnivoro e2 = new Omnivoro(34, 0.80, "Tortuga", "H");
		e2.setComportamientos("Quieto\n");
		Omnivoro e3 = new Omnivoro(7, 3.5, "Oso", "H");
		e3.setComportamientos("Mirando arriba\n");
		Omnivoro e4 = new Omnivoro(4, 1.4, "Avestruz", "H");
		e4.setComportamientos("Quieto\n");
		Omnivoro e5 = new Omnivoro(3, 0.53, "Puercoespin", "H");
		e5.setComportamientos("Caminando\n");
		
		//Agregando arraylist
	
		Carnivoros.add(c1);
		Carnivoros.add(c2);
		Carnivoros.add(c3);
		Carnivoros.add(c4);
		Carnivoros.add(c5);
		Herviboro.add(d1);
		Herviboro.add(d2);
		Herviboro.add(d3);
		Herviboro.add(d4);
		Herviboro.add(d5);
		Omnivoros.add(e1);
		Omnivoros.add(e2);
		Omnivoros.add(e3);
		Omnivoros.add(e4);
		Omnivoros.add(e5);
		
		Scanner scanear = new Scanner(System.in);
		String LNombre = "", LComportamientos = "", LGenero = "";
		int acceder, LEdad, LAltura;
		do {
			System.out.println("//Zoologico APP\\");
			System.out.println("1. MOSTRAR CARNIVOROS\n2. MOSTRAR HERVIBOROS\n3.MOSTRAR OMNIVOROS");
			System.out.println("4. AGREGAR UN NUEVO ANIMAL\n0.SALIR");
			acceder = scanear.nextInt();
			switch(acceder) {
			case 1:
				System.out.println(c1);
				System.out.println(c2);
				System.out.println(c3);
				System.out.println(c4);
				System.out.println(c5);
				break;
			case 2:
				System.out.println(d1);
				System.out.println(d2);
				System.out.println(d3);
				System.out.println(d4);
				System.out.println(d5);
				break;
			case 3:
				System.out.println(e1);
				System.out.println(e2);
				System.out.println(e3);
				System.out.println(e4);
				System.out.println(e5);
				break;
			case 4:
				Scanner Scanear = new Scanner(System.in);
				System.out.print("Edad: ");
				LEdad = Scanear.nextInt();
				System.out.print("Altura: ");
				LAltura = Scanear.nextInt();
				System.out.print("Nombre: ");
				LNombre = Scanear.nextLine();
				System.out.print("Genero del animal (H= Hembra, M= Macho): ");
				LGenero = Scanear.nextLine();
				System.out.println("\nEste pertenece a la especie: \n1. CARNIVOROS\n2.HERVIBOROS\n3.OMNIVOROS");
				acceder = scanear.nextInt();
				switch (acceder) {
				case 1:
					Carnivoro LCarnivoros = new Carnivoro(LEdad, LAltura, LGenero, LGenero);
					LCarnivoros.setComportamientos(LComportamientos);
					Carnivoros.add(LCarnivoros);
				case 2: 
					Herviboro LHerviboro = new Herviboro(LEdad, LAltura, LGenero, LGenero);
					LHerviboro.setComportamientos(LComportamientos);
					Herviboro.add(LHerviboro);
				case 3:
					Omnivoro LOmnivoros = new Omnivoro(LEdad, LAltura, LGenero, LGenero);
					LOmnivoros.setComportamientos(LComportamientos);
					Omnivoros.add(LOmnivoros);
				default:
					System.out.println("Invalidado");
					break;
				}
				System.out.println(LNombre + "Ya fue agregado a la lista de los animales \n");
				break;
			case 0:
				System.out.println("Cierra el programa");
				break;
				default:
					System.out.println("Invalidado");
					break;
				
			}
		}while (acceder != 0);
		scanear.close();
	}
}
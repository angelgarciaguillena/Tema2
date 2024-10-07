package boletin1;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la eleccion del primer jugador*/
		String eleccion1;
		
		/*Creamos una variable para almacenar la eleccion del segundo jugador*/
		String eleccion2;
		
		/*Creamos una variable que almacena la palabra piedra*/
		String PIEDRA = "Piedra";
		
		/*Creamos una variable que almacena la palabra papel*/
		String PAPEL = "Papel";
		
		/*Creamos una variable que almacena la palabra tijeras*/
		String TIJERAS = "Tijeras";
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al primer jugador que introduzca una de las tres opciones*/
		System.out.println("Introduzca su eleccion:");
		
		/*Lo leemos*/
		eleccion1 = sc.nextLine();
		
		/*Pedimos al segundo jugador que introduzca una de las tres opciones*/
		System.out.println("Introduzca su eleccion:");
		
		/*Lo leemos*/
		eleccion2 = sc.nextLine();
		
		/*Creamos la condicional para averiguar quien de los dos jugadores ha ganado*/
		if (eleccion1.equals(eleccion2)) {
			System.out.println("Empate");
		} else if (eleccion1.equals(PIEDRA) && eleccion2.equals(PAPEL)) {
			System.out.println("Jugador 2 gana");
		} else if (eleccion1.equals(PIEDRA) && eleccion2.equals(TIJERAS)) {
			System.out.println("Jugador 1 gana");
		} else if (eleccion1.equals(PAPEL) && eleccion2.equals(PIEDRA)) {
			System.out.println("Jugador 1 gana");
		} else if (eleccion1.equals(PAPEL) && eleccion2.equals(TIJERAS)) {
			System.out.println("Jugador 2 gana");
		} else if (eleccion1.equals(TIJERAS) && eleccion2.equals(PIEDRA)) {
			System.out.println("Jugador 2 gana");
		} else if (eleccion1.equals(TIJERAS) && eleccion2.equals(PAPEL)) {
			System.out.println("Jugador 1 gana");
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

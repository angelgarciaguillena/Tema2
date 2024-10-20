package boletin5;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la eleccion del primer jugador*/
		String eleccion1;
		
		/*Creamos una variable para almacenar la eleccion del segundo jugador*/
		String eleccion2;
		
		/*Creamos una variable para almacenar la eleccion de sguir jugando del usuario*/
		String eleccionFinal;
		
		/*Creamos una constante que almacena la palabra piedra*/
		final String PIEDRA = "Piedra";
		
		/*Creamos una constante que almacena la palabra papel*/
		final String PAPEL = "Papel";
		
		/*Creamos una constante que almacena la palabra tijeras*/
		final String TIJERAS = "Tijeras";
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle para seguir jugando mientras se indique la letra S al final de la partida*/
		do {
			/*Creamos un bucle do while para hacer que hasta que el jugador 1 no introduzca una de las opciones no pueda avanzar*/
			do {
				/*Pedimos al primer jugador que introduzca una de las tres opciones*/
				System.out.println("Introduzca su eleccion:");
			
				/*Leemos la eleccion del jugador 1*/
				eleccion1 = sc.nextLine();
				
			} while(!eleccion1.equalsIgnoreCase(TIJERAS) && !eleccion1.equalsIgnoreCase(PIEDRA) && !eleccion1.equalsIgnoreCase(PAPEL));
		
			/*Creamos un bucle do while para hacer que hasta que el jugador 2 no introduzca una de las opciones no pueda avanzar*/
			do {
				/*Pedimos al segundo jugador que introduzca una de las tres opciones*/
				System.out.println("Introduzca su eleccion:");
			
				/*Leemos la eleccion del jugador 2*/
				eleccion2 = sc.nextLine();
				
			} while(!eleccion2.equalsIgnoreCase(TIJERAS) && !eleccion2.equalsIgnoreCase(PIEDRA) && !eleccion2.equalsIgnoreCase(PAPEL));
		
			/*Creamos la condicional para averiguar quien de los dos jugadores ha ganado segun las reglas del juego*/
			if (eleccion1.equalsIgnoreCase(eleccion2)) {
				System.out.println("Empate");
			} else if (eleccion1.equalsIgnoreCase(PIEDRA) && eleccion2.equalsIgnoreCase(PAPEL)) {
				System.out.println("Jugador 2 gana");
			} else if (eleccion1.equalsIgnoreCase(PIEDRA) && eleccion2.equalsIgnoreCase(TIJERAS)) {
				System.out.println("Jugador 1 gana");
			} else if (eleccion1.equalsIgnoreCase(PAPEL) && eleccion2.equalsIgnoreCase(PIEDRA)) {
				System.out.println("Jugador 1 gana");
			} else if (eleccion1.equalsIgnoreCase(PAPEL) && eleccion2.equalsIgnoreCase(TIJERAS)) {
				System.out.println("Jugador 2 gana");
			} else if (eleccion1.equalsIgnoreCase(TIJERAS) && eleccion2.equalsIgnoreCase(PIEDRA)) {
				System.out.println("Jugador 2 gana");
			} else if (eleccion1.equalsIgnoreCase(TIJERAS) && eleccion2.equalsIgnoreCase(PAPEL)) {
				System.out.println("Jugador 1 gana");
			}
			
			/*Preguntamos al usuario si desea seguir jugando"*/
			System.out.println("¿Deseas seguir jugando?");
			
			/*Leemos la eleccion de seguir jugando del usuario*/
			eleccionFinal = sc.nextLine();
			
		} while (eleccionFinal.equalsIgnoreCase("S"));
		
		/*Cerramos el Scanner*/
		sc.close();
		
	}
}

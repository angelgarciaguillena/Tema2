package boletin5;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero de la tirada 1*/
		String numero1;
		
		/*Creamos una variable para almacenar el numero de la tirada 2*/
		String numero2;
		
		/*Creamos una variable para almacenar el numero de la tirada 1 ya transformado en numero*/
		int tirada1;
		
		/*Creamos una variable para almacenar el numero de la tirada 2 ya transformado en numero*/
		int tirada2;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle do while para que si el usuario ha introducido una respuesta incorrecta la tenga que volver a introducir hasta que de un valor correcto a la tirada 1*/
		do {
			/*Pedimos al usuario que introduzca el resultado de la primera tirada*/
			System.out.println("Introduce el primer numero:");
			
			/*Leemos el primer numero del usuario*/
			numero1 = sc.nextLine();
			
			/*Creamos un switch para transformar el primer numero introducido en palabras y poder operar con el y un default para mostrar al usuario que introducio un valor incorrecto*/
			tirada1 = switch(numero1.toUpperCase()) {
			case "UNO" -> {
				yield 1;
			}
		
			case "DOS" -> {
				yield 2;
			}
		
			case "TRES" -> {
				yield 3;
			}
		
			case "CUATRO" -> {
				yield 4;	
			}
		
			case "CINCO" -> {
				yield 5;
			}
		
			case "SEIS" -> {
				yield 6;	
			}
			
			default -> {
				System.out.println("Opcion incorrecta");
				yield -1;
			}
		
			};
		} while(!numero1.equalsIgnoreCase("UNO") && !numero1.equalsIgnoreCase("DOS") && !numero1.equalsIgnoreCase("TRES") && !numero1.equalsIgnoreCase("CUATRO") && !numero1.equalsIgnoreCase("CINCO") && !numero1.equalsIgnoreCase("SEIS"));
		
		/*Creamos un bucle do while para que si el usuario ha introducido una respuesta incorrecta la tenga que volver a introducir hasta que de un valor correcto a la tirada 2*/
		do {
			/*Pedimos al usuario que introduzca el resultado de la segunda tirada*/
			System.out.println("Introduce el segundo numero:");
			
			/*Leemos el segundo numero del usuario*/
			numero2 = sc.nextLine();
			
			/*Creamos un switch para transformar el primer numero introducido en palabras y poder operar con el y un default para mostrar al usuario que introducio un valor incorrecto*/
			tirada2 = switch(numero2.toUpperCase()) {
			case "UNO" -> {
				yield 1;
			}
		
			case "DOS" -> {
				yield 2;
			}
		
			case "TRES" -> {
				yield 3;
			}
			
			case "CUATRO" -> {
				yield 4;	
			}
		
			case "CINCO" -> {
				yield 5;
			}
		
			case "SEIS" -> {
				yield 6;	
			}
			
			default -> {
				System.out.println("Opcion incorrecta");
				yield -1;
			}
		
			};
		} while(!numero2.equalsIgnoreCase("UNO") && !numero2.equalsIgnoreCase("DOS") && !numero2.equalsIgnoreCase("TRES") && !numero2.equalsIgnoreCase("CUATRO") && !numero2.equalsIgnoreCase("CINCO") && !numero2.equalsIgnoreCase("SEIS"));
		
		/*Mostramos al usuario el resultado de la suma de las dos tiradas*/
		System.out.println("El resultado de la suma de los dos digitos de las dos tiradas es: " + (tirada1 + tirada2));
		
		/*Cerramos el Scanner*/
		sc.close();
	
	}
}

package boletin2;

import java.util.Scanner;

public class Ejercicio4 {
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
		
		/*Pedimos al usuario que introduzca el resultado de la primera tirada*/
		System.out.println("Introduce el primer numero:");
		
		/*Lo leemos*/
		numero1 = sc.nextLine();
		
		/*Pedimos al usuario que introduzca el resultado de la segunda tirada*/
		System.out.println("Introduce el segundo numero:");
		
		/*Lo leemos*/
		numero2 = sc.nextLine();
		
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
		
		/*Mostramos al usuario el resultado de la suma de las dos tiradas*/
		System.out.println("El resultado de la suma de los dos digitos de las dos tiradas es: " + (tirada1 + tirada2));
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

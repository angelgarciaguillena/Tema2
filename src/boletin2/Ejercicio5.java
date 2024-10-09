package boletin2;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la letra del tipo de carnet del usuario*/
		String letra;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca la letra de su carnet de conducir*/
		System.out.println("Introduce la letra de su carnet:");
		
		/*Lo leemos*/
		letra = sc.next();
		
		/*Creamos un switch para saber el tipo de vehiculo que corresponde la letra y un default por si introduce una respuesta incorrecta*/
		switch(letra.toUpperCase()) {
		case "E" ->
			System.out.println("Remolques");
		case "D" ->
			System.out.println("Autobuses");
		case "C1","C2","C3","C4","C5" ->
			System.out.println("Camiones");
		case "A" ->
			System.out.println("Motocicletas");
		case "B1","B2" ->
			System.out.println("Automoviles");
		default ->
			System.out.println("Categoria no contemplada");
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

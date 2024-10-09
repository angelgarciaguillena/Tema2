package boletin2;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		/*Creo una variable para almacenar la nota del usuario*/
		int nota;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca su nota*/
		System.out.println("Introduce tu nota:");
		
		/*Lo leemos*/
		nota = sc.nextInt();
		
		/*Creamos un switch para saber la calificacion del usuario y un default para que le avise si introduce una nota incorrecta*/ 
		switch(nota) {
		case 0,1,2,3,4 -> 
			System.out.println("Insuficiente");
		case 5 ->
			System.out.println("Suficiente");
		case 6 ->
			System.out.println("Bien");
		case 7,8 ->
			System.out.println("Notable");
		case 9,10 ->
			System.out.println("Sobresaliente");
		default ->
			System.out.println("Nota incorrecta");
		}
		
		
	
		/*Cerramos el Scanner*/
		sc.close();
	}
}

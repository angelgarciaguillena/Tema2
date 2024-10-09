package boletin2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero del usuario*/
		int dia;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero:");
		
		/*Lo leemos*/
		dia = sc.nextInt();
		
		/*Creamos un switch para saber el dia de la semana y un default por si introduce un numero incorrecto*/
		switch(dia) {
		case 1 ->
			System.out.println("Es lunes");
		case 2 ->
			System.out.println("Es martes");
		case 3 ->
			System.out.println("Es miercoles");
		case 4 ->
			System.out.println("Es jueves");
		case 5 ->
			System.out.println("Es viernes");
		case 6 ->
			System.out.println("Es sabado");
		case 7 ->
			System.out.println("Es domingo");
		default ->
			System.out.println("Numero incorrecto");
		}
	
		/*Cerramos el Scanner*/
		sc.close();
	}
}

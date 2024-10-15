package boletin3;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		/*Pedir al usuario el número de un mes y el año (comprobando si es o no bisiesto). Debe imprimir por pantalla el número de días que tiene el mes.*/
		
		/*Creamos una variable para acumular el mes*/
		int mes;
		
		/*Creamos una variable para acumular el año*/
		int año;
		
		/*Creamos una variable para acumular el numero de dias que tiene el mes*/
		int dias;
		
		/*Creamos una variable para saber si el año es bisiesto*/
		boolean bisiesto;

		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca el mes*/
		System.out.println("Introduce el mes:");
		
		/*Lo leemos*/
		mes = sc.nextInt();
		
		/*Pedimos al usuario que introduzca el año*/
		System.out.println("Introduce el año:");
		
		/*Lo leemos*/
		año = sc.nextInt();
		
		/*Creamos un ternario para saber si el año es bisiesto o no*/
		bisiesto = año % 4 == 0 && año % 100 != 0 || año % 400 == 0;
		
		/*Creamos un switch para saber el numero de dias que tiene el mes indicado por el usuario y un default por si introdujo un valor no valido*/
		switch(mes) {
		case 1,3,5,7,8,10,12 -> {
			dias = 31;
			System.out.println("El mes introducido tiene " + dias + " dias");
			}
		case 4,6,9,11 -> {
			dias = 30;
			System.out.println("El mes introducido tiene " + dias + " dias");
			}
		case 2 -> {
			System.out.println ("El mes introducido tiene " + (dias = bisiesto ? 29 : 28) + " dias");
			}
		default -> {
			System.out.println("Mes incorrecto");
			}
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

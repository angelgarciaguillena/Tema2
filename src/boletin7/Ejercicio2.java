package boletin7;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*Realiza un programa que nos pida un número n y nos diga cuántos números hay entre 1 y n que sean primos.*/
		
		/*Creamos una variable para almacenar el numero del usuario*/
		int numeroUsuario;
		
		/*Creamos una variable que indique si el numero es primo o no*/
		boolean division;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero:");
		
		/*Leemos el numero del usuario*/
		numeroUsuario = sc.nextInt();
		

		/*Creamos un bucle for inicializando una variable como contador y hasta que la variable no 
		sea mayor que el numero introducido se va a repetir y le voy sumando 1*/
		for (int i = 2 ; i <= numeroUsuario ; i++) {
			
				division = true;
			
			/*Creamos un bucle for inicializando una variable que almacene cada numero hasta llegar al numero del usuario
			y cada vez se va sumando uno mas al numero*/
			for (int j = 2; j < i ; j++) {
				
				/*Si el resto de la variable i entre la variable j es igual a 
				0 la variable sera false y no sera primo*/
				if (i % j == 0) {
					division = false;
					j = numeroUsuario;
					
				}				
			}
			
			/*Mostramos el resultado al usuario, si division es true el numero sera primo pero sino se cumple el numero no es primo*/
			System.out.println(division == true ? "El numero " + i + " introducido es primo" : "El numero " + i + " introducido no es primo");
		
		}
			
		/*Cerramos el Scanner*/
		sc.close();
		
		
	}
}

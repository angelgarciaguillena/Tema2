package boletin3;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		/*Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. 
		  La aplicación tendrá que indicar si el número introducido es capicúa. Un número es 
		  capicúa si se lee igual de izquierda a derecha que de derecha a izquierda.*/
		
		/*Creo una variable para acumular el numero introducido por el usuario*/
		int numero;
		
		/*Creo una variable para acumular las unidades del numero del usuario*/
		int unidades;
		
		/*Creo una variable para acumular las decenas del numero del usuario*/
		int decenas;
		
		/*Creo una variable para acumular la tercera cifra del numero del usuario*/
		int centenas;
		
		/*Creo una variable para acumular los millares del numero del usuario*/
		int millares;

		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero:");
		
		/*Lo leemos*/
		numero = sc.nextInt();
		
		/*Creamos una condicional para ver si el numero es capicua o no*/	
		if(numero >= 0 && numero <= 9999) {
			if (numero >= 0 && numero < 10) {
				System.out.println("El numero es capicua");
			} else if (numero >= 10 && numero < 100) {
				unidades = numero % 10;
				decenas = (numero / 10) % 10;
				System.out.println(unidades == decenas ? "El numero es capicua" : "El numero no es capicua" );
			} else if (numero >= 100 && numero < 1000){
				unidades = numero % 10;
				centenas = (numero / 100) % 10;
				System.out.println(unidades == centenas  ? "El numero es capicua" : "El numero no es capicua" );
			} else if (numero >= 1000 && numero <= 9999) {
				unidades = numero % 10;
				decenas = (numero / 10) % 10;
				centenas = (numero / 100) % 10;
				millares = (numero / 1000) % 10;
				System.out.println(unidades == millares && centenas == decenas ? "El numero es capicua" : "El numero no es capicua" );
			}
		} else {
			System.out.println("El numero introducido no esta dentro del rango");
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

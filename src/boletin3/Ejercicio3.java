package boletin3;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		/*Diseña una aplicación en la que, dado un número de DNI, calcule la letra que le corresponde. 
		  Observa que un número de 8 dígitos está dentro del rango del tipo int.*/
		
		/*Creamos ujna variable para almacenar el DNI*/
		int dni;
		
		/*Creamos una variable para alamcenar la posicion de la letra*/
		int posicion;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca el DNI*/
		System.out.println("Introduce el DNI:");
		
		/*Lo leemos*/
		dni = sc.nextInt();
		
		/*Calculamos la posicion de la letra del DNI*/
		posicion = dni % 23;
		
		/*Creamos una condicional para saber si el numero introducido tiene 8 cifras y en caso de no tener las cifras se le notificara al usuario*/
		if (dni <= 99999999) {
			System.out.println("DNI correcto");
			/*Creamos un switch para identificar la letra segun su posicion*/
			switch(posicion) {
			case 0 -> 
				System.out.println("Su letra del DNI es la T");
			case 1 -> 
				System.out.println("Su letra del DNI es la R");
			case 2 -> 
				System.out.println("Su letra del DNI es la W");
			case 3 -> 
				System.out.println("Su letra del DNI es la A");
			case 4 -> 
				System.out.println("Su letra del DNI es la G");
			case 5 -> 
				System.out.println("Su letra del DNI es la M");
			case 6 -> 
				System.out.println("Su letra del DNI es la Y");
			case 7 -> 
				System.out.println("Su letra del DNI es la F");
			case 8 -> 
				System.out.println("Su letra del DNI es la P");
			case 9 -> 
				System.out.println("Su letra del DNI es la D");
			case 10 -> 
				System.out.println("Su letra del DNI es la X");
			case 11 -> 
				System.out.println("Su letra del DNI es la B");
			case 12 -> 
				System.out.println("Su letra del DNI es la N");
			case 13 -> 
				System.out.println("Su letra del DNI es la J");
			case 14 -> 
				System.out.println("Su letra del DNI es la Z");
			case 15 -> 
				System.out.println("Su letra del DNI es la S");
			case 16 -> 
				System.out.println("Su letra del DNI es la Q");
			case 17 -> 
				System.out.println("Su letra del DNI es la V");
			case 18 -> 
				System.out.println("Su letra del DNI es la H");
			case 19 -> 
				System.out.println("Su letra del DNI es la L");
			case 20 -> 
				System.out.println("Su letra del DNI es la C");
			case 21 -> 
				System.out.println("Su letra del DNI es la K");
			case 22 -> 
				System.out.println("Su letra del DNI es la E");
			}
		} else {
			System.out.println("DNI incorrecto");
		}
			
		/*Cerramos el Scanner*/
		sc.close();
	}
}

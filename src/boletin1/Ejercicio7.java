package boletin1;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero del usuario*/
		int numero;
		
		/*Creamos una variable para almacenar el numero de cifras*/
		int cifras;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero:");
		
		/*Lo leemos*/
		numero = sc.nextInt();
		
		/*Creamos una condicion para indicar las cifras que tiene el numero*/
		if (numero <= 99999 && numero >= 0){
			if (numero < 10 && numero >= 0) {
				cifras = 1;
				System.out.println("El numero tiene " + cifras + " cifras");
			} else if (numero >= 10 && numero < 100) {
				cifras = 2;
				System.out.println("El numero tiene " + cifras + " cifras");
			} else if (numero >= 100 && numero < 1000) {
				cifras = 3;
				System.out.println("El numero tiene " + cifras + " cifras");
			} else if (numero >= 1000 && numero < 10000) {
				cifras = 4;
				System.out.println("El numero tiene " + cifras + " cifras");
			} else if (numero >= 10000 && numero <= 99999) {
				cifras = 5;
				System.out.println("El numero tiene " + cifras + " cifras");
			}
		} else {
			System.out.println("El numero introducido no se encuentra entre el 0 y el 99999");
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

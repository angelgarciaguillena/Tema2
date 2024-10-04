package boletin1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero decimal*/
		double num;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero");
		
		/*Lo leemos*/
		num = sc.nextDouble();
		
		/*Averiguamos si el numero es casi cero*/
		if (num >= 1 || num <= -1 || num == 0) {
			System.out.println("El numero no es un casi cero");
		} else {
			System.out.println("El numero es un casi cero");
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

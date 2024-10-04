package boletin1;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*Creamos la variable para acumular el primer numero*/
		int num1;
		
		/*Creamos la variable para acumular el primer numero*/
		int num2;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero:");
		
		/*Lo leemos*/
		num1 = sc.nextInt();
		
		/*Pedimos al usuario que introduzca otro numero*/
		System.out.println("Introduce un numero:");
		
		/*Lo leemos*/
		num2 = sc.nextInt();
		
		/*Averiguamos si son iguales o no*/
		if (num1 == num2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

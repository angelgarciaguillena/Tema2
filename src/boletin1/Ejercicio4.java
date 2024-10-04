package boletin1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		/*Creamos una variable pàra almacenar un numero*/
		double num1;
		
		/*Creamos una variable pàra almacenar otro numero*/
		double num2;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero:");
		
		/*Lo leemos*/
		num1 = sc.nextDouble();
		
		/*Pedimos al usuario que introduzca otro numero*/
		System.out.println("Introduce otro numero:");
		
		/*Lo leemos*/
		num2 = sc.nextDouble();
		
		/*Hacemos que el programa lea de menor a mayor los numeros introducidos*/
		if (num1 > num2) {
			System.out.println(num2 + " < " + num1);
		} else {
			System.out.println(num1 + " < " + num2);
		}
		
		/*Cerramos el Scanner*/
		sc.close();
		
	}
}

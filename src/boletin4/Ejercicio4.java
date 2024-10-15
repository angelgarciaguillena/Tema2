package boletin4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar los numeros*/
		int numero;
		
		/*Creamos una variable para almacenar la suma de los numeros*/
		int suma;
		
		/*Creamos una variable para almacenar la media*/
		int media;
		
		/*Creamos una variable que servira como contador*/
		int contador;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca el primer numero*/
		System.out.println("introduce el primer numero:");
		
		/*Lo leemos*/
		numero = sc.nextInt();
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

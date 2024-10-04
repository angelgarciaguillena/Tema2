package boletin1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		/*Creamos la variable para almacenar el numero*/
		int numero;
		
		/*Creamos el Scaner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero:");
		
		/*Lo leemos*/
		numero = sc.nextInt();
		
		/*Averiguamos si es par o impar y mostramos el resultado*/
		if (numero % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

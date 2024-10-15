package boletin4;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*Creamos una variable para acumular el numero*/
		int numero = 0;
		
		/*Creamos una variable que servira como contador de numeros*/
		int contador = 0;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero:");
		
		/*Lo leemos*/
		numero = sc.nextInt();
		
		/*Creamos un bucle para que el contador vaya sumando de uno en uno*/
		while(numero >= 0) {
			
			/*Vamos sumando uno a la variable del contador*/
			contador++;
			
			/*Volvemos a pedir otro numero al usuario*/
			System.out.println("Introduce otro numero");
			
			/*Lo leemos*/
			numero = sc.nextInt();
		}
		/*Mostramos al usuario que finalizo el programa y imprimimos el resultado del contador*/
		System.out.println("Programa finalizado");
		System.out.println("Numeros introducidos: " + contador);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

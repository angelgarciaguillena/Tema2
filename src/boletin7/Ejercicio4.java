package boletin7;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		/*De forma similar a la actividad 4, realiza un programa que calcule el mínimo común múltiplo de dos números dados. En este caso, 
		 * habrá que partir del máximo de los dos e ir incrementando hasta encontrar el primer número que sea múltiplo de los dos números.
		 */
		
		/*Creamos una variable para almacenar el primer numero*/
		int numero1;
		
		/*Creamos una variable para almacenar el segundo numero*/
		int numero2;
		
		/*Creamos una variable que almacena el numero mayor de los dos numeros introducidos por el usuario*/
		int mayor = 0;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca el primer numero*/
		System.out.println("Introduce el primer numero:");
		
		/*Leemos el primer numero del usuario*/
		numero1 = sc.nextInt();
		
		/*Pedimos al usuario que introduzca el segundo numero*/
		System.out.println("Introduce el segundo numero:");
		
		/*Leemos el segundo numero del usuario*/
		numero2 = sc.nextInt();
		
		/*Si el numero 1 es mayor al numero 2 el numero mayor es igual al numero 1 sino el numero mayor sera el numero 2*/
		if(numero1 > numero2) {
			mayor = numero1;
		} else {
			mayor = numero2;
		}
		
		/*Creamos un bucle for para buscar el numero de forma creciente que sea multiplo de ambos numeros*/
		for(int i = mayor ; ; i++) {
			
			/*Si el resto del numero 1 entre el mayor de ambos numeros es igual a 0 y el numero 2 entre el mayor de ambos numeros es igual a 0*/
			if(i % numero1 == 0 && i % numero2 == 0) {
				mayor = i;
				break;
			}
		}

		/*Mostramos el resultado al usuario*/
		System.out.println("El minimo comun multiplo es " + mayor);
		
		/*Cerramos el Scanner*/
		sc.close();

	}
}
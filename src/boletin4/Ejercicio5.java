package boletin4;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero introducido por el usuario*/
		int numero;
		
		/*Creamos una variable para almacenar la suma*/
		int suma = 0;
		
		/*Creamos una variable que sirva como contador para los numeros introducidos*/
		int contador = 0;
		
		/*Creamos una variable que sirva como contador para los mayores de 18 años*/
		int contadorMayores = 0;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca las edades*/
		System.out.println("Introduce tu edad:");
		
		/*Lo leemos*/
		numero = sc.nextInt();
		
		/*Creamos un bucle para que se introduzcan numeros hasta que salga uno negativo*/
		while (numero >= 0) {
			
			/*Hacemos que el contador vaya sumando los numeros*/
			contador++;
			
			/*Hacemos que los numeros se vayan sumando*/
			suma = suma + numero;
			
			/*Si los alumnos son mayores de 18 se cuentan en otro contador*/
			if(numero >= 18) {
				contadorMayores++;				
			}
			
			/*Pedimos al usuario que introduzca las edades*/
			System.out.println("Introduce tu edad:");
			
			/*Lo leemos*/
			numero = sc.nextInt();
			
		}
		
		/*Mostramos la suma de las edades introducidas*/
		System.out.println("La suma de las edades es " + suma);
		
		/*Mostramos la media de las edades introducidas*/
		System.out.println("La media de los numeros es " + (double) (suma / contador));
		
		/*Mostramos la cantidad de alumnos que ha introducido su edad*/
		System.out.println("El numero de alumnos en el centro es " + contador);
				
		/*Mostramos la cantidad de alumnos que hay mayores de edad*/
		System.out.println("El numero de alumnos mayores de edad en el centro son " + contadorMayores);
		
		/*Cerramos el Scanner*/
		sc.close();
		
	}
}

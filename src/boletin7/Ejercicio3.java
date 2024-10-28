package boletin7;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		/*Para dos números dados, a y b, es posible calcular el máximo común divisor (el número más grande que divide a ambos) mediante un algoritmo ineficiente pero sencillo: 
		 * desde el menor de a y b, ir buscando, de forma decreciente (-1), el primer número que divide a ambos simultáneamente. Teniendo en cuenta lo que se acaba de explicar, 
		 * realiza un programa que calcule el máximo común divisor de dos números.*/
	
		/*Creamos una variable para almacenar el primer numero*/
		int numero1;
		
		/*Creamos una variable para almacenar el segundo numero*/
		int numero2;
		
		/*Creamos una variable que almacena el numero menor de los dos numeros introducidos por el usuario*/
		int menor;
		
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
		
		/*Si el numero 1 es mayor al numero 2 el numero menor es igual al numero 2 sino el numero menor sera el numero 1*/
		if(numero1 > numero2) {
			menor = numero2;
		} else {
			menor = numero1;
		}
		
		/*Creamos un bucle for para buscar el numero de forma decreciente que divida a ambos numeros por igual*/
		for(int i = menor ; i >= 1; i--) {
			
			/*Si el resto del numero 1 entre el menor de ambos numeros es igual a 0 y el numero 2 entre el menor de ambos numeros es igual a 0*/
			if(numero1 % i == 0 && numero2 % i == 0) {
				menor = i;
				break;
			}
		}
		
		/*Mostramos el resultado al usuario*/
		System.out.println("El máximo común divisor es " + menor);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}
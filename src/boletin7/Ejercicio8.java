package boletin7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		/*Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último dado. La introducción de números finaliza con la introducción de un 0. 
		 * Al final se mostrará:
		 * 	-El total de números introducidos, excluido el 0.
		 *	-El total de números fallados.
		 */
		
		/*Creamos una variable para almacenar el numero del usuario*/
		int numero = 0;
		
		/*Creamos una variable para almacenar el numero anterior*/
		int anterior = 0;
		
		/*Creamos una variable que nos servira como contador para los numeros introducidos*/
		int total = 1;
		
		/*Creamos una variable que nos servira como contador para los numeros fallados*/
		int fallos = 0;
		
		/*Creamos una variable para almacenar el error*/
		boolean error = false;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos una alerta por si el usuario introduce un numero que no sea entero*/
		try {
			/*Pedimos un numero al usuario*/
			System.out.println("Introduce un numero inicial:");
			
			/*Leemos el numero del usuario*/
			numero = sc.nextInt();
			error = false;
		} catch(InputMismatchException e) {
			
			/*Mostramos el mensaje de error al usuario*/
			System.err.println("Error: El numero introducido no es entero");
			error = true;
		}
		
		/*Añadimos un assert para que el usuario no introduzca numeros negativos*/
		assert numero >= 0 : "Error: El numero introducido es negativo";
		error = true;
		
		/*Creamos un bucle while para repetir al usuario que introduzca un numero mientras sea mayor al anterior*/
		while(numero > 0 && error == false) {
			
			/*Creamos un if que indica que si el numero es menor al anterior notificar al usuario y sumar 1 a los fallos y sino sumar 1 a los numeros totales introducidos*/
			if(numero < anterior) {
				System.out.println("El numero es menor al anterior");
				fallos++;
			} else {
				total++;
			}
			
			/*Almacenamos el numero anterior en una variable*/
			anterior = numero;
			
			/*Creamos una alerta por si el usuario introduce un numero que no sea entero*/
			try {
				/*Pedimos un numero al usuario de nuevo*/
				System.out.println("Introduce un numero:");
				
				/*Leemos el numero del usuario*/
				numero = sc.nextInt();
				error = false;
			} catch(InputMismatchException e) {
				
				/*Mostramos el mensaje de error al usuario*/
				System.err.println("Error: El numero introducido no es entero");
				error = true;
			}
			
			/*Añadimos un assert para que el usuario no introduzca numeros negativos*/
			assert numero >= 0 : "Error: El numero introducido es negativo";
			error = true;
		}
		
		/*Mostramos al usuario el total de numeros introducidos y si el primer numero es 0 que el contador se ponga en 0 ya que ese valor no se tiene en cuenta*/
		System.out.println(numero == 0 ? "El total de numeros introducidos es " + (total-1) :"El total de numeros introducidos es " + total);
			
		/*Mostramos al usuario el total de numeros fallados*/
		System.out.println("El total de numeros fallados es " + fallos);
		
	
		/*Cerramos el Scanner*/
		sc.close();
	}
}
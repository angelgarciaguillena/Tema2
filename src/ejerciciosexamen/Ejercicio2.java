package ejerciciosexamen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero del usuario*/
		int numero = 0;
		
		/*Creamos una variable para almacenar las cifras del numero*/
		int cifra = 0;
		
		/*Creamos una variable que servira como contador para almacenar el numero de cifras par*/
		int contadorPar = 0;
		
		/*Creamos una variable que servira como contador para almacenar el numero de cifras impar*/
		int contadorImpar = 0;
		
		/*Creamos una variable para almacenar el error*/
		boolean error = false;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle do while para hacer que el usuario tenga que introducir el numero de nuevo mientras de error*/
		do {
			/*Creamos un try catch para notificar al usuario del error que ha cometido*/
			try {
				/*Pedimos al usuario que introduzca un numero*/
				System.out.println("Introduce un numero mayor o igual que 0:");
				
				/*Leemos el numero del usuario*/
				numero = sc.nextInt();
				
				/*Creamos un assert para notificar al usuario*/
				assert numero >= 0 : "Error: El numero introducido es negativo";
				error = false;
				
			/*Notificamos al usuario si el numero introducido no es entero*/
			} catch(InputMismatchException e) {
				System.err.println("Error: El numero introducido no es entero");
				sc.nextLine();
				error = true;
				
			/*Notificamos al usuario si el numero introducido es negativo*/
			} catch(AssertionError e) {
				System.err.println(e.getMessage());
				error = true;
			}
		} while(error);
		
		/*Creamos un bucle while para que mientras que el numero sea mayor a 0 se repita*/
		while(numero > 0) {
			/*Vamos comprobando cifra a cifra si es par o impar*/
			cifra = numero % 10;
			
			/*Si el resto de la cifra entre 2 es 0 la cifra es par sino es impar*/
			if(cifra % 2 == 0) {
				contadorPar++;
			} else {
				contadorImpar++;
			}
			
			/*Actualizamos la variable numero para eliminar la cifra que ya se ha revisado*/
			numero = numero / 10;
		}
		
		/*Mostramos al usuario la respuesta del programa*/
		System.out.println("El numero de cifras impar es " + contadorImpar);
		System.out.println("El numero de cifras par es " + contadorPar);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}
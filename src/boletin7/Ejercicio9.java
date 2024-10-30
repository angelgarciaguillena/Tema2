package boletin7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {

		/*
		 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
		 * por teclado. El número introducido debe ser mayor que 0.
		 */

		/* Creamos una variable para almacenar el numero del usuario */
		int numero = 0;

		/* Creamos una variable que nos servira como contador de cifras */
		int contador = 1;

		/* Creamos una variable para almacenar el error */
		boolean error = false;

		/* Creamos un Scanner */
		Scanner sc = new Scanner(System.in);

		/*
		 * Creamos un bucle do while para que repita el numero hasta que introduzca uno
		 * correcto
		 */
		do {
			/*
			 * Creamos una alerta para avisar al usuario en caso de que el numero que
			 * introduce no sea entero
			 */
			try {
				/* Pedimos un numero al usuario */
				System.out.println("Introduce un numero:");

				/* Leemos el numero del usuario */
				numero = sc.nextInt();

				/*
				 * Añadimos un assert para notificar al usuario si introduzce numeros negativos
				 */
				assert numero >= 0 : "Error: El numero introducido es negativo";
				error = false;

			} catch (AssertionError e) {
				System.err.println(e.getMessage());
				error = true;
				
			} catch (InputMismatchException e) {
				/* Mostramos el mensaje de error al usuario */
				System.err.println("Error: El numero introducido no es entero");
				error = true;
				sc.nextLine();
			}
		} while (error);

		/*
		 * Creamos un bucle while para dividir el numero entre 10 mientras que sea mayor
		 * de nueve es decir que el numero introducido tenga dos cifras
		 */
		while (numero > 9) {
			numero = numero / 10;
			contador++;
		}

		/* Mostramos la respuesta al usuario */
		System.out.println("El numero tiene " + contador + " cifras");

		/* Cerramos el Scanner */
		sc.close();
	}
}
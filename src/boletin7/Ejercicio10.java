package boletin7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {

		/*
		 * Realiza un programa que nos diga si un número introducido por teclado es
		 * capicúa o no. El número debe ser mayor o igual que 0.
		 */

		/* Creamos una variable para almacenar el numero del usuario */
		int numero = 0;

		/* Creamos una variable para almacenar el numero cambiado */
		int cambiado;

		/* Creamos una variable para almacenar el ultimo digito del numero */
		int digito;

		/* Creamos una variable para almacenar el numero invertido */
		int invertido = 0;

		/* Creamos una variable para almacenar el error */
		boolean error = false;

		/* Creamos un Scanner */
		Scanner sc = new Scanner(System.in);

		/*
		 * Creamos un bucle para que el usuario tenga que introducir el numero hasta que
		 * sea un valor correcto
		 */
		do {
			/*
			 * Creamos una alerta para el usuario para notificarle en caso de que el numero
			 * introducido no sea un entero
			 */
			try {
				/* Pedimos al usuario que introduzca un numero */
				System.out.println("Introduce un numero:");

				/* Leemos el numero del usuario */
				numero = sc.nextInt();

				/*
				 * Añadimos un assert para notificar al usuario si introduzce numeros negativos
				 */
				assert numero >= 0 : "Error: El numero introducido es negativo";
				error = false;
				
			} catch (AssertionError e) {
				/* Mostramos el error al usuario */
				System.err.println(e.getMessage());
				error = true;
				
			} catch (InputMismatchException e) {
				/* Mostramos el mensaje de error al usuario */
				System.err.println("Error: El numero introducido no es entero");
				error = true;
				sc.nextLine();
			}

		} while (error);

		/* Hacemos que el numero cambiado tenga el mismo valor que el numero original */
		cambiado = numero;

		/*
		 * Creamos un bucle while para invertir el numero mientras que el numero
		 * cambiado sea mayor a 0
		 */
		while (cambiado > 0) {

			/* Sacamos el ultimo digito haciendo el resto de numero cambiado entre 10 */
			digito = cambiado % 10;

			/* Añadimos el digito al final del numero invertido */
			invertido = invertido * 10 + digito;

			/* Eliminamos la ultima cifra del numero cambiado dividiendo entre 10 */
			cambiado /= 10;
		}

		/*
		 * Mostramos el resultado al usuario, si el numero es igual al numero invertido
		 * el numero sera capicua sino no sera capicua
		 */
		System.out.println(numero == invertido ? "El numero introducido es capicua" : "El numero introducido no es capicua");

		/* Cerramos el Scanner */
		sc.close();
	}
}
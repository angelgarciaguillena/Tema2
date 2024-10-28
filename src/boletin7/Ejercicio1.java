package boletin7;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {

		/*
		 * Escribe un programa que incremente la hora de un reloj. Se pedirán por
		 * teclado: Hora Minutos Segundos Cantidad de segundos a incrementar La
		 * aplicación debe mostrar la nueva hora. Por ejemplo, si el usuario introduce
		 * hora=13, minutos=59 y segundos=51, y se desea incrementar en 10 segundos, el
		 * resultado a mostrar es 14:00:01.
		 */

		/* Creamos una variable para almacenar las horas */
		int horas;

		/* Creamos una variable para almacenar las minutos */
		int minutos;

		/* Creamos una variable para almacenar las segundos */
		int segundos;

		/* Creamos una variable para almacenar la cantidad de segundos a incrementar */
		int incremento;

		/* Creamos una variable para almacenar la solucion */
		String resultado = "";
		
		/*Creamos una variable para contar las iteraciones*/
		int iteracion = 1;

		/* Creamos un Scanner */
		Scanner sc = new Scanner(System.in);

		/*Creamos un bucle do while para hacer que el usuario repita el numero de horas si introduce un valor incorrecto*/
		do {
			/* Pedimos al usuario que introduzca el numero de horas */
			System.out.println("Introduce las horas:");

			/* Lo leemos */
			horas = sc.nextInt();
		} while (horas < 0 || horas > 24);
		
		/*Creamos un bucle do while para hacer que el usuario repita el numero de minutos si introduce un valor incorrecto*/
		do {
			/* Pedimos al usuario que introduzca el numero de minutos */
			System.out.println("Introduce los minutos:");

			/* Leemos los minutos */
			minutos = sc.nextInt();
		} while (minutos < 0 || minutos > 60);
		
		/*Creamos un bucle do while para hacer que el usuario repita el numero de segundos si introduce un valor incorrecto*/
		do {
			/* Pedimos al usuario que introduzca el numero de segundos */
			System.out.println("Introduce los segundos:");

			/* Leemos los segundos */
			segundos = sc.nextInt();
		} while (segundos < 0 || segundos > 60);
		
		/*Creamos un bucle do while para hacer que el usuario repita el numero de segundos incrementados si introduce un valor incorrecto*/
		do {
			/* Pedimos al usuario que introduzca el numero de segundos de incremeno */
			System.out.println("Introduce los segundos que se incrementa:");

			/* Leemos el numero */
			incremento = sc.nextInt();
		} while (incremento < 0);
		
		/*Creamos un bucle for para ir sumando 1 a los segundos hasta que sea mayor que el numero del incremento*/
		for (int i = 1; iteracion <= incremento; iteracion++) {
			
			/*Sumamos  1 a los segundos*/
			segundos += i;
			
			/*Si los segundos son mayores a 60*/
			if (segundos >= 60) {
				segundos = 0;
				minutos += 1;
			}
			
			/*Si los minutos son iguales a 60*/
			if (minutos == 60) {
				minutos = 0; 
				horas += 1;
			}
			
			/*Si las horas son iguales a 24*/
			if (horas == 24) {
				horas = 0;
			}

		}
		
		/*Mostramos el resultado al usuario*/
		resultado += (horas < 10 ? "0" : "") + horas + ":";
		resultado += (minutos < 10 ? "0" : "") + minutos + ":";
		resultado += (segundos < 10 ? "0" : "") + segundos;
		System.out.println(resultado);

		/* Cerramos el Scanner */
		sc.close();
	}
}

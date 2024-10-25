package boletin7;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		/*Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado:
		 * Hora
	     * Minutos
		 * Segundos
		 * Cantidad de segundos a incrementar
		 * La aplicación debe mostrar la nueva hora. Por ejemplo, si el usuario 
		 * introduce hora=13, minutos=59 y segundos=51, y se desea incrementar 
		 * en 10 segundos, el resultado a mostrar es 14:00:01.
		 */
		
		/*Creamos una variable para almacenar las horas*/
		int horas;
		
		/*Creamos una variable para almacenar las minutos*/
		int minutos;
		
		/*Creamos una variable para almacenar las segundos*/
		int segundos;
		
		/*Creamos una variable para almacenar la cantidad de segundos a incrementar*/
		int incremento;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		
		/*Creamos un bucle do-while para pasar de la hora normal al incremento y si ha metido un dato erroneo informar al usuario*/
		do {
			/*Pedimos al usuario que introduzca el numero de horas*/
			System.out.println("Introduce las horas:");
			
			/*Lo leemos*/
			horas = sc.nextInt();
		} while(horas < 0 || horas > 24);
		
		do {
			/*Pedimos al usuario que introduzca el numero de minutos*/
			System.out.println("Introduce los minutos:");
			
			/*Lo leemos*/
			minutos = sc.nextInt();
		} while(minutos < 0 || minutos > 60);
			
		do {
			/*Pedimos al usuario que introduzca el numero de segundos*/
			System.out.println("Introduce los segundos:");
			
			/*Lo leemos*/
			segundos = sc.nextInt();
		} while(segundos < 0 || segundos > 60);
			
		do {	
			/*Pedimos al usuario que introduzca el numero de segundos de incremeno*/
			System.out.println("Introduce los segundos que se incrementa:");
			
			/*Lo leemos*/
			incremento = sc.nextInt();
		} while(incremento < 0);
		
		segundos += incremento;

		for(int contador = 0; contador < incremento; contador++) {
			
			if(segundos >= 60) {
				segundos = 0;
				minutos++;
			}
			
			
			if(minutos >= 60) {
				minutos = 0;
				horas++;
			}
			
			
			if(horas >= 24) {
				horas = 0;
				
			}
		}
		
		/*Mostramos el resultado al usuario*/
		System.out.println("La hora actual es: " + horas + ":" + minutos + ":" + segundos);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

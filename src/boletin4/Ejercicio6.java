package boletin4;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		/*Creoamos una variable para almacenar la altura*/
		double altura;
		
		/*Creamos una variable para almacenar la altura maxima*/
		double alturaMax = 0;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca su altura*/
		System.out.println("Introduce su altura");
		
		/*Lo leemos*/
		altura = sc.nextDouble();
		
		/*Creamos un bucle para seguir pidiendo alturas al usuario hasta que introduzca el -1 para detener el programa*/
		while(altura != -1) {
						
			/*Creamos una condicional que indique que si la altura es mayor a la altura maxima, la altura maxima pase a ser la altura normal*/
			if (altura > alturaMax) {
				alturaMax = altura;
			} 
			
			/*Pedimos al usuario que siga introduciendo su altura*/
			System.out.println("Introduce su altura");
			
			/*Lo leemos*/
			altura = sc.nextDouble();
			
		}
		
		/*Mostramos al usuario el resultado*/
		System.out.println("La altura mas grande es " + alturaMax);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

package boletin1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar un numero*/
		double a;
		
		/*Creamos una variable para almacenar un numero*/
		double b;
		
		/*Creamos una variable para almacenar un numero*/
		double c;
		
		/*Creamos una variable para almacenar una de las soluciones */
		double x;
		
		/*Creamos una variable para almacenar otra de las soluciones */
		double x2;
		
		/*Creamos una variable para almacenar un numero*/
		double discriminante;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un valor de a*/
		System.out.println("Introduzca un valor de a:");
		
		/*Lo leemos*/
		a = sc.nextDouble();
		
		/*Pedimos al usuario que introduzca un valor de b*/
		System.out.println("Introduzca un valor de b:");
		
		/*Lo leemos*/
		b = sc.nextDouble();
		
		/*Pedimos al usuario que introduzca un valor de c*/
		System.out.println("Introduzca un valor de c:");
		
		/*Lo leemos*/
		c = sc.nextDouble();
		
		/*Calcuamos el valor de discriminante*/
		discriminante = ((b * b) - (4 * a * c));
		
		/*Creamos la condicion para averiguar la solucion de la ecuacion*/
		
		/*Si el valor del discriminante es 0 solo tiene una solucion*/
		if (discriminante == 0) {
			x = -b;
			System.out.println("La solucion es " + x);
			
		/*Si el valor del discriminante es mayor a 0 tiene dos soluciones*/
		}else if (discriminante > 0) {
			x = (-b + Math.sqrt(discriminante)) / (2 * a);
			x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
			System.out.println("Las soluciones son " + x + " y " + x2);
			
		/*Si el valor es menor a 0 no tiene ninguna solucion*/
		}else if (discriminante < 0) {
			System.out.println("No hay solucion");
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

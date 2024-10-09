package boletin2;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el primer numero del usuario*/
		double num1;
		
		/*Creamos una variable para almacenar el segundo numero del usuario*/
		double num2;
		
		/*Creamos una variable para almacenar la eleccion del usuario*/
		String eleccion;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca el primer numero*/
		System.out.println("Introduce el primer numero:");
		
		/*Lo leemos*/
		num1 = sc.nextInt();
		
		/*Pedimos al usuario que introduzca el segundo numero*/
		System.out.println("Introduce el segundo numero:");
		
		/*Lo leemos*/
		num2 = sc.nextInt();
		
		/*Pedimos al usuario que eliga una de las opciones*/
		System.out.println("A. SUMAR LOS NUMEROS");
		System.out.println("B. RESTAR LOS NUMEROS");
		System.out.println("C. MULTIPLICAR LOS NUMEROS");
		System.out.println("D. DIVIDIR LOS NUMEROS");
		System.out.println("Elige una de las opciones:");
		
		/*Lo leemos*/
		eleccion = sc.next();
		
		/*Creamos un switch para mostrar la eleccion del usuario y un default para mostyrale al usuario si introduce una opcion incorrecta*/
		switch(eleccion.toUpperCase()) {
		case "A" ->
			System.out.println(num1 + num2);
		case "B" ->
			System.out.println(num1 - num2);
		case "C" ->
			System.out.println(num1 * num2);
		case "D" ->
			System.out.println(num1 / num2);
		default ->
			System.out.println("Opcion incorrecta");
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

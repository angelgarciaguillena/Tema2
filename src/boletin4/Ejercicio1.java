package boletin4;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		/*Creamos una variable para acumular los numeros que introduce el usuario*/
		int numero = 0;
		
		/*Creamos una variable para acumular la suma de los numeros*/
		int suma = 0;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero:");
		
		/*Lo leemos*/
		numero = sc.nextInt();
		
		/*Creamos un bucle que vaya sumando los numeros y pidiendo al usuario uno nuevo para ir sumandolo*/
		while(numero >= 0) {
			
			/*Sumamos los numeros*/
			suma = suma + numero;
			
			/*Mostramos el resultado*/
			System.out.println("El resultado de la suma es " + suma);
			
			/*Volvemos a pedir otro numero al usuario*/
			System.out.println("Introduce un numero para sumar con el anterior:");
			
			/*Lo leemos*/
			numero = sc.nextInt();
		}
		
		/*Ponemos un mensaje por si el numero es menor a 0*/
		System.out.println("Programa finalizado");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

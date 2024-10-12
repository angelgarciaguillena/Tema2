package boletin3;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*Utiliza un operador ternario para calcular el valor absoluto de un número que se solicita al usuario por teclado.*/

		/*Creamos una variable para almacenar el numero del usuario*/
		double numero;
		
		/*Creamos una variable para transformar el numero en valor absoluto*/
		double numeroTransformado;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero:");
		
		/*Lo leemos*/
		numero = sc.nextDouble();
		
		/*Creamos un operador ternario para transformar el numero en valor absoluto*/
		numeroTransformado = numero > 0 ? numero : -numero;
		
		/*Mostramos el resultado al usuario*/
		System.out.println("El numero en valor absoluto es: " + numeroTransformado);
		
		/*Cerramos el Scanner*/
		sc.close();
		
	}
}

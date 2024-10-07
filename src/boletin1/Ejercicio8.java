package boletin1;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero del usuario*/
		double numero;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca su nota*/
		System.out.println("Introduce tu nota:");
		
		/*Lo leemos*/
		numero = sc.nextDouble();
		
		/*Creamos la condicional para saber cual es el resultado del alumno*/
		if (numero >= 0 && numero < 5) {
			System.out.println("INSUFICIENTE");
		} else if (numero >= 5 && numero < 6 ) {
			System.out.println("SUFICIENTE");
		} else if (numero >= 6 && numero < 7) {
			System.out.println("BIEN");
		} else if (numero >= 7 && numero < 9) {
			System.out.println("NOTABLE");
		} else if (numero >= 9 && numero <= 10) {
			System.out.println("SOBRESALIENTE");
		} else if (numero > 10 || numero < 0) {
			System.out.println("No se puede evaluar");
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

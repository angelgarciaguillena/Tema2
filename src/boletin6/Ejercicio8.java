package boletin6;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		/*Creamos una variable para lamacenar el numero A que introduzca el usuario*/
		int numeroA;
		
		/*Creamos una variable para almacenar el numero B que introduzca el usuario*/
		int numeroB;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero:");
		
		/*Leemos el primer numero del usuario*/
		numeroA = sc.nextInt();
		
		/*Pedimos al usuario que introduzca otro numero*/
		System.out.println("Introduce otro numero:");
		
		/*Leemos el segundo numero del usuario*/
		numeroB = sc.nextInt();
		
		/*Si el numero A es igual al numero B*/
		if (numeroA == numeroB) {
			System.out.println("Los numeros son iguales");
		} else if (numeroA == numeroB + 1 || numeroB == numeroA + 1){ /*Si el numero A es igual al numero B mas 1 o el numero B es igual al numero A mas 1*/
			System.out.println("El numero no tiene intermedio");
		} else if (numeroA < numeroB) { /*Si el numero A es menor al numero B*/
			
			/*Creamos un bucle para imprimir los numeros desde el numero A hasta el numero B*/
			for (int i = numeroA + 1; i != numeroB ; i++) {
				System.out.println(i);
			}
		} else if (numeroB < numeroA) { /*Si el numero B es menor al numero A*/
			
			/*Creamos un bucle para imprimir los numeros desde el numero B hasta el numero A*/
			for (int i = numeroB + 1 ; i != numeroA ; i++) {
				System.out.println(i);
			}
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

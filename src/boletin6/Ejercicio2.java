package boletin6;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero del usuario*/
		int limite;
		
		/*Creamos una variable para el resultado de los numeros multiplos de 3*/
		int multiplo;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero:");
		
		/*Leemos el numero del usuario*/
		limite = sc.nextInt();
		
		/*Creamos un bucle for para imprimir los multiplos de tres hasta el numero introducido por el usuario*/
		for (int i = 1 ; i <= limite ; i++) {
			
			multiplo = i % 3;/*Vemos si el numero es multiplo de 3*/
			
			if (multiplo == 0) {/*Si el multiplo tiene valor 0 se imprime el numero*/
				System.out.println(i);
			}
		}
			
		/*Cerramos el Scanner*/
		sc.close();
	}
}

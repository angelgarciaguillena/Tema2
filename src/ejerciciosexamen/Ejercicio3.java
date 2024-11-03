package ejerciciosexamen;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el valor del lado que introduzca el usuario*/
		int lado;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca el valor del lado*/
		System.out.println("Introduce el valor del lado:");
		
		/*Leemos el valor del lado introducido por el usuario*/
		lado = sc.nextInt();
		
		/*Creamos un bucle for*/
		for(int fila = 0; fila < lado; fila++) {
			for(int columna = 0; columna < lado; columna++) {
				if(fila == 0 || columna > fila - 1 || columna == fila ) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			
			
			/*Hacemos un salto de linea*/
			System.out.println();
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

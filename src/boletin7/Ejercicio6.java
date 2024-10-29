package boletin7;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		/*Solicita al usuario un número n y dibuja un triángulo de base y altura n.*/
		
		/*Creamos una variable para almacenar el numero del usuario*/
		int numero;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos un numero al usuario*/
		System.out.println("Introduce un numero:");
		
		/*Leemos el numero del usuario*/
		numero = sc.nextInt();
		
		/*Creamos un bucle for para imprimir los numeros hasta llegar al introducido inicializando una variable i que ira sumando 1 para llegar al numero del usuario */
		for(int i = 1; i <= numero; i++) {
			
			/*Creamos un bucle for para generar el espacio que hay al principio de cada asterisco inicializando una variable k que produzca un espacio mientras que 
			el valor de for sea menor al numero introducido del usuario menos el valor de i*/
			for(int k = 1; k < numero - i; k++) {
				System.out.print(" ");
			}
			
			/*Creamos un bucle for para imprimir asteriscos hasta llegar al valor de la variable i inicializando una variable j para llegar al valor de la variable i*/
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			
			/*Hacemos un salto de linea*/
			System.out.println();
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

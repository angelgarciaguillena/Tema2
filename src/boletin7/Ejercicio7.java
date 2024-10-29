package boletin7;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		/*Escribe un programa que lea un número n e imprima una pirámide de números con n filas*/
		
		/*Creamos una variable para almacenar el numero del usuario*/
		int numero;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos un numero al usuario*/
		System.out.println("Introduce un numero:");
		
		/*Leemos el numero del usuario*/
		numero = sc.nextInt();
		
		/*Creamos un bucle for para ir generando los numeros hasta el numero del usuario*/
		for(int i = 1; i <= numero; i++) {
			
			/*Creamos un bucle for para generar los numeros hasta el maximo del valor de la variable i*/
			for(int j = 1; j < i; j++) {
				System.out.print(j);
			}
			
			/*Creamos un bucle for para generar los numeros de forma decreciente desde su maximo hasta el numero 1*/
			for(int k = i; k > 0; k--) {
				System.out.print(k);
			}
			
			/*Hacemos un salto de linea*/
			System.out.println();
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

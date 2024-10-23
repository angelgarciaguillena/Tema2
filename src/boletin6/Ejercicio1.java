package boletin6;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero del usuario*/
		int limite;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos un numero al usuario*/
		System.out.println("Introduce un numero:");
		
		/*Leemos el numero del usuario*/
		limite = sc.nextInt();
		
		/*Creamos un bucle for para imprimir desde el numero 1 hasta el numero que haya dicho el usuario*/
		for (int i = 1 ; i <= limite ; i++) { 
			
			/*Se imrpime los numeros*/
			System.out.println(i);
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

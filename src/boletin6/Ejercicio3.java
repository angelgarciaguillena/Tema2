package boletin6;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar los numeros introducidos por teclado*/
		int numero;
		
		/*Creamos una variable para almacenar la suma*/
		int suma = 0;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle for para imprimir diez numeros por teclado*/
		for (int i = 0 ; i < 10 ; i++) {
			
			/*Pedimos al usuario que introduzca un numero*/
			System.out.println("Introduce un numero:");
			
			/*Leemos el numero del usuario*/
			numero = sc.nextInt();
			
			/*Hacemos que los numeros se vayan sumando ym almacenando en la variable suma*/
			suma = suma + numero;
		}
		
		/*Mostramos al usuario la media de los numeros introducidos*/
		System.out.println("La media de los 10 numeros introducidos es " + (double) suma / 10);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

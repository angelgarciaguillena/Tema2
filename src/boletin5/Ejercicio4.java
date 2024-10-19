package boletin5;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero del usuario*/
		int numero;
		
		/*Creamos una variable para almacenar el numero para multiplicar*/
		int numero2 = 0;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero:");
		
		/*Leemos el numero del usuario*/
		numero = sc.nextInt();
		
		/*Creamos un bucle do while que imprima cada multiplicacion hasta el numero 10 por el numero que introduzca el usuario sumandole uno al numero que multiplica al del usuario en el bucle*/
		do {
			System.out.println(numero + " x " + numero2 + " = " + (numero*numero2));
			numero2++;
		} while(numero2 <= 10);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

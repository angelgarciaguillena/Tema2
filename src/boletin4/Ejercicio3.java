package boletin4;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar los numeros*/
		int numero;
		
		/*Creamos una variable para acumular la suma de los numeros*/
		int suma = 0;
		
		/*Creamos una variable para acumular la media*/
		double media;
		
		/*Creamos una variable para ir contando los numeros*/
		int contador = 0;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero:");
		
		/*Lo leemos*/
		numero = sc.nextInt();
		
		/*Creamos un bucle para que el usuario vaya introduciendo numeros y sumarlos*/
		while(numero >= 0) {
			
			/*Sumamos los numeros*/
			suma = numero + suma;
			
			/*Sumamos los numeros al contador*/
			contador++;
			
			/*Pedimos al usuario que introduzca otro numero*/
			System.out.println("Introduce otro numero:");
			
			/*Lo leemos*/
			numero = sc.nextInt();
		}
		
		/*Calculamos la media*/
		media = suma / contador;
		
		/*Mostramos el resultado al usuario*/
		System.out.println("La media es: " + media);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

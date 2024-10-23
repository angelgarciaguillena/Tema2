package boletin6;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar la suma de los numeros*/
		int suma = 0;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle for para ir sumando los numeros impares*/
		for (int i = 0, numero = 1 ; i < 10 ; numero += 2,i++) {
			
			/*Hacemos que los numeros se vayan sumando en una variable*/
			suma = suma + numero; 
			
		}
		
		/*Mostramos al usuario la suma de los numeros impares*/
		System.out.println("La suma de los numeros impares es " + suma);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

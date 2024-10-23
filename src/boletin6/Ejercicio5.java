package boletin6;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero del usuario*/
		int numero;
		
		/*Creamos una variable para almacenar el resultado de la multiplicacion*/
		int multiplicacion = 1;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero:");
		
		/*Leemos el numero del usuario*/
		numero = sc.nextInt();
		
		/*Creamos un bucle for para calcular el factorial del numero multiplicando el numero por el anterrior*/
		for (int i = numero ; i >= 1 ; i--) {
			
			/*Hacemos que los numeros se vayan multiplicando y almacenando en la variable*/
			multiplicacion = multiplicacion * i;

		}
		
		/*Mostramos el resultado al usuario*/
		System.out.println("La factorizacion del numero es " + multiplicacion);
			
		/*Cerramos el Scanner*/
		sc.close();
	}
}

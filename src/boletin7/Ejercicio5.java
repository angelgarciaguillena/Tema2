package boletin7;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		/*Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla los 
		 * números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su valor.
		 */
		
		/*Creamos una variable para almacenar el numero del usuario*/
		int numero;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos un numero al usuario*/
		System.out.println("Intoduce un numero:");
		
		/*Leemos el numero del usuario*/
		numero = sc.nextInt();		
		
		/*Creamos un while para pedir al usuario un numero y en caso de no estar dentro del rango informarselo al usuario*/
		while(numero > 20 || numero < 0) {
			
			/*Mostramos el mensaje al usuario y le pedimos que introduzca de nuevo el numero*/
			System.out.println("El numero introducido es erroneo");
			
			/*Pedimos un numero al usuario*/
			System.out.println("Intoduce un numero:");
			
			/*Leemos el numero del usuario*/
			numero = sc.nextInt();		
		}
		
		/*Creamos un bucle for para imprimir todos los numeros hasta llegar al numero introducido por el usuario sumandole uno mas a la variable i inicializada en el bucle*/
		for(int i = 1 ; i <= numero; i++) {
			
			/*Creamos un bucle para imprimir el numero de cifras que vale el numero imprimiendo el numero i hasta que j sea mayor que i y como j va sumandole 1 cuando sea igual al valor de i dejara de imprimir numeros*/
			for(int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			
			/*Hacemos un salto de linea*/
			System.out.println();
		}
			
		/*Cerramos el Scanner*/
		sc.close();
	}
}

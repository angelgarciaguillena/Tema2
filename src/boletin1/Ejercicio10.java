package boletin1;

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el primer numero*/
		int numero1;
		
		/*Creamos una variable para almacenar el segundo numero*/
		int numero2;
		
		/*Creamos una variable para almacenar el tercer numero*/
		int numero3;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca el primer numero*/
		System.out.println("Introduce el primer numero:");
		
		/*Lo leemos*/
		numero1 = sc.nextInt();
		
		/*Pedimos al usuario que introduzca el segundo numero*/
		System.out.println("Introduce el segundo numero:");
		
		/*Lo leemos*/
		numero2 = sc.nextInt();
		
		/*Pedimos al usuario que introduzca el tercer numero*/
		System.out.println("Introduce el tercer numero:");
		
		/*Lo leemos*/
		numero3 = sc.nextInt();
		
		/*Creamos la condicional para ver si la suma de dos de los numeros resulta ser uno de los numeros introducidos*/
		if ((numero1 + numero2) == numero3) {
			System.out.println("La suma de los numeros " + numero1 + " y " + numero2 + " es igual a " + numero3);
		} else if ((numero2 + numero3) == numero1) {
			System.out.println("La suma de los numeros " + numero2 + " y " + numero3 + " es igual a " + numero1);
		} else if ((numero1 + numero3) == numero2) {
			System.out.println("La suma de los numeros " + numero1 + " y " + numero3 + " es igual a " + numero2);
		} else {
			System.out.println("La suma de dos de los tres numeros no da como resultado el otro numero");
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}
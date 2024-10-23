package boletin6;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero del usuario*/
		int numero;
		
		/*Creamos una variable que indique si el numero es primo o no*/
		boolean division = false;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos un numero al usuario*/
		System.out.println("Introduce un numero:");
		
		/*Leemos el numero del usuario*/
		numero = sc.nextInt();
		
		/*Creamos un bucle forinicializando una variable omo contador y hasta que la variable no 
		sea mayor que el numero introducido se va a repetir y le voy sumando 1*/
		for (int i = 1 ; i <= numero ; i++) {
			
			/*Si el numero es igual a 1 el numero no sera primo*/
			if (numero == 1) {
				division = true;
			}
			
			/*Si la variable i es diferenrte de 1 y diferente del numero*/
			if (i != 1 && i != numero) {
				
				/*Si el resto del numero introducido entre la variable i es igual a 
				0 la variable sera true y no sera primo*/
				if (numero % i == 0) {
					division = true;
				}
			}
		}
		
		/*Mostramos el resultado al usuario, si division es true el numero no sera primo pero sino se cumple el numero es primo*/
		System.out.println(division == true ? "El numero introducido no es primo" : "El numero introducido es primo");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

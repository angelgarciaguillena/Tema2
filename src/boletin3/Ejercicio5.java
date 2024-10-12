package boletin3;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		/*Realiza el “juego de la suma”, que consiste en que aparezcan dos números aleatorios (comprendidos entre 1 y 99) y 
		  el usuario tiene que sumarlos. La aplicación le pedirá al usuario que introduzca el resultado de la suma. 
		  La aplicación le indicará si el resultado es correcto o no.*/
		
		/*Los numeros seran enteros ya que si no el programa nos muestra muchos decimales*/
		
		/*Creamos una variable para almacenar el primer numero aleatorio*/
		int numero1;
		
		/*Creamos una variable para almacenar el segundo numero aleatorio*/
		int numero2;
		
		/*Creamos una variable para la respuesta del usuario*/
		int respuesta;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos una clase Random para generar los dos numeros aleaotios*/
		Random random = new Random();
		
		/*Generamos el primer numero*/
		numero1 = random.nextInt(0, 99);
		
		/*Generamos el segundo numero*/
		numero2 = random.nextInt(0, 99);
		
		/*Hacemos que el programa muestre al usuario los dos numeros generados*/
		System.out.println("Los numeros generados son el " + numero1 + " y el " + numero2);
		
		/*Hacemos que el programa pida al usuario la suma de los dos numeros generados*/
		System.out.println("¿Cual es la suma de estos dos digitos?");
		
		/*Leemos la respuesta del usuario*/
		respuesta = sc.nextInt();
		
		/*Creamos una condicional para verificar si la suma del usuario es correcta y en caso de no serla notificar al usuario de ello*/
		if(respuesta == (numero1 + numero2)) {
			System.out.println("Respuesta correcta");
		} else {
			System.out.println("Respuesta incorrecta");
		}
		
		/*Cerramos el Scanner*/
		sc.close();

	}
}

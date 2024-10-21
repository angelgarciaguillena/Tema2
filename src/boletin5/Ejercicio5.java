package boletin5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar los numeros introducidos por el ordenador*/
		int numero;
		
		/*Creamos una variable para almacenar el numero introducido por el usuario que sera la respuesta correcta*/
		int numeroUsuario;
		
		/*Creamos una variable que sirva como maximo*/
		int maximo = 101;
		
		/*Creamos una variable que sirva como minimo*/
		int minimo = 1;
		
		/*Creamos una clase Random*/
		Random rand = new Random();
				
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca el numero que desea que el ordenador adivine*/
		System.out.println("Introduce el numero:");
		
		/*Leemos el numero del usuario*/
		numeroUsuario = sc.nextInt();
		
		/*Creamos un bucle do while para que el ordenador vaya introduciendo numeros aleatorios dentro del rango mientras el numerp introducido sea diferente al del ordenador*/
		do {
			numero = rand.nextInt(minimo,maximo);/*Hacemos que el programa introduzca un numero random*/
			System.out.println(numero);/*Mostramos el numero random al usuario*/
			if (numeroUsuario > numero) {/*Si el numero del usuario es mayor al introducido, el minimo del numero se vera cambiado por el numero aleatorio sumandole 1, ya que si no es ese numero se podra repetir*/
				System.out.println("El numero es mayor al introducido");
				minimo = numero + 1;
			} else if (numeroUsuario < numero) {/*Si el numero del usuario es menor al introducido, el maximo del numero se vera cambiado por el numero aleatorio*/
				System.out.println("El numero es menor al introducido");
				maximo = numero;
			} else if (numeroUsuario == numero) {/*Si el numero del usuario es igual al introducido*/
				System.out.println("Respuesta correcta");
			}
		} while(numero != numeroUsuario);
		
		/*Cerramos el Scanner*/
		sc.close();
		
		
	}
}

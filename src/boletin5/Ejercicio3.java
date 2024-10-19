package boletin5;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el numero limite que introduzca el usuario*/
		int limite;
		
		/*Creamos una variable para almacenar el numero*/
		int numero = 0;
		
		/*Creamos una variable para almacenar la suma*/
		int suma = 0;
		
		/*Creamos el Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca un numero*/
		System.out.println("Introduce un numero:");
		
		/*Leemos el numero del usuario*/
		limite = sc.nextInt();
		
		/*Creamos un bucle do while para ir sumando los numeros hasta el limite*/
		do {
			suma = suma + numero;/*Creamos una operacion para ir sumando los numeros mas lo anterior*/
			numero++;/*Hacemos que la variable numero vaya cambiando al siguiente digito hasta llegar al limite marcado por el usuario*/
		} while(numero <= limite);
		
		/*Mostramos el resultado de la suma al usuario*/
		System.out.println("El valor de la suma es " + suma);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

package boletin3;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		/*Determinar el precio de un billete de tren, conociendo la distancia a recorrer, y sabiendo que si 
		  el número de días de estancia es superior a 7 y la distancia superior a 800 km el billete tiene una 
		  reducción del 30%. El precio por kilómetro es de 2,5€. La distancia a recorrer y el número de días de 
		  estancia los debes solicitar al usuario por teclado.*/
		 
		/*Creamos una variable para almacenar el numero de dias de estancia*/
		int dias;
		
		/*Creamos una variable para almacenar la distancia recorrida*/
		double distancia;
		
		/*Creamos una constante para almacenar la reduccion del 30%*/
		double REDUCCION = 0.30;
		
		/*Creamos una constante para almacenar el precio por Kilometro*/
		double PRECIO = 2.5;
		
		/*Creamos una variable para almacenar el precio del viaje en total*/
		double total;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca la distancia a recorrer*/
		System.out.println("Introduce la distancia a recorrer:");
		
		/*Lo leemos*/
		distancia = sc.nextDouble();
		
		/*Pedimos al usuario que introduzca el numero de dias de estancia*/
		System.out.println("Introduce el numero de dias de estancia:");
		
		/*Lo leemos*/
		dias = sc.nextInt();
		
		/*Creamos una condicional para ver si se aplica el descuento o no*/
		if (dias > 7 && distancia > 800) {
			total = (distancia * PRECIO) - (distancia * PRECIO * REDUCCION);
			System.out.println("El precio del viaje es de: " + total + " €");
		} else {
			total = distancia * PRECIO;
			System.out.println("El precio del viaje es de: " + total + " €");
		}
		
		/*Cerramos el Scanner*/
		sc.close();

	}
}

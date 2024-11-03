package ejerciciosexamen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el dato del lado del usuario*/
		int lado = 0;
		
		/*Creamos una variable para almacenar el error*/
		boolean error = false;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle do while para hacer que el usuario tenga que repetir el numero hasta que introduzca un valor correcto*/
		do {
			/*Creamos un try catch para mostrar la notificacion de error al usuario si introduce un valor no valido*/
			try {
				/*Pedimos al usuario que introduzca el lado de la figura*/
				System.out.println("Introduce el lado");
				
				/*Leemos el dato que ha introducido el usuario*/
				lado = sc.nextInt();
				
				/*Creamos un assert para notificar al usuario si el numero es negativo*/
				assert lado >= 0 : "Error: El numero introducido es negativo";
				error = false;
				
			/*Si el valor es negativo se lo notificamos al usuario*/
			} catch(AssertionError e) {
				System.err.println(e.getMessage());
				error = true;
				
			/*Si el valor no es entero se lo notificamos al usuario*/
			} catch(InputMismatchException e) {
				System.err.println("Error: El numero introducido no es un entero");
				sc.nextLine();
				error = true;
			}
		} while(error);
		
		
		/*Creamos un bucle for para repetir mientras que la fila sea menor al lado y se le va sumando 1 a la fila*/
		for(int fila = 0; fila < lado; fila++) {
			
			/*Creamos un bucle for para repetir mientras que la columna sea menor al lado y se le va sumando uno a la columna*/
			for(int columna = 0; columna < lado; columna++) {
				
				/*Si la fila es igual a 0 o la columna es igual a 0 o la columna es igual al lado menos 1 o la fila es igual a la columna menos 1 imprimir asterisco sino imprimir espacio*/
				if(fila == 0 || columna == 0 || columna == lado - 1 || fila == lado - 1) {
					System.out.print("* "); 
				} else {
					System.out.print("  ");
				}
			}
		
			/*Hacemos un salto de linea*/
			System.out.println();
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}
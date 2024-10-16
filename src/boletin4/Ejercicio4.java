package boletin4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar los numeros*/
		int numero;
		
		/*Creamos una variable para almacenar la suma de los numeros*/
		int suma = 0;
		
		/*Creamos una variable para almacenar la suma de los numeros negativos */
		int sumaNegativos = 0;
		
		/*Creamos una variable que servira como contador de los 10 numeros*/
		int contador = 1;
		
		/*Creamos una variable que servira como contador de los numeros negativos*/
		int contadorNegativos = 0;
		
		/*Creamos una variable que servira como contador para los ceros introducidos*/
		int contadorCeros= 0;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle para que el usuario introduzca 10 numeros y pare al introducirlos todos*/
		while (contador <= 10) {
			
			/*Pedimos al usuario que introduzca un numero numero*/
			System.out.println("Introduce un numero:");
			
			/*Lo leemos*/
			numero = sc.nextInt();
			
			if (numero > 0) { /*Si el numero es mayor a 0 el numero se suma*/
				suma = suma + numero;
			} else if (numero < 0) { /*Si el numero es menor a 0 se suma los numeros negativos y se va sumando los numeros introducidos al contador*/
				contadorNegativos++;
				sumaNegativos = sumaNegativos + numero;
			} else { /*Si no es ninguno de los anteriores casos el numero se añade al contador de ceros*/
				contadorCeros++;
			}
			
			/*Sumamos los numeros introducidos en el contador*/
			contador++;
			
		}
		
		/*Mostramos la suma de los 10 numeros introducidos*/
		System.out.println("La suma de los 10 numeros es " + suma);
		
		/*Mostramos la media de los 10 numeros introducidos*/
		System.out.println(contadorNegativos == 0 ? "No se ha introducido ningun negativo" : "La media de los 10 numeros es " + (double) (sumaNegativos / contadorNegativos));
		
		/*Mostramos los numeros de ceros que hemos introducido*/
		System.out.println(contadorCeros == 0 ? "No se ha introducido ningun cero" : "La cantidad de ceros introducidos es " + contadorCeros);
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

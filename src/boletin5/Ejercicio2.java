package boletin5;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar los numeros*/
		int numero = 0;
		
		/*Creamos un bucle do while para imprimir los numeros pares y para que se vayan sumando 2 mas a la variable y muestre el siguiente digito par*/
		do {
			System.out.println(numero);
			numero = numero + 2;
		} while(numero <= 200);
	}
}

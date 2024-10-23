package boletin6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		/*Creamos una variable para ir almacenando las calificaciones del usuario*/
		int calificacion;
		
		/*Creamos una variable para saber si hay un suspenso*/
		boolean suspenso = false;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Creamos un bucle for para pedir al usuario 5 calificaciones*/
		for (int i = 0; i< 5 ; i++) {
			
			/*Pedimos al usuario que introduzca un numero*/
			System.out.println("Introduzca una calificacion:");
			
			/*Leemos la calificacion del usuario*/
			calificacion = sc.nextInt();
			
			/*Si la calificacion es menor o igual a 4 sera un suspenso*/
			if(calificacion <= 4) { 
				suspenso = true;
			}
		}
		
		/*Mostramos al usuario si hay algun suspenso*/
		System.out.println(suspenso == true ? "Hay algun suspenso" : "No hay suspensos");
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

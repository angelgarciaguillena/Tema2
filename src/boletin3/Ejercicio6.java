package boletin3;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		/*Dada una hora por teclado, (horas, minutos y segundos) realiza un algoritmo que muestre la hora después de incrementar un segundo.*/
		
		/*Creamos una variable para acumular las horas introducidas por el usuario*/
		int horas;
		
		/*Creamos una variable para acumular los minutos introducidas por el usuario*/
		int minutos;
		
		/*Creamos una variable para acumular los segundos introducidas por el usuario*/
		int segundos;
		
		/*Creamos una variable para acumular las horas modificadas*/
		int horasFinal;
		
		/*Creamos una variable para acumular los minutos modificados*/
		int minutosFinal;
		
		/*Creamos una variable para acumular los segundos totales*/
		int segundosTotal;
		
		/*Creamos una variable para acumular los segundos restantes de las horas*/
		int segundosRestantes;
		
		/*Creamos una variable para acumular los segundos finales*/
		int segundosFinal;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca el numero de horas*/
		System.out.println("Introduce el numero de horas:");
		
		/*Lo leemos*/
		horas = sc.nextInt();
		
		/*Pedimos al usuario que introduzca el numero de minutos*/
		System.out.println("Introduce el numero de minutos:");
		
		/*Lo leemos*/
		minutos = sc.nextInt();
		
		/*Pedimos al usuario que introduzca el numero de horas*/
		System.out.println("Introduce el numero de segundos:");
		
		/*Lo leemos*/
		segundos = sc.nextInt();
		
		/*Creamos una condicional para comprobar si el usuario introdujo los datos correctamente*/
		if (horas >= 0 && minutos < 60 && minutos >= 0 && segundos < 60 && segundos >= 0) {
			segundosTotal= (horas * 3600) + (minutos * 60) + segundos + 1;
			horasFinal = segundosTotal / 3600;
			segundosRestantes = segundosTotal % 3600;
			minutosFinal = segundosRestantes / 60;
			segundosFinal = segundosRestantes % 60;
			System.out.println("La hora modificada es: " + horasFinal + " horas, " + minutosFinal + " minutos y " + segundosFinal + " segundos ");
		} else {
			System.out.println("Datos incorrectos");
		}
		
		/*Cerramos el Scanner*/
		sc.close();

	}
}

package boletin1;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		/*Creamos una variable para almacenar el primer numero*/
		double num1;
		
		/*Creamos una variable para almacenar el segundo numero*/
		double num2;
		
		/*Creamos una variable para almacenar el tercer numero*/
		double num3;
		
		/*Creamos un Scanner*/
		Scanner sc = new Scanner(System.in);
		
		/*Pedimos al usuario que introduzca el primer numero*/
		System.out.println("Introduce el primer numero:");
		
		/*Lo leemos*/
		num1 = sc.nextDouble();
		
		/*Pedimos al usuario que introduzca el segundo numero*/
		System.out.println("Introduce el segundo numero:");
		
		/*Lo leemos*/
		num2 = sc.nextDouble();
		
		/*Pedimos al usuario que introduzca el tercer numero*/
		System.out.println("Introduce el tercer numero:");
		
		/*Lo leemos*/
		num3 = sc.nextDouble();
		
		/*Hacemos que el programa lea de mayor a menor los tres numeros*/
		if (num1>num2 && num1>num3 && num2>num3) {
			System.out.println(num1 + " > " + num2 + " > " + num3);
		} else if (num1>num2 && num1>num3 && num3>num2) {
			System.out.println(num1 + ">" + num3 + ">" + num2);
		} else if (num2>num1 && num2>num3 && num1>num3) {
			System.out.println(num2 + " > " + num1 + " > " + num3);
		} else if (num2>num1 && num2>num3 && num3>num1) {
			System.out.println(num2 + " > " + num3 + " > " + num1);
		} else if (num3>num1 && num3>num2 && num1>num2) {
			System.out.println(num3 + " > " + num1 + " > " + num2);
		} else if (num3>num1 && num3>num2 && num2>num1) {
			System.out.println(num3 + " > " + num2 + " > " + num1);
		/*Empezamos con los iguales*/
		} else 	if (num1>num2 && num1>num3 && num2==num3) {
			System.out.println(num1 + " > " + num2 + " = " + num3);
		} else if (num1>num2 && num1==num3 && num3>num2) {
			System.out.println(num1 + " = " + num3 + " > " + num2);
		} else 	if (num1==num2 && num1>num3 && num2>num3) {
			System.out.println(num1 + " = " + num2 + " > " + num3);
		} else if (num1==num2 && num1==num3 && num3==num2) {
			System.out.println(num1 + " = " + num3 + " = " + num2);
		} else if (num2>num1 && num2>num3 && num1==num3) {
			System.out.println(num2 + " > " + num1 + " = " + num3);
		} else if (num2>num1 && num2==num3 && num3>num1) {
			System.out.println(num2 + " = " + num3 + " > " + num1);
		} else if (num3>num1 && num3>num2 && num1==num2) {
			System.out.println(num3 + " > " + num1 + " = " + num2);
		}
		
		/*Cerramos el Scanner*/
		sc.close();
	}
}

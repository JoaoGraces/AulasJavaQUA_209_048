package aulas;

import java.util.Scanner;

public class OperadoresAritimeticos_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
	
		Scanner leia = new Scanner(System.in);
		
		float f, c;
		
		System.out.println("-- Fahrenheit para Celsius --");
		
		System.out.println("Informe a temperatura em Fahrenheit: ");
		f = leia.nextFloat();
		
		c = 5 * ((f-32) / 9);
		
		System.out.printf("Graus Celsius: " + c);
	
	}

}

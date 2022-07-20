package aulas;

import java.util.Scanner;

public class OperadoresAritimeticos_01 {

	public static void main(String[] args) {
		/* Faça um Programa que peça dois
		números e imprima a soma; */

		Scanner leia = new Scanner(System.in);
		
		int n1, n2, soma = 0;
		
		
		System.out.println("-- Faça a soma de dois números inteiros --");
		
		System.out.print("Digite o primeiro número inteiro: ");
		n1 = leia.nextInt();
		
		System.out.print("Digite o segundo número inteiro: ");
		n2 = leia.nextInt();
		
		soma = n1 + n2;
		System.out.println("O resultado da soma é: " + soma);
		

	}

}

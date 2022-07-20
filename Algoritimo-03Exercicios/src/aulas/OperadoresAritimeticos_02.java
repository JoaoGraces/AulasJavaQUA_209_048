package aulas;

import java.util.Scanner;

public class OperadoresAritimeticos_02 {
	
	public static void main(String[] args) {
		// Faça um Programa que peça as 4 notas bimestrais e mostre a média
		
		float n1, n2, n3, n4, media=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("-- Média do aluno --");
		
		System.out.println("Primeira nota: ");
		n1 = leia.nextFloat();
		
		System.out.println("Segunda nota: ");
		n2 = leia.nextFloat();
		
		System.out.println("Terceira nota: ");
		n3 = leia.nextFloat();
		
		System.out.println("Quarta nota: ");
		n4 = leia.nextFloat();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.printf("A média do aluno foi: %.2f %n", (media));
		
		
	}

}

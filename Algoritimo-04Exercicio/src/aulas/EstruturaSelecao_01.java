package aulas;

import java.util.Scanner;

public class EstruturaSelecao_01 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0, n2 = 0;
		
		System.out.println("Digite dois valores inteiros e descubra qual deles é o maior!");
		
		System.out.println("Escreva o primeiro numero: ");
		n1 = sc.nextInt();
		
		System.out.println("Escreva o primeiro numero: ");
		n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.printf("%d o maior número!", n1);
		}
		else{
			System.out.printf("%d o mior número!", n2);
		}
		
		sc.close();
		
	}
}

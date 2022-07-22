package aulas;

import java.util.Scanner;

public class EstruturaSelecao_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int n=0;
		
		System.out.print("Digite um número de 1 a 7: ");
		n = sc.nextInt();
		
		if(n<1 || n>7) {
			System.out.println("Número inválido. Apenas de 1 a 7.");
		}
		else {
			switch(n) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda-feira");
				break;
			case 3:
				System.out.println("Terça-feira");
				break;
			case 4:
				System.out.println("Quarta-feira");
				break;
			case 5:
				System.out.println("Quinta-feira");
				break;
			case 6:
				System.out.println("Sexta-feira");
				break;
			case 7:
				System.out.println("Sábado");
				break;
			}
		}
		
		sc.close();
	}

}

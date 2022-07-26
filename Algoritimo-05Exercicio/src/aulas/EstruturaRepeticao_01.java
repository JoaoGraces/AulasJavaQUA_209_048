package aulas;

import java.util.Scanner;

public class EstruturaRepeticao_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int certo=8, n=0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Digite um númer de 0 a 10: ");
			n = sc.nextInt();			
			if (n!=certo) {
				System.out.println("Valor incorreto");
			}
		}
		while (n != certo);
		System.out.println("Parabéns!!");
		
		sc.close();
	}

}

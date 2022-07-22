package aulas;

import java.util.Scanner;

public class EstruturaSelecao_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int item, quant;
		
		System.out.println("Escolha um dos item da lista \n1 - sanduiche natureba\n2 - Sanduba Bomba\n3 - Coxinha de Jaca\n4 - Feijoada vegetariana");
		item = sc.nextInt();
		System.out.printf("Quantos?", item);
		quant = sc.nextInt();
		
		switch(item) {
			case 1:
				System.out.printf("%d sanduiche(s) natureba é pra já!", quant, item);
				break;
			case 2:
				System.out.printf("%d Sanduba(s) Bomba é pra já!", quant, item);
				break;
			case 3:
				System.out.printf("%d Coxinha(s) de Jaca é pra já!", quant, item);
				break;
			case 4:
				System.out.printf("%d Feijoada(s) vegetariana é pra já!", quant, item);
				break;
		
		}
		
		
		sc.close();
	}

}

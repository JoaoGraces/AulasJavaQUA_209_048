package aulas;

import java.util.Scanner;

public class EstruturaSelecao_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0, n2 = 0, n3 = 0;
		
		System.out.println("Descubra qual dos 3 números é maior");
		
		System.out.print("Digite o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		n2 = sc.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = sc.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.printf("%d é o maior número!", n1);
		}
		else if (n2 > n3){
			System.out.printf("%d é o maior número!", n2);
		}
		else {
			System.out.printf("%d é o maior número", n3);
		}
		
		sc.close();
	}

}

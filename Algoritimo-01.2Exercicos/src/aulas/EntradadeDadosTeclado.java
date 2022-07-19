package aulas;

import java.util.Scanner;

public class EntradadeDadosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		double saldo = 10.25;
		int idade = 0;
		char sexo;
		String nome;
		
		leia.nextLine();
		System.out.println("Qual é o seu nome? ");
		nome = leia.nextLine();
		
		System.out.println("Qual é a sua idade? ");
		idade = leia.nextInt();
		
		System.out.println("Qual seu sexo? M  F  N");
		sexo = leia.next().charAt(0);
		
		System.out.println("Qual é o seu saldo?");
		saldo = leia.nextDouble();
		
		System.out.println(nome + "tem" + idade + "anos, seu sexo é " + sexo + "e possui a fortuna de R$" + saldo + "reais no banco");
		
		//Pokemon Maluco
		
		int cartao = 0, atras = 0;
		
		System.out.println("--- Bem vindo ao DESCUBRA SEU NOME MALUCO DE POKEMON ---");
		System.out.println("Para descobrir qual seu nome MALUCO de pokemon basta colocar as seguintes informaçõs:");
		
		System.out.print("Número do cartão de credito da mamãe - ");
		cartao = leia.nextInt();
		
		System.out.println("/nOs três numerozinhos atrás do cartão - ");
		atras = leia.nextInt();
		
		
		
		leia.close();
		

	}

}

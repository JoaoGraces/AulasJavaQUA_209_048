package aulas;

import java.util.Scanner;

public class EstruturaRepeticao_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome, senha;
		
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Digite o nome: ");
			nome = sc.nextLine();
			
			System.out.println("Digite a senha: ");
			senha = sc.nextLine();
			
			if(nome.equals(senha)) {
				System.out.println("Erro");
			}
		}
		while(nome.equals(senha));
		
		System.out.println("Entrando...");
	}
		
}

package aulas;

import java.util.Scanner;

public class EstruturaSelecao_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String cadastro, senha, usuario, senha2;
		
		System.out.println("-- Cadastro da conta --");
		
		
		System.out.print("Digite o usuário: ");
		cadastro = sc.nextLine();
		
		sc.nextLine();
		System.out.print("Digite a senha: ");
		senha = sc.nextLine();
		
		System.out.println("-- ENTRAR --");
		 
		System.out.print("Usuário: ");
		usuario = sc.nextLine();
		
		System.out.print("Senha: ");
		senha2 = sc.nextLine();
		
		if(!cadastro.equals(usuario)) {
			System.out.println("ERRO -- Usuário errado");
		}
		else if (!senha.equals(senha2)){
			System.out.println("ERRO -- Senha incorreta");
		}
		else {
			System.out.println("Entrando na conta...");
		}
		
		
		sc.close();

	}

}

package aulas;

import java.util.Scanner;

public class EstruturaRepeticao_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		char ec, sexo;
		int idade;
		double salario;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe seu nome :");
	    nome=scan.next();
	    
	    while(nome.length()<3) {
	    	System.out.println("Erro. Nome pequeno.Informe novamente: ");
	    	nome=scan.next();
	    }        	

	    
	    System.out.println("Informe sua idade:");
	    idade=scan.nextInt();
	    
	    while(idade<0 ||  idade>150) {
	        System.out.println("Erro. Idade inválida. Informe novamente :");
	        idade=scan.nextInt();
	    }
	    
	   
	    System.out.println("Informe seu salario:");
	    salario=scan.nextDouble();
	    
	    while (salario<0) {
	    	System.out.println("Erro. Informe um salário maior que 0:");
	        salario=scan.nextDouble();
	    }
	    
	    System.out.println("Informe seu sexo: ");
	    sexo=scan.next().charAt(0);
	    while (sexo!='f' && sexo!='m'){
	    	 System.out.println("Erro. Digite novamente: ");
	         sexo=scan.next().charAt(0);
	    }
	    
	    System.out.println("Informe seu estado civil: ");
	    ec=scan.next().charAt(0);
	    while (ec != 's' && ec != 'v' && ec != 'c' && ec != 'd') {
	    	System.out.println("Erro. Digite o estado civil novamente: ");
	    	ec=scan.next().charAt(0);
	    }
	    
	    System.out.printf("Nome: %s", nome);
	    System.out.printf("\nIdade: %d", idade);
	    System.out.printf("\nSalário: %.2f", salario);
	    System.out.printf("\nSexo: %c", sexo);
	    System.out.printf("\nEstado civil: %c", ec);
	}
}

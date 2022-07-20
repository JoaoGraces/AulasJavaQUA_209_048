package aulas;

import java.util.Scanner;

public class OperadoresAritimeticos_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int din, tempo, sal=0;
		
		System.out.println("-- Calculo de salário --");
		
		System.out.println("Reais ganhados por hora: ");
		din = leia.nextInt();
		
		System.out.println("Horas trabalhadas por mês: ");
		tempo = leia.nextInt();
		
		sal = din * tempo;
		
		System.out.println("Seu salário é: " + sal);
	}

}

package aulas;

import java.util.Scanner;

public class EstruturaSelecao_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		float salario, irpf, inss;
		
		System.out.print("Digite o salário bruto: R$");
		salario = sc.nextFloat();
	
		irpf = salario * 5/100;
		inss = salario * 11/100;
		salario = salario - inss - irpf;
		
		System.out.printf("Salário liquido %.2f", salario);
		
		if(salario < 1200) {
			salario = salario + (salario * 5/100);
			System.out.printf("\nBônus!! -- Salário subiu para R$%.2f", salario);
		}
		else if(salario > 3500) {
			salario = salario + (salario * 2/100);
			System.out.printf("\nBônus!! -- Salário subiu para R$%.2f", salario);
		}
		else {
			System.out.printf("\nSem bônus -- Salário R$%.2f", salario);
		}
		
		sc.close();
	}

}

package aulas;

import java.util.Scanner;

public class EstruturaRepeticao_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ent, voto, i, lula = 0, bolso = 0, cilo = 0, bolo = 0, tine = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("-- Bem vindo ao andar de entrevistas da Dado Incerto --");

		System.out.print("Informe quantas pessoas serão entrevistadas: ");
		ent = scan.nextInt();

		System.out.print(
				"\nOs candidatos são:\n1 - Lula Molusco\n2 - Bolso Nelson\n3 - Cilouca Gomes\n4 - Bolos Bolinhos\n5 - Tineis Atômico");

		for (i = 1; i <= ent; i++) {
			System.out.printf("\nQual canditado o %dº entrevistado tem a intensão de votar? ", i);
			voto = scan.nextInt();

			switch (voto) {
			case 1:
				lula++;
				break;
			case 2:
				bolso++;
				break;
			case 3:
				cilo++;
				break;
			case 4:
				bolo++;
				break;
			case 5:
				tine++;
				break;
			}
		}
		
		System.out.println("-- Número de votos de cada candidato --");
		System.out.printf("Lula Molusco: %d\nBolso Nelson: %d\nCilouca Gomes: %d\nBolso Bolinhos: %d\nTineias Atômico: %d", lula, bolso, cilo, bolo, tine);
	}
}

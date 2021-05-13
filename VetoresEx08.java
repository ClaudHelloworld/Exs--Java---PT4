

import java.util.Scanner;

/*
 * 8. Tentando descobrir se um dado era viciado, um dono de cassino o lançou n vezes. Dados
 * os n resultados dos lançamentos, determinar o número de ocorrências de cada face.
 */

public class VetoresEx08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] dado = new int[6];
		int n, face;
		System.out.print("Informe o numero de vezes que o dado foi lancado: ");
		n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.printf("Resultado do %do. lancamento: ", i);
			face = in.nextInt();
			while (face < 1 || face > 6) {
				System.out.println("Valor invalido! Deve ser um valor entre 1 e 6");
				System.out.printf("Resultado do %do. lancamento: ", i);
				face = in.nextInt();
			}
			dado[face - 1]++;
		}
		System.out.println("Numero de ocorrencias de cada face do dado");
		for (int i = 0; i < 6; i++) {
			System.out.printf("Face %d: %d\n", i + 1, dado[i]);
		}
		in.close();
	}

}

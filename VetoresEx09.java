

import java.util.Scanner;

public class VetoresEx09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, tamMaior = 1, indexMaior = 0, tamAtual = 1, indexAtual = 0;
		System.out.print("Informe o tamanho da sequencia de inteiros: ");
		n = in.nextInt();
		int[] seq = new int[n];
		System.out.print("Informe " + n + " numeros inteiros: ");
		for (int i = 0; i < n; i++) {
			seq[i] = in.nextInt();
		}

		for (int i = 1; i < n; i++) {
			if (seq[i] > seq[i - 1]) {
				tamAtual++;
				if (tamAtual > tamMaior) {
					tamMaior = tamAtual;
					indexMaior = indexAtual;
				}
			}
			else {
				indexAtual = i;
				tamAtual = 1;
			}
		}
		System.out.print("Maior sequencia crescente: ");
		for (int i = indexMaior; i < indexMaior + tamMaior; i++) {
			System.out.print(seq[i] + " ");
		}
		System.out.println();
		in.close();
	}

}


/*
 * 4. Desenvolva um programa para armazenar n números inteiros em um vetor e depois
 * imprimir todos os números positivos digitados.
 */

import java.util.Scanner;

public class VetoresEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números? ");
		int n = sc.nextInt();
		int[] v = new int[n];

		for (int i = 0; i <= n - 1; i++) {
			System.out.print("Insira o " + (i + 1) + "o. numero: ");
			v[i] = sc.nextInt();
		}
		
		System.out.print("\nNumeros positivos informados: ");
		for (int x : v) {
			if (x > 0) {
				System.out.print(x + " ");
			}
		}
		System.out.println();
		sc.close();
	}

}



import java.util.Scanner;

/*
 * 6. Criar um programa para entrar com números inteiros em um vetor a de tamanho 10. Gerar
 * e imprimir o vetor b onde cada elemento é o quadrado do elemento, na respectiva posição
 * do vetor a.
 */

public class VetoresEx06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[10], b = new int[10];
		System.out.print("Informe 10 numeros inteiros: ");
		for (int i = 0; i < 10; i++) {
			a[i] = in.nextInt();
			b[i] = a[i] * a[i];
		}
		System.out.println("\nQuadrados dos valores informados");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ao quadrado = %d\n", a[i], b[i]);
		}
		in.close();
	}

}

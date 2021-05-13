
/*
 * 3. Desenvolva um programa para armazenar 10 números inteiros em um vetor e imprimir
 * uma listagem numerada contendo o número e umas das mensagens: par ou ímpar, para
 * cada elemento do vetor.
 */
import java.util.Scanner;

public class VetoresEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[10];

		for (int i = 0; i <= 9; i++) {
			System.out.print("Insira o " + (i + 1) + "o. numero: ");
			n[i] = sc.nextInt();
		}
		
		for (int x : n) {
			if (x % 2 == 0) {
				System.out.println(x + " - par");
			} else {
				System.out.println(x + " - impar");
			}
		}
		sc.close();
	}

}

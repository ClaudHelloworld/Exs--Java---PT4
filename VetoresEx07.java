

import java.util.Scanner;

/*
 * 7. Criar um programa que receba a temperatura média de cada mês do ano, em graus
 * centígrados, e armazene essas temperaturas em um vetor. Imprimir as temperaturas de
 * todos os meses, maior e a menor temperatura do ano e em que mês aconteceram. Suponha
 * que não há meses com temperaturas iguais.
 */

public class VetoresEx07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float[] temp = new float[12];
		int maiorIndex = 0, menorIndex = 0;
		System.out.println("Informe a temperatura media dos meses do ano");
		for (int i = 0; i < temp.length; i++) {
			System.out.printf("Temperatura media do mes %d: ", i + 1);
			temp[i] = in.nextFloat();
		}
		System.out.println("\nTemperaturas medias dos meses do ano");
		for (int i = 0; i < temp.length; i++) {
			System.out.printf("Mes %02d: %.1f C\n", i + 1, temp[i]);
			if (temp[i] > temp[maiorIndex]) {
				maiorIndex = i;
			}
			else if (temp[i] < temp[menorIndex]) {
				menorIndex = i;
			}
		}
		System.out.printf("Maior temperatura (%.1f C) ocorreu no mes %d\n", temp[maiorIndex], maiorIndex + 1);
		System.out.printf("Menor temperatura (%.1f C) ocorreu no mes %d\n", temp[menorIndex], menorIndex + 1);		in.close();
	}

}

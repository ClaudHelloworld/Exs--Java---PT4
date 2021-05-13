

/*
 * 4.
 * Desenvolva um programa em Java para calcular o volume de um cone dados dois números in-
 * teiros, representado o raio da base do cone (r) e a sua altura (h). Sabe-se que o volume do cone
 * é dado por:
 * V = (Ab * h) / 3
 * onde Ab é a área da base do cone.
 */

import java.util.Scanner;

public class VolumeCone {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int raio, altura;
		double volume;
		System.out.print("Informe o raio da base do cone: ");
		raio = in.nextInt();
		System.out.print("Informe a altura do cone: ");
		altura = in.nextInt();
		
		volume = ((Math.PI * Math.pow(raio, 2)) * altura) / 3;
		
		System.out.printf("Volume do cone: %.2f\n", volume);
		in.close();
	}

}

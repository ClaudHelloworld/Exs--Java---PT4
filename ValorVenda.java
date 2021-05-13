import java.util.Scanner;

/*
 * 18. Um comerciante calcula o valor de venda, tendo em vista a tabela a seguir:
 * Valor da Compra                      Valor da Venda
 * Valor < R$ 10,00                     Lucro de 70%
 * R$ 10,00 ≤ Valor < R$ 30,00          Lucro de 50%
 * R$ 30,00 ≤ Valor < R$ 50,00          Lucro de 40%
 * Valor ≥ R$ 50,00                     Lucro de 30%
 * Criar um programa que possa entrar com o valor da compra e imprimir o valor da venda.
 */
public class ValorVenda {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double compra, venda;
		
		System.out.print("Informe o valor de compra: R$ ");
		compra = in.nextDouble();
		
		if (compra < 10) {
			venda = compra * 1.7;
		}
		else if (compra < 30) {
			venda = compra * 1.5;
		}
		else if (compra < 50) {
			venda = compra * 1.4;
		}
		else {
			venda = compra * 1.3;
		}
		
		System.out.printf("Valor de venda: R$ %.2f\n", venda);
		in.close();
	}

}

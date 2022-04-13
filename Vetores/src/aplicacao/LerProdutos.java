/*
 * Fazer um programa para ler um n�mero inteiro N e os dados (nome e
 * pre�o) de N Produtos. Armazene os N produtos em um vetor. Em
 * seguida, mostrar o pre�o m�dio dos produtos.
 */
package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produtos;

public class LerProdutos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de Produtos: ");
		int n = sc.nextInt();
		Produtos[] vect = new Produtos[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Produto: ");
			String prod = sc.nextLine();
			System.out.print("Pre�o R$");
			double preco = sc.nextDouble();
			System.out.println();;
			vect[i] = new Produtos(prod, preco);
		}
		double soma = 0.0;
		
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i].getPreco();
		}
		double media = soma / vect.length;
		System.out.printf("A media de pre�o � R$%.2f", media);
			
		sc.close();
	}

}

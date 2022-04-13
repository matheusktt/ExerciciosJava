/*
 * Fazer um programa para ler um número inteiro N e os dados (nome e
 * preço) de N Produtos. Armazene os N produtos em um vetor. Em
 * seguida, mostrar o preço médio dos produtos.
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
			System.out.print("Preço R$");
			double preco = sc.nextDouble();
			System.out.println();;
			vect[i] = new Produtos(prod, preco);
		}
		double soma = 0.0;
		
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i].getPreco();
		}
		double media = soma / vect.length;
		System.out.printf("A media de preço é R$%.2f", media);
			
		sc.close();
	}

}

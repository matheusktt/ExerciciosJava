/*
 * Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final, mostrar a etiqueta 
 * de preço de cada produto na mesma ordem em que foram digitados. Todo produto possui nome e preço. Produtos
 * importados possuem uma taxa de alfândega, e produtos usados possuem data de fabricação. Estes dados específicos 
 * devem ser acrescentados na etiqueta de preço. Para produtos importados, a taxa e alfândega deve ser acrescentada 
 * ao preço final do produto. 
 */

package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List <Produto> listaProduto = new ArrayList<>();
		
		System.out.print("Entre com a quantidade de produtos: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Produto " + i + ":");
			System.out.print("Produto Comum, usado ou importado (c/u/i) ? ");
			char produto = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço R$");
			double preco = sc.nextDouble();
			
			switch (produto) {
				case 'c': 
					listaProduto.add(new Produto(nome, preco));
				break;
				case 'u': 
					System.out.print("Data de Fabricação do produto (DD/MM/AAAA): ");
					Date fabricacaoProduto = sdf.parse(sc.next());
					listaProduto.add(new ProdutoUsado(nome, preco, fabricacaoProduto));
				break; 
				case 'i':
					System.out.print("Taxa de Importação R$");
					double taxaImportacao = sc.nextDouble();
					listaProduto.add(new ProdutoImportado(nome, preco, taxaImportacao));
				break;
			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PREÇOS");
		System.out.println();

		for (Produto produto : listaProduto) {
			System.out.println(produto.etiquetaPreco());
		}
		
		sc.close();
	}		
}


/*
 * Fazer um programa para ler os dados de N produtos (N fornecido pelo usu�rio). Ao final, mostrar a etiqueta 
 * de pre�o de cada produto na mesma ordem em que foram digitados. Todo produto possui nome e pre�o. Produtos
 * importados possuem uma taxa de alf�ndega, e produtos usados possuem data de fabrica��o. Estes dados espec�ficos 
 * devem ser acrescentados na etiqueta de pre�o. Para produtos importados, a taxa e alf�ndega deve ser acrescentada 
 * ao pre�o final do produto. 
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
			System.out.print("Pre�o R$");
			double preco = sc.nextDouble();
			
			switch (produto) {
				case 'c': 
					listaProduto.add(new Produto(nome, preco));
				break;
				case 'u': 
					System.out.print("Data de Fabrica��o do produto (DD/MM/AAAA): ");
					Date fabricacaoProduto = sdf.parse(sc.next());
					listaProduto.add(new ProdutoUsado(nome, preco, fabricacaoProduto));
				break; 
				case 'i':
					System.out.print("Taxa de Importa��o R$");
					double taxaImportacao = sc.nextDouble();
					listaProduto.add(new ProdutoImportado(nome, preco, taxaImportacao));
				break;
			}
		}
		
		System.out.println();
		System.out.println("ETIQUETAS DE PRE�OS");
		System.out.println();

		for (Produto produto : listaProduto) {
			System.out.println(produto.etiquetaPreco());
		}
		
		sc.close();
	}		
}


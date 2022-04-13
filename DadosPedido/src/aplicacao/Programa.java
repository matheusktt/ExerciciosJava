/*
 * Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um sumário do pedido.
 * Nota: o instante do pedido deve ser o instante do sistema: new Date().
 */

package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItensPedido;
import entidades.Pedido;
import entidades.Produto;
import entidades.enums.StatusPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do Cliente");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Aniversário (DD/MM/AAAA): ");
		Date aniversario = sdf.parse(sc.next());
				
		Cliente cliente = new Cliente(nome, email, aniversario);
		
		System.out.println("Entre com os dados do pedido:");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.print("Quantos itens tem nesse pedido ? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Entre com o #" + (i + 1) + " item:");
			System.out.print("Produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço: $");
			double preco = sc.nextDouble();
			
			Produto produto = new Produto(nomeProduto, preco);
			
			System.out.print("Quantidade: ");			
			int quantidade = sc.nextInt();
			
			ItensPedido itens = new ItensPedido(quantidade, preco, produto);
			pedido.adicionaItens(itens);
		}
		
		System.out.println();
		System.out.println("Dados do pedido:");
		System.out.println(pedido);
		
		sc.close();
	}

}

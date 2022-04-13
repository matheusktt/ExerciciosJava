package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Quantos produtos deseja cadastrar ? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Id do produto #" + (i + 1) + ": ");
			int id = sc.nextInt();
			while (validaId(list, id)) {
				System.out.print("Id já cadastrado. Tente novamente: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: R$ ");
			double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			list.add(new Produto(id, nome, preco, quantidade));
			System.out.println();
		}
		
		System.out.println("Lista de produtos adicionados:");
		
		for (Produto produto : list) {
			System.out.println(produto);
		}
							
		sc.close();
	}
	
	public static boolean validaId (List<Produto>list ,int id) {
		Produto prod = list.stream().filter(procuraId -> procuraId.getId() == id).findFirst().orElse(null);
		return prod != null;
	}

}

/*
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
 * N funcionários. Não deve haver repetição de id.
 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
 * Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
 * mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
 * conforme exemplos.
 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
 * ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
 * aumento por porcentagem dada. 
 */

package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.print("Quantos funcionários deseja registrar ? ");
		int n = sc.nextInt();
		System.out.println();

		for(int i = 0; i < n; i ++) {
			System.out.println("Funcionário #" + (i + 1) + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			while (procuraId(lista, id)) {
				System.out.print("Id já cadastrador. Tente novamente: ");
				id = sc.nextInt();
			}
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			lista.add(new Funcionario(id, nome, salario));
		}
		
		System.out.print("Entre com o id do funcionário que deseja aumentar o salário: ");
		int id = sc.nextInt();
		func = lista.stream().filter(idFuncionario -> idFuncionario.getId() == id).findFirst().orElse(null);
		if (func ==  null){
			System.out.println("Id não cadastrado!");
		}
		else {
			System.out.print("Entre com a porcentagem de aumento: % ");
			double valorAumento = sc.nextDouble();
			func.aumentaSalario(valorAumento);
		}
		
		System.out.println();
		System.out.println("Lista de Funcionários:");
		
		for (Funcionario funcionario : lista) {
			System.out.println(funcionario);
		}
			
		sc.close();
	}
	
	public static boolean procuraId(List<Funcionario> lista, int id) {
		Funcionario func = lista.stream().filter(idRepetido -> idRepetido.getId() == id).findFirst().orElse(null);
		return func != null;
	}

}

/*
 * Fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario) de
 * N funcion�rios. N�o deve haver repeti��o de id.
 * Em seguida, efetuar o aumento de X por cento no sal�rio de um determinado funcion�rio.
 * Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir, mostrar uma
 * mensagem e abortar a opera��o. Ao final, mostrar a listagem atualizada dos funcion�rios,
 * conforme exemplos.
 * Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir que o sal�rio possa
 * ser mudado livremente. Um sal�rio s� pode ser aumentado com base em uma opera��o de
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
		
		System.out.print("Quantos funcion�rios deseja registrar ? ");
		int n = sc.nextInt();
		System.out.println();

		for(int i = 0; i < n; i ++) {
			System.out.println("Funcion�rio #" + (i + 1) + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			while (procuraId(lista, id)) {
				System.out.print("Id j� cadastrador. Tente novamente: ");
				id = sc.nextInt();
			}
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			lista.add(new Funcionario(id, nome, salario));
		}
		
		System.out.print("Entre com o id do funcion�rio que deseja aumentar o sal�rio: ");
		int id = sc.nextInt();
		func = lista.stream().filter(idFuncionario -> idFuncionario.getId() == id).findFirst().orElse(null);
		if (func ==  null){
			System.out.println("Id n�o cadastrado!");
		}
		else {
			System.out.print("Entre com a porcentagem de aumento: % ");
			double valorAumento = sc.nextDouble();
			func.aumentaSalario(valorAumento);
		}
		
		System.out.println();
		System.out.println("Lista de Funcion�rios:");
		
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

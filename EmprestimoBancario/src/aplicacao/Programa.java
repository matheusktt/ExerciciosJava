/*
 * Crie uma aplica��o que realize um cadastro de conta banc�ria, e realize um emprestimo para uma a conta
 * e calcule o valor das parcelas, se as parcelas forem maior que 12x acrescente um juro de 10%.
 */

package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import entidades.Emprestimo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		Emprestimo emp = new Emprestimo();
		
		System.out.println("Cadastro de conta Banc�ria:");
		System.out.print("Digite o n�mero da conta: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o nome do titular da conta: ");
		String titularConta = sc.nextLine();
				
		System.out.print("Valor do dep�sito R$");
		double deposito = sc.nextDouble();
		conta = new Conta(numeroConta, titularConta, deposito);

		System.out.println();
		System.out.println("Dados da Conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Valor do empr�stimo: R$");
		double emprestimo = sc.nextDouble();
		
		conta.depositar(emprestimo);
		
		System.out.print("Digite a quantidade de parcelas para pagar o empr�stimo: ");
		int parcelas = sc.nextInt();
		sc.nextLine();
		
		emp = new Emprestimo(emprestimo, parcelas);
		
		System.out.println(emp);
		
		System.out.println();
		System.out.println(conta);
		
		sc.close();
	}

}

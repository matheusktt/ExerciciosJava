/*
 * Fazer um programa para ler os dados de uma conta bancária e depois realizar um saque nesta conta bancária, 
 * mostrando o novo saldo. Um saque não pode ocorrer ou se não houver saldo na conta, ou se o valor do saque 
 * for superior ao limite de saque da conta.
 */

package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import excecoes.ExcecoesConta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String titularConta = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldoConta = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double limiteSaque = sc.nextDouble();

		Conta acc = new Conta (numero, titularConta, saldoConta, limiteSaque);
		
		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		double amount = sc.nextDouble();
		
		try {
			acc.sacar(amount);
			System.out.printf("Novo saldo: %.2f%n", acc.getSaldoConta());
		}
		catch (ExcecoesConta e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}

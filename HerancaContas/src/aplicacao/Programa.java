/*
 * Utilizando heranças crie uma classe de conta com metodos de saque e depósito.
 * E crie a classe conta empresarial herdando os atributos da classe conta com um limite para emprestimo.
 */

package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import entidades.ContaEmpresarial;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial();
		
		System.out.print("Conta: ");
		int contaNumero = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Saldo: R$");
		double saldo = sc.nextDouble();
		System.out.print("Deseja criar uma conta empresarial (s/n) ? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 's') {
			System.out.print("Valor de limite de Emprestimo Disponível: R$");
			double emprestimoLimite = sc.nextDouble();
			contaEmpresarial = new ContaEmpresarial(contaNumero, nome, saldo, emprestimoLimite);
			System.out.print("Valor do emprestimo solicitado: R$");
			double emprestimo = sc.nextDouble();
			contaEmpresarial.depositar(emprestimo);
			System.out.println(contaEmpresarial);
		}
		else {
			conta = new Conta(contaNumero, nome, saldo);
			System.out.println(conta);
			System.out.print("Deposito: R$");
			double deposito = sc.nextDouble();
			conta.depositar(deposito);
			System.out.println(conta);
		}
		
		sc.close();
	}

}

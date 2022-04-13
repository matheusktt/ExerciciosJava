package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Conta;
import excecoes.ExcecaoConta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		
		System.out.println("Entre com os dados da conta");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Titular da conta: ");
		String nome = sc.nextLine();
		System.out.print("Saldo inicial: R$ ");
		double saldo = sc.nextDouble();
		System.out.print("Saque limite: R$ ");
		double saqueLimite = sc.nextDouble();
		
		conta = new Conta(numero, nome, saldo, saqueLimite);
		
		System.out.println();
		
		System.out.print("Entre com o valor do saque: R$ ");
		double saque = sc.nextDouble();
		
		try {
			conta.sacar(saque);
			System.out.printf("Saldo: %.2f", conta.getSaldo());
		}
		catch (ExcecaoConta erro){
			System.out.println(erro.getMessage());
		}
		sc.close();
	}
}
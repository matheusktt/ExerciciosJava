package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Conta> lista = new ArrayList<>();
		Conta conta = new Conta();
		
		System.out.print("Quantas contas deseja cadastrar: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.print("ID da conta " + (i + 1) + ": ");
			int numeroConta = sc.nextInt();
			
			while(conta.verificaId(numeroConta, lista)) {
				System.out.println("Id já cadastrado");
				System.out.print("Digite novamente: ");
				numeroConta = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Titular da conta: ");
			String titularConta = sc.nextLine();

			System.out.print("Depósito inicial: R$");
			double deposito = sc.nextDouble();
			
			conta = new Conta(numeroConta, titularConta, deposito);
			lista.add(conta);
			System.out.println();
		}
		
		System.out.println("Contas cadastradas:");
		System.out.println("=========================================================================");
		
		for (Conta listaContas : lista) {
			System.out.println(listaContas);
		}
		
		System.out.println("=========================================================================");
		
		System.out.println();
		System.out.println("Login da conta");
		System.out.println("=========================================================================");
		System.out.print("Entre com o ID da sua conta: ");
		int id = sc.nextInt();
		
		conta = lista.stream().filter(idFuncionario -> idFuncionario.getId() == id).findFirst().orElse(null);

		if (conta != null){
			System.out.println("Conta: " +  conta.getId());
			System.out.println("Nome: " + conta.getTitularConta());
			System.out.println("Saldo Atual: R$" + String.format("%.2f", conta.getSaldoConta()));
		}
		else {
			System.out.println("Id não cadastrado! Acesso encerrado.");
		}
		
		sc.close();
	}
}

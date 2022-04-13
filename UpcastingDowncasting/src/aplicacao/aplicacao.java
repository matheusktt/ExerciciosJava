package aplicacao;

import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

public class aplicacao {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Conta conta = new Conta(1001, "Alex", 100.00);
		ContaEmpresarial empConta = new ContaEmpresarial(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING casting da subclasse para a superclasse
	
		Conta conta1 = empConta;
		Conta conta2 = new ContaEmpresarial(1003, "Bob", 0.0, 200.0);
		Conta conta3 = new ContaPoupanca(1003, "Anna", 1900.0, 0.06);
		
		//DOWNCASTING conversão da superclasse para a subclasse é um casting manual
		
		ContaEmpresarial conta4 = (ContaEmpresarial)conta2;
		conta4.depositar(100.00);
		
		if (conta3 instanceof ContaPoupanca) {
			ContaPoupanca conta5 = (ContaPoupanca)conta3;
			System.out.println(conta5.getNumeroConta());
			System.out.println(conta5.getTitularConta());
			System.out.println(conta5.getSaldo());
			conta5.atualizaSaldo();
			System.out.print("Saldo atualizado: ");
			System.out.println(conta5.getSaldo());
		}
	}
}

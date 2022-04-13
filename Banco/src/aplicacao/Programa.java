/* 
 * Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
 * titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito 
 * inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua 
 * conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
 * Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já 
 * o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por 
 * exemplo). 
 * Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger 
 * isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque 
 * realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for 
 * suficiente para realizar o saque e/ou pagar a taxa.
 * Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não 
 * informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre 
 * mostrando os dados da conta após cada operação. 
 */

package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta = new Conta();
		
		System.out.print("Entre com o numero da conta: ");
		int numeroConta = sc.nextInt();
		
		System.out.print("Entre com o nome do titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Deseja fazer um deposito inicial (s/n) ? ");
		char opcao = sc.next().charAt(0);
		
		if (opcao == 's') {
			System.out.print("Digite o valor do deposito: R$ ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numeroConta, nome, depositoInicial);
			System.out.println(conta);
		}
		else {
			conta = new Conta(numeroConta, nome);
			System.out.println("Conta " + conta.getNumeroConta() + ", Titular da conta: " + conta.getNomeTitularConta());
		}
		
		System.out.print("Digite o valor de deposito: R$ ");
		double deposito = sc.nextDouble();
		conta.depositar(deposito);

		System.out.println("Informações da conta:");
		System.out.println(conta);
		System.out.println();

		System.out.print("Digite o valor de saque: R$ ");
		double saque = sc.nextDouble();
		System.out.println();
		conta.sacar(saque);
		
		System.out.println("Informações da conta:");
		System.out.println(conta);
		
		sc.close();
	}
}

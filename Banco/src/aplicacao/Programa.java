/* 
 * Em um banco, para se cadastrar uma conta banc�ria, � necess�rio informar o n�mero da conta, o nome do
 * titular da conta, e o valor de dep�sito inicial que o titular depositou ao abrir a conta. Este valor de dep�sito 
 * inicial, entretanto, � opcional, ou seja: se o titular n�o tiver dinheiro a depositar no momento de abrir sua 
 * conta, o dep�sito inicial n�o ser� feito e o saldo inicial da conta ser�, naturalmente, zero.
 * Importante: uma vez que uma conta banc�ria foi aberta, o n�mero da conta nunca poder� ser alterado. J� 
 * o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasi�o de casamento, por 
 * exemplo). 
 * Por fim, o saldo da conta n�o pode ser alterado livremente. � preciso haver um mecanismo para proteger 
 * isso. O saldo s� aumenta por meio de dep�sitos, e s� diminui por meio de saques. Para cada saque 
 * realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo n�o for 
 * suficiente para realizar o saque e/ou pagar a taxa.
 * Voc� deve fazer um programa que realize o cadastro de uma conta, dando op��o para que seja ou n�o 
 * informado o valor de dep�sito inicial. Em seguida, realizar um dep�sito e depois um saque, sempre 
 * mostrando os dados da conta ap�s cada opera��o. 
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

		System.out.println("Informa��es da conta:");
		System.out.println(conta);
		System.out.println();

		System.out.print("Digite o valor de saque: R$ ");
		double saque = sc.nextDouble();
		System.out.println();
		conta.sacar(saque);
		
		System.out.println("Informa��es da conta:");
		System.out.println(conta);
		
		sc.close();
	}
}

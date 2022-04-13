/*
 * Suponha que a operação de saque possui uma taxa no valor de 5.0. Entretanto, se a conta for do tipo poupança, 
 * esta taxa não deve ser cobrada. 
 * Como resolver isso? 
 * Resposta: sobrescrevendo o método sacar na subclasse ContaPoupanca.
 * Se o saque for feito feito em uma conta empresarial utilize a lógica da superclasse Conta e acrescente 
 * o desconto de 2.
 * Utilize a função "super() para aproveitar o método sacar criado na superclasse.
 */

package aplicacao;

import entidades.Conta;
import entidades.ContaEmpresarial;
import entidades.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta(101, "Eduardo", 250.0);
		ContaPoupanca conta2 = new ContaPoupanca(102, "Caio", 250.0, 500.0);
		ContaEmpresarial conta3 = new ContaEmpresarial(102, "Bob", 250.0, 1000.0);

		
		conta1.sacar(100.0);
		conta2.sacar(100.0);
		conta3.sacar(100.0);
		
		System.out.println(conta1.getSaldo());
		System.out.println(conta2.getSaldo());
		System.out.println(conta3.getSaldo());
	}
}
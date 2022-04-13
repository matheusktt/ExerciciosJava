/*
 * Uma empresa possui funcion�rios pr�prios e terceirizados. Para cada funcion�rio, deseja-se registrar nome, 
 * horas trabalhadas e valor por hora. Funcion�rios terceirizado possuem ainda uma despesa adicional. O pagamento 
 * dos funcion�rios corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os funcion�rios 
 * terceirizados ainda recebem um b�nus correspondente a 110% de sua despesa adicional. Fazer um programa para ler 
 * os dados de N funcion�rios (N fornecido pelo usu�rio) e armazen�-los em uma lista. Depois de ler todos os dados, 
 * mostrar nome e pagamento de cada funcion�rio na mesma ordem em que foram digitados.
 */

package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.FuncionarioTerceirizado;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> listaFuncionario = new ArrayList<>();
		
		System.out.print("Entre com o n�mero de funcion�rios: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcion�rio #" + (i+1));
			System.out.print("Terceirizado (s/n) ? ");
			char resposta = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: R$");
			double valorPorHora = sc.nextDouble();
			
			if (resposta == 's') {
				System.out.print("Valor Adicional: R$");
				double valorAdicional = sc.nextDouble();
				listaFuncionario.add(new FuncionarioTerceirizado(nome, horas, valorPorHora, valorAdicional));
			}
			else{
				listaFuncionario.add(new Funcionario(nome, horas, valorPorHora));
			}
		}
		System.out.println();
		System.out.println("Pagamentos:");
		System.out.println();

		
		for (Funcionario funcionario : listaFuncionario) {
			System.out.println(funcionario.getNome() + " - R$" + String.format("%.2f", funcionario.pagamento()));
		}
		
		sc.close();
	}

}

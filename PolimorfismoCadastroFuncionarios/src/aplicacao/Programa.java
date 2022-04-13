/*
 * Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, deseja-se registrar nome, 
 * horas trabalhadas e valor por hora. Funcionários terceirizado possuem ainda uma despesa adicional. O pagamento 
 * dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os funcionários 
 * terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional. Fazer um programa para ler 
 * os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista. Depois de ler todos os dados, 
 * mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.
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
		
		System.out.print("Entre com o número de funcionários: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcionário #" + (i+1));
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

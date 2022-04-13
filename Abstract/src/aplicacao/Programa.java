/*
 * Utilizando Herença e métodos abstratos.
 * Faça um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais podem ser pessoa 
 * física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um, bem como o total de imposto 
 * arrecadado. 
 * Os dados de pessoa física são: nome, renda anual e gastos com saúde. 
 * Os dados de pessoa jurídica são nome, renda anual e número de funcionários. As regras para cálculo de imposto 
 * são as seguintes:
 * Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com renda de 20000.00 
 * em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto.
 * Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto fica: 
 * (50000 * 25%) - (2000 * 50%) = 11500.00 
 * Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10 funcionários, 
 * ela paga 14% de imposto. Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, 
 * o imposto fica: 400000 * 14% = 56000.00
 */

package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Imposto;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Imposto> listaImposto = new ArrayList<>();
		
		System.out.print("Quantidade de contribuintes que deseja calcular: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Contribuinte " + (i + 1));
			System.out.print("Pessoa Física ou Jurídica (f/j) ? ");
			Character contribuinte = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda Anual: R$");
			Double rendaAnual = sc.nextDouble();
			
			if (contribuinte == 'f') {
				System.out.print("Despesa com saúde: R$");
				Double despesa = sc.nextDouble();
				listaImposto.add(new PessoaFisica(nome, rendaAnual, despesa));
			}
			else {
				System.out.print("Numero de funcionarios: ");
				Integer numeroFuncionarios = sc.nextInt();
				listaImposto.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
			
		}
		
		System.out.println();
		System.out.println("Lista de imposto pago pelos contribuintes:");
		System.out.println();
		
		Double impostoTotal = 0.0;
		
		for (Imposto imposto : listaImposto) {
			System.out.println(imposto.getNome() + ": R$" + String.format("%.2f", imposto.imposto()));
			impostoTotal += imposto.imposto();
		}
		
		System.out.println();
		System.out.println("Total de imposto pago: R$" + String.format("%.2f", impostoTotal));
		sc.close();
	}

}
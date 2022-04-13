/*
 * Utilizando Heren�a e m�todos abstratos.
 * Fa�a um programa para ler os dados de N contribuintes (N fornecido pelo usu�rio), os quais podem ser pessoa 
 * f�sica ou pessoa jur�dica, e depois mostrar o valor do imposto pago por cada um, bem como o total de imposto 
 * arrecadado. 
 * Os dados de pessoa f�sica s�o: nome, renda anual e gastos com sa�de. 
 * Os dados de pessoa jur�dica s�o nome, renda anual e n�mero de funcion�rios. As regras para c�lculo de imposto 
 * s�o as seguintes:
 * Pessoa f�sica: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com renda de 20000.00 
 * em diante pagam 25% de imposto. Se a pessoa teve gastos com sa�de, 50% destes gastos s�o abatidos no imposto.
 * Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com sa�de, o imposto fica: 
 * (50000 * 25%) - (2000 * 50%) = 11500.00 
 * Pessoa jur�dica: pessoas jur�dicas pagam 16% de imposto. Por�m, se a empresa possuir mais de 10 funcion�rios, 
 * ela paga 14% de imposto. Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcion�rios, 
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
			System.out.print("Pessoa F�sica ou Jur�dica (f/j) ? ");
			Character contribuinte = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda Anual: R$");
			Double rendaAnual = sc.nextDouble();
			
			if (contribuinte == 'f') {
				System.out.print("Despesa com sa�de: R$");
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
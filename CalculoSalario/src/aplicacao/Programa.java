/* 
 * Fazer um programa para ler os dados de um funcionário (nome, salário base e imposto). Em seguida, 
 * mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário do 
 * funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) 
 * e mostrar novamente os dados do funcionário. 
 */

package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.println("Dados do Funcionario:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Salário Base R$ ");
		double salarioBase = sc.nextDouble();
		
		System.out.print("Imposto % ");
		double imposto = sc.nextDouble();
		
		func = new Funcionario(nome, salarioBase, imposto);
		
		System.out.println("Nome: " + nome + ", salario líquido: R$" + String.format("%.2f", func.salarioLiquido()));
		System.out.println();
		
		System.out.print("Digite a porcentagem do aumento : % ");
		double porcentagem = sc.nextDouble();
		System.out.println();
		
		System.out.printf("Funcionario Atualizado: %nNome: " + nome + ", salario líquido: R$" + String.format("%.2f", func.aumentoSalarial(porcentagem)));

		sc.close();
	}

}
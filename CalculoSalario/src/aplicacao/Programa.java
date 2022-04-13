/* 
 * Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio base e imposto). Em seguida, 
 * mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o sal�rio do 
 * funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto � afetado pela porcentagem) 
 * e mostrar novamente os dados do funcion�rio. 
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
		
		System.out.print("Sal�rio Base R$ ");
		double salarioBase = sc.nextDouble();
		
		System.out.print("Imposto % ");
		double imposto = sc.nextDouble();
		
		func = new Funcionario(nome, salarioBase, imposto);
		
		System.out.println("Nome: " + nome + ", salario l�quido: R$" + String.format("%.2f", func.salarioLiquido()));
		System.out.println();
		
		System.out.print("Digite a porcentagem do aumento : % ");
		double porcentagem = sc.nextDouble();
		System.out.println();
		
		System.out.printf("Funcionario Atualizado: %nNome: " + nome + ", salario l�quido: R$" + String.format("%.2f", func.aumentoSalarial(porcentagem)));

		sc.close();
	}

}
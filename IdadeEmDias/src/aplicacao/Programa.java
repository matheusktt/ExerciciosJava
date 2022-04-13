/* 
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e 
 * mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
 * (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */

package aplicacao;

import java.util.Scanner;

import entidades.Idade;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite sua idade em anos:");
		int idadeAnos = sc.nextInt();	
		
		System.out.printf("Digite sua idade em meses:");
		int idadeMeses = sc.nextInt();	
		
		System.out.printf("Digite sua idade em dias:");
		int idadeDias = sc.nextInt();	
		
		System.out.printf("%nVocê tem " + Idade.converteIdadeEmDias(idadeAnos, idadeMeses, idadeDias) + " dias.");
		
		sc.close();
	}

}

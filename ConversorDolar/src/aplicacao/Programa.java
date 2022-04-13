// Faça um programa que receba a cotação atual do dolar e leia um valor em dolar e converta para real 

package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Moeda;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Moeda moeda = new Moeda();
		
		System.out.printf("CONVERSOR DE DOLAR %n%n");
		
		System.out.print("Cotação atual do dólar: R$ ");
		double cotacaoAtual = sc.nextDouble();
		
		System.out.print("Digite o valor em dolar: $ ");
		double dolar = sc.nextDouble();
		
		System.out.println();
		
		moeda = new Moeda(cotacaoAtual, dolar);
		System.out.println(moeda);		

		sc.close();
	}

}

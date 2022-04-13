/*
 * Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado por 
 * uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos d�lares, considerando ainda 
 * que a pessoa ter� que pagar 6% de IOF sobre o valor em d�lar. Utilize m�todos est�ticos.
 */

package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.ConversorDolar;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor do D�lar: $");
		double dolar = sc.nextDouble();
		
		System.out.print("Quantos d�lares deseja comprar ? $");
		double quantidadeDolar = sc.nextDouble();
		
		System.out.printf("Total a pagar com IOF = R$%.2f", ConversorDolar.conversor(dolar, quantidadeDolar));
		
		sc.close();
	}

}

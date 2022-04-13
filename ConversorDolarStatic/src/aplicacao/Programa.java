/*
 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por 
 * uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda 
 * que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Utilize métodos estáticos.
 */

package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.ConversorDolar;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor do Dólar: $");
		double dolar = sc.nextDouble();
		
		System.out.print("Quantos dólares deseja comprar ? $");
		double quantidadeDolar = sc.nextDouble();
		
		System.out.printf("Total a pagar com IOF = R$%.2f", ConversorDolar.conversor(dolar, quantidadeDolar));
		
		sc.close();
	}

}

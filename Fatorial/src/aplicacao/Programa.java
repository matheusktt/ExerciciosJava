// Escrever um algoritmo que lê um valor inteiro, calcula o fatorial desse número

package aplicacao;

import java.util.Scanner;

import entidades.Fatorial;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite um numero para calcular o fatorial:");
		int N = sc.nextInt();
		System.out.printf("O fatorial de %d é %d", N, Fatorial.calculaFatorial(N));
		
		sc.close();
	}

}

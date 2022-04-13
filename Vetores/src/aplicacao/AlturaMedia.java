/* 
 * Fazer um programa para ler um número inteiro N e a altura de N
 * pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
 * altura média dessas pessoas. 
 */

package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class AlturaMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for(int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}
		
		double media = soma / vect.length;
		
		System.out.printf("A média de altura é: %.2f", media);
				
		sc.close();
	}

}

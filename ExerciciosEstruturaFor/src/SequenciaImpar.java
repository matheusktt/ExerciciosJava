/* 
 * Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha, 
 * inclusive o X, se for o caso.
 */


import java.util.Scanner;

public class SequenciaImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int valor = sc.nextInt();
		
		System.out.println("Lista de número(s) impares até " + valor);
		
		for (int i = 0; i <= valor; i++ ) {
			int impar = i % 2;
			
			if(impar != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}

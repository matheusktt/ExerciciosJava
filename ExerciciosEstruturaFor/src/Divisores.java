// Ler um número inteiro N e mostrar todos os seus divisores

import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int N = sc.nextInt();
		
		System.out.println("Divisores de " + N);
		
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}

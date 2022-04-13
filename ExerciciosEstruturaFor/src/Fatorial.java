// Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.


import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número para calcular seu fatorial: ");
		int N = sc.nextInt();
				
		int fatorial = 1;
		for (int i=1; i<=N; i++) {
			fatorial = fatorial * i;
		}
		
		System.out.print("O fatorial de " + N + " é: " + fatorial);
		
		sc.close();
	}

}

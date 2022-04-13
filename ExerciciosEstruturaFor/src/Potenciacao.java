/* 
 * Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas, 
 * come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor
 */


import java.util.Scanner;

public class Potenciacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int N =  sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			int quadrado = i * i;
			int cubo = i * i * i;
			
			System.out.printf("%d %d %d %n", i, quadrado, cubo);
		}
		
		sc.close();
	}

}

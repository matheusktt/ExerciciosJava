/* 
 * Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
 * Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando
 * essas informa��es conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */


import java.util.Scanner;

public class VerificaIntervalo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i = 1; i <= N; i++) {
			 int X = sc.nextInt();
			 if(X >= 10 && X <= 20) {
				 in +=1;
			 }else {
				 out+=1;
			 }
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}

}

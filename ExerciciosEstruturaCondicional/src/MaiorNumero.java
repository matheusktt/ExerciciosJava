// Crie um algoritmo que receba 3 números e informe qual o maior entre eles.




import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros:");
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (A > B && A > C) {
			System.out.printf(A + " É o maior número.");
		}else if (B > A && B > C) {
			System.out.printf(B + " É o maior número.");
		}else {
			System.out.printf(C + " É o maior número.");		}
		
		sc.close();
	}

}

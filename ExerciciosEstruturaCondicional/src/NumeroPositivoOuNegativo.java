//Crie um algoritmo que leia um número diferente de zero e diga se este número é positivo ou negativo.



import java.util.Scanner;

public class NumeroPositivoOuNegativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.printf(numero + " é positivo.");
		}else if (numero < 0) {
			System.out.printf(numero + " é negativo.");
		}else {
			System.out.printf(numero + " é neutro.");
		} 
		
		sc.close();
	}

}

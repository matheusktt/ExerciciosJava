//Crie um algoritmo que leia um n�mero diferente de zero e diga se este n�mero � positivo ou negativo.



import java.util.Scanner;

public class NumeroPositivoOuNegativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.printf(numero + " � positivo.");
		}else if (numero < 0) {
			System.out.printf(numero + " � negativo.");
		}else {
			System.out.printf(numero + " � neutro.");
		} 
		
		sc.close();
	}

}

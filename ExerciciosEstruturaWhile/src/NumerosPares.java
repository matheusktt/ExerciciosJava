// Escreva um programa que mostre todos os n�meros pares de 1 at� 100



public class NumerosPares {

	public static void main(String[] args) {
		
		int numero = 0;
		
		System.out.println("Numeros pares do 1 at� o 100");
		while (numero < 100) {
			numero ++;
			if (numero % 2 == 0) {
				System.out.println("numero " + numero);
			}
		}
	}
}

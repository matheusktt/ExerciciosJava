// Escreva um programa que mostre todos os n�meros impares de 1 at� 200



public class NumerosImpares {

	public static void main(String[] args) {
		
		int numero = 0;
		
		System.out.println("Numeros impares do 1 at� o 200");
		while (numero < 200) {
			numero++;
			if (numero % 2 != 0) {
				System.out.println("numero " + numero);
			}
		}
	}
}
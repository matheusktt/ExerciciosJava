/*
 * Criar um vetor de strings e ler determinada posição, tratar possíveis exceções.
 */

package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Posições do vetor: ");
			String[] vect = sc.nextLine().split(" ");
			System.out.print("Ler posição: ");
			int posicao = sc.nextInt();
			System.out.print("valor: ");
			System.out.println(vect[posicao]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida.");
		}
		catch (InputMismatchException e) {
			System.out.println("Erro valor inválido.");
		}
				
		sc.close();
	}

}

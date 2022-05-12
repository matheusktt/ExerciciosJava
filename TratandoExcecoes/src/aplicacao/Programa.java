/*
 * Criar um vetor de strings e ler determinada posi��o, tratar poss�veis exce��es.
 */

package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Posi��es do vetor: ");
			String[] vect = sc.nextLine().split(" ");
			System.out.print("Ler posi��o: ");
			int posicao = sc.nextInt();
			System.out.print("valor: ");
			System.out.println(vect[posicao]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posi��o inv�lida.");
		}
		catch (InputMismatchException e) {
			System.out.println("Erro valor inv�lido.");
		}
				
		sc.close();
	}

}

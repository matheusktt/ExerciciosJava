/*
 * Fazer um programa para ler dois números inteiros L e C, e depois ler
 * uma matriz de L linhas por C colunas contendo números inteiros,
 * podendo haver repetições. Em seguida, ler um número inteiro X que
 * pertence à matriz. Para cada ocorrência de X, mostrar os valores à
 * esquerda, acima, à direita e abaixo de X, quando houver, conforme
 * exemplo.
 */



import java.util.Scanner;

public class LocalizarValores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Linhas da matriz: ");
		int L = sc.nextInt();
		System.out.print("Colunas da matriz: ");
		int C = sc.nextInt();
		
		int [][] matriz	= new int[L][C];
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite um número da matriz para localizar sua posição: ");
		int x = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i<matriz.length; i++) {
			for(int j = 0; j<matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					System.out.println("Position " + i + "," + j);
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}

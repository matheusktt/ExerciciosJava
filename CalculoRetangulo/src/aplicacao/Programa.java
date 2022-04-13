/*
 * Fazer um programa para ler os valores da largura e altura de um ret�ngulo. Em seguida, mostrar na tela o 
 * valor de sua �rea, per�metro e diagonal. 
 */

package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		
		System.out.print("Digite a largura: ");
		double largura = sc.nextDouble();
		
		System.out.print("Digite a altura: ");
		double altura = sc.nextDouble();
		System.out.println();
		
		retangulo = new Retangulo(largura, altura);
				
		System.out.println(retangulo);
		
		sc.close();
	}

}
/*
 * Fazer um programa para ler os dados de N figuras (N fornecido pelo usuário), e depois mostrar as áreas 
 * destas figuras na mesma ordem em que foram digitadas.
 */

package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enums.Cores;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Forma> lista = new ArrayList<>();
		
		System.out.print("Entre com o numero de formas: ");
		
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Forma " + i + " :");
			System.out.print("Circulo ou Retângulo (c/r) ? ");
			char forma = sc.next().charAt(0);
			System.out.print("Cor (preto/azul/vermelho): ");
			Cores cor = Cores.valueOf(sc.next());
			if (forma == 'r') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				lista.add(new Retangulo(cor, largura, altura));
			}
			else{
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				lista.add(new Circulo(cor, raio));
			}
		}
		
		System.out.println();
		System.out.println("Areas das formas:");
		
		for (Forma forma : lista) {
			System.out.println(String.format("%.2f", forma.area()));
		}
		
		sc.close();
	}

}
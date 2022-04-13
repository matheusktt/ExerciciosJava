/*
 *  Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
 *  Em seguida, calcule e mostre:  
 *  a) A área do triângulo retângulo que tem A por base e C por altura.
 *  b) a área do círculo de raio C. (pi = 3.14159) 
 *  c) a área do trapézio que tem A e B por bases e C por altura. 
 *  d) a área do quadrado que tem lado B. 
 *  e) a área do retângulo que tem lados A e B
 */

package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.CalculaArea;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		System.out.println("Digite o valor de A, B e C:");
		
		A = sc.nextDouble(); 
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f%n", CalculaArea.calculaTriangulo(A, C));
		System.out.printf("CIRCULO: %.3f%n", CalculaArea.calculaCiruculo(C));
		System.out.printf("TRAPEZIO: %.3f%n", CalculaArea.calculaTrapezio(A, B, C));
		System.out.printf("QUADRADO: %.3f%n", CalculaArea.calculaQuadrado(B));
		System.out.printf("RETANGULO: %.3f%n", CalculaArea.calculaRetangulo(A, B));
		
		sc.close();
	}

}

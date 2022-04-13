/*
 *  Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. 
 *  Em seguida, calcule e mostre:  
 *  a) A �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
 *  b) a �rea do c�rculo de raio C. (pi = 3.14159) 
 *  c) a �rea do trap�zio que tem A e B por bases e C por altura. 
 *  d) a �rea do quadrado que tem lado B. 
 *  e) a �rea do ret�ngulo que tem lados A e B
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

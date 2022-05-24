package application;

/*
 * Algumas fun��es matem�ticas em Java
 * � sqrt � raiz quadrada
 * � pow � potencia��o
 * � abs � valor absoluto
 * Maiores informa��es: java.lang.Math
 * A = Math.sqrt(x); Vari�vel A recebe a raiz quadrada de x
 * A = Math.pow(x, y); Vari�vel A recebe o resultado de x elevado a y
 * A = Math.abs(x); Vari�vel A recebe o valor absoluto de x
 */

public class Program {

	public static void main(String[] args) {
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		A = Math.pow(x, y);
		B = Math.pow(x, 2);
		C = Math.pow(5, 2);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
	}

}

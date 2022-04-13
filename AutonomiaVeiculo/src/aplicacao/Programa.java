/*
 * Efetuar o c�lculo da quantidade de litros de combust�vel gasta em uma viagem, utilizando um autom�vel que faz 
 * 12 Km por litro. Para obter o c�lculo, o usu�rio deve fornecer o tempo gasto na viagem e a velocidade m�dia. 
 * Desta forma, ser� poss�vel obter a dist�ncia percorrida com a f�rmula DISTANCIA = TEMPO * VELOCIDADE. 
 * Tendo o valor da dist�ncia, basta calcular a quantidade de litros de combust�vel utilizada na viagem com a 
 * f�rmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade m�dia, 
 * tempo gasto, a dist�ncia percorrida e a quantidade de litros utilizada na viagem.
 */

package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.AutonomiaVeiculo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		AutonomiaVeiculo aut = new AutonomiaVeiculo();
		
		System.out.print("Horas de viagem: ");
		double tempoViagem = sc.nextDouble();
		
		System.out.print("Velocidade m�dia: ");
		double velocidadeMedia = sc.nextDouble();
		
		aut = new AutonomiaVeiculo(tempoViagem, velocidadeMedia);
		
		System.out.printf("Dist�ncia percorrida = %.0fKM %n", aut.distanciaPercorrida());
		System.out.printf("Combust�vel utilizado = %.2fL", aut.combustivelUtilizado());
		
		sc.close();
	}

}
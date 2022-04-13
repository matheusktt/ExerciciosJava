/*
 * Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 
 * 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média. 
 * Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. 
 * Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a 
 * fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média, 
 * tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem.
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
		
		System.out.print("Velocidade média: ");
		double velocidadeMedia = sc.nextDouble();
		
		aut = new AutonomiaVeiculo(tempoViagem, velocidadeMedia);
		
		System.out.printf("Distância percorrida = %.0fKM %n", aut.distanciaPercorrida());
		System.out.printf("Combustível utilizado = %.2fL", aut.combustivelUtilizado());
		
		sc.close();
	}

}
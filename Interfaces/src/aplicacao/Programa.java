/*
 * Uma locadora brasileira de carros cobra um valor por hora para loca��es de at�
 * 12 horas. Por�m, se a dura��o da loca��o ultrapassar 12 horas, a loca��o ser�
 * cobrada com base em um valor di�rio. Al�m do valor da loca��o, � acrescido no
 * pre�o o valor do imposto conforme regras do pa�s que, no caso do Brasil, � 20%
 * para valores at� 100.00, ou 15% para valores acima de 100.00. Fazer um
 * programa que l� os dados da loca��o (modelo do carro, instante inicial e final da
 * loca��o), bem como o valor por hora e o valor di�rio de loca��o. O programa
 * deve ent�o gerar a nota de pagamento (contendo valor da loca��o, valor do
 * imposto e valor total do pagamento) e informar os dados na tela. Veja os
 * exemplos.
 */

package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import modelo.entidades.AluguelCarros;
import modelo.entidades.Veiculo;
import modelo.servicos.AluguelServico;
import modelo.servicos.TaxaServicoBrasil;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do Aluguel");
		System.out.print("Modelo do carro: ");
		String modelo = sc.nextLine();
		System.out.print("Entrada (DD/MM/AAAA HH:mm): ");
		Date inicio = sdf.parse(sc.nextLine());
		System.out.print("Saida (DD/MM/AAAA HH:mm): ");
		Date fim = sdf.parse(sc.nextLine());
		
		AluguelCarros aluguel = new AluguelCarros(inicio, fim, new Veiculo(modelo));

		System.out.print("Entre com o pre�o por hora: ");
		double precoHora = sc.nextDouble();
		System.out.print("Entre com o pre�o por dia: ");
		double precoDia = sc.nextDouble();
		
		AluguelServico aluguelServico = new AluguelServico(precoDia, precoHora, new TaxaServicoBrasil());
		
		aluguelServico.processaFatura(aluguel);

		System.out.println("FATURA:");
		System.out.println("Pagamento Basico: " + String.format("%.2f", aluguel.getFatura().getPagamentoBasico()));
		System.out.println("Taxa: " + String.format("%.2f", aluguel.getFatura().getTaxa()));
		System.out.println("Total pagamento: " + String.format("%.2f", aluguel.getFatura().getPagamentoTotal()));
		
		sc.close();
	}
}
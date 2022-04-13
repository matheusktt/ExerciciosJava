/*
 * Uma locadora brasileira de carros cobra um valor por hora para locações de até
 * 12 horas. Porém, se a duração da locação ultrapassar 12 horas, a locação será
 * cobrada com base em um valor diário. Além do valor da locação, é acrescido no
 * preço o valor do imposto conforme regras do país que, no caso do Brasil, é 20%
 * para valores até 100.00, ou 15% para valores acima de 100.00. Fazer um
 * programa que lê os dados da locação (modelo do carro, instante inicial e final da
 * locação), bem como o valor por hora e o valor diário de locação. O programa
 * deve então gerar a nota de pagamento (contendo valor da locação, valor do
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

		System.out.print("Entre com o preço por hora: ");
		double precoHora = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
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
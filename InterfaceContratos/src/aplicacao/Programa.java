/*
 * Uma empresa deseja automatizar o processamento de seus contratos. O processamento de um contrato consiste 
 * em gerar as parcelas a serem pagas para aquele contrato, com base no número de meses desejado.
 * A empresa utiliza um serviço de pagamento online para realizar o pagamento das parcelas. Os serviços de 
 * pagamento online tipicamente cobram um juro mensal, bem como uma taxa por pagamento. Por enquanto, o serviço 
 * contratado pela empresa é o do Paypal, que aplica juros simples de 1% a cada parcela, mais uma taxa de pagamento
 * de 2%. Fazer um programa para ler os dados de um contrato (número do contrato, data do contrato, e valor total
 * do contrato). Em seguida, o programa deve ler o número de meses para parcelamento do contrato, e daí gerar os
 * registros de parcelas a serem pagas (data e valor), sendo a primeira parcela a ser paga um mês após a data 
 * do contrato, a segunda parcela dois meses após o contrato e assim por diante. Mostrar os dados das parcelas 
 * na tela.
 */

package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Servicos.ServicoContrato;
import Servicos.ServicoPayPal;
import entidades.Contratos;
import entidades.Parcelas;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do contrato");
		System.out.print("Numero: ");
		Integer numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor do contrato: ");
		Double valorContrato = sc.nextDouble();
		
		Contratos contrato = new Contratos(numero, data, valorContrato);
		
		System.out.print("Entre com o numero de parcelas: ");
		int meses = sc.nextInt();
		
		ServicoContrato servicoContrato = new ServicoContrato(new ServicoPayPal());
		
		servicoContrato.processaContrato(contrato, meses);
		
		System.out.println("PARCELAS:");
		for (Parcelas parcela : contrato.getParcelas()) {
			System.out.println(parcela);
		}
		
		sc.close();
	}
}
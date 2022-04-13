package Servicos;

public class ServicoPayPal implements ServicoPagamentoOnline{
	
	//taxa de juros 2%
	private static final double TAXA_PAGAMENTO = 0.02;
	//taxa de juro paypal 1%
	private static final double JUROS_MENSAL = 0.01;
	
	@Override
	public double TaxaPagamento(double valor) {
		return valor * TAXA_PAGAMENTO;
	}

	@Override
	public double juros(double valor, int meses) {
		return valor * meses * JUROS_MENSAL;
	}

}
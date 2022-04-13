package services;

public class PaypalService implements OnlinePaymenteService {
	
	//taxa de juros do paypal
	public static final double PAYMENT_FEE = 0.02;
	//taxa de juros mensal
	public static final double MONTHLY_INSTEREST = 0.01;
	
	@Override
	public double paymentFee(double amount) {
		return amount * PAYMENT_FEE;
	}

	@Override
	public double intereset(double amount, int months) {
		return amount * months * MONTHLY_INSTEREST;
	}
}
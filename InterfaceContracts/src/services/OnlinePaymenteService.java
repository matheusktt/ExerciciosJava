package services;

public interface OnlinePaymenteService {
	
	double paymentFee(double amount);
	double intereset(double amount, int months);
}

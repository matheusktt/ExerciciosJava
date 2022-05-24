package application;

import services.Printer;

public class Program {

	public static void main(String[] args) {
		
		Printer<Integer> printer = new Printer<>(23);
		Printer<Double> printerDouble = new Printer<>(29.90);
		Printer<String> printerString = new Printer<>("Olá Mundo!");
		
		printer.Print();
		printerDouble.Print();
		printerString.Print();
	}
}
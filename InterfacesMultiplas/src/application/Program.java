package application;

import devices.ConcreteScanner;
import devices.ComboDevice;
import devices.ConcretePrinter;

public class Program {

	public static void main(String[] args) {
		
		ConcretePrinter printer = new ConcretePrinter("1080");
		printer.processDoc("My letter");
		printer.print("My letter");
		
		System.out.println();
		
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();

		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());

	}
}
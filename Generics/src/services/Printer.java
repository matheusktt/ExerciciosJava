package services;

public class Printer <T>{
	
	T thingToPrint;
	
	public Printer(T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}
	
	public void Print() {
		System.out.println(thingToPrint);
	}
}
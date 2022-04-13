package model.entities;

import model.enums.Color;

public class Rectangle extends AbstractShape{
	
	private Double wigth;
	private Double heigth;
	
	public Rectangle(Color color, Double wigth, Double heigth) {
		super(color);
		this.wigth = wigth;
		this.heigth = heigth;
	}
	
	public Double getWigth() {
		return wigth;
	}

	public void setWigth(Double wigth) {
		this.wigth = wigth;
	}

	public Double getHeigth() {
		return heigth;
	}

	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}

	@Override
	public double area() {
		return wigth * heigth;
	}

}
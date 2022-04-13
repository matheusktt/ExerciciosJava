package entitites;

import java.util.Date;

public class Installament {
	
	private Date dueDate;
	private Double amount;
	
	public Installament() {

	}

	public Installament(Date dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}

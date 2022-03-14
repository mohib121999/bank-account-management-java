import java.util.*;
public abstract class Operation  {
	
	protected int num;
	protected double montant;
	protected String date;


	public Operation(int numero, double montant, String date) {
		this.num = numero;
		this.montant = montant;
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
}

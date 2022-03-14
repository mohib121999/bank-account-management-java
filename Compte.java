import java.util.ArrayList;
import java.util.List;

public abstract class Compte {
	protected int code ;
	protected static double solde, sommeAdd =0 ;
	private List <Operation> operations = new ArrayList <Operation>();
	public Compte (int code, double solde) {
		this.code = code;
		this.solde = solde;
	}
	
	
	public void verser (double montant , Compte compte) throws versementException {
		if (montant <0) throw new versementException ("essayer un autre montant ") ;
		String name = compte.getClass().getName();
		System.out.println(name+ "\t le solde est : "+getSolde());
		System.out.println("verser\t " +montant+ " TD");
		System.out.println(name+ "\t le solde devient: " +(solde += montant));
		sommeAdd+=montant;
		System.out.println("\n\n");
	} 
    
	public abstract void retrait( double montant,Compte Compte )  throws retraitException;
	
	public void transfertMoney(double montant, Compte compte) throws transfertException {
		if (solde < montant ) throw new transfertException("vous ne pouvez pas transf"
				+ "erer de l'argent");
			String name = compte.getClass().getName();
			System.out.println(name+ "\t le solde est : "+getSolde());
			System.out.println("transfert\t " +montant+ " dt");
			System.out.println(name+ "\t le solde devient: " +(solde -= montant));
		System.out.println("\n\n");
	}
	public void afficherSommeVerser() {
		System.out.println("la somme de versement est :" + sommeAdd);
	}
	
	public List<Operation> getOpearations() {
		return operations;
	}

	public void addOpearations(Operation operation) {
		operations.add(operation);
	}
	public abstract void ajouterInteret(Compte compteEpargne);
	public abstract void afficherSomme();

	public int getCode() {
		return code;
	}
	public double getSolde() { 
		return solde;
	}
}

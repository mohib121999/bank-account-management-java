
public class CompteCourant extends Compte{
	private double d�couvert, s ;
	public CompteCourant(int code, double solde,double d�couvert) {
		super(code, solde);
		this.d�couvert=d�couvert;
	}
	
	public void retrait( double montant, Compte CompteCourant ) throws retraitException {
		String name = CompteCourant.getClass().getName();
		System.out.println(name+ "\t le solde est : "+getSolde());
		System.out.println("retirer\t " +montant+ "TD");
		if (solde-montant < -d�couvert) throw new retraitException ("tu ne peux pas retirer");
				System.out.println(name+ "\t le solde devient: " +(solde-=montant));
				s+=montant;
		System.out.println("\n\n");

	}
	
	public void ajouterInteret(Compte compteEpargne) {
		
	}
	
	public void afficherSomme() {
		System.out.println("la somme a retrait est :" + s);
	}
}


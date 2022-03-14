
public class compteEpargne extends Compte {
    protected double s;
	public compteEpargne(int code, double solde) {
		super(code, solde);
	}
	@Override
	public void retrait(double montant, Compte CompteEpargne ) throws retraitException {
		String name = CompteEpargne.getClass().getName();
		System.out.println(name+ "\t le solde est de : "+getSolde());
		System.out.println("retirer\t " +montant+ " DT");
		if (solde < montant) throw new retraitException ("tu ne peux pas retirer ");
			System.out.println(name+ "\t le solde devient: " +(solde -= montant));
			s+=montant;
		
		System.out.println("\n\n");
	}
	
	public void ajouterInteret (Compte CompteEpargne ) {
		String name = CompteEpargne.getClass().getName();
		System.out.println(name+ "\t le solde est : "+getSolde());
		System.out.println("ajouter interet \t " +getSolde()*0.02+ " TD");
		this.solde *= 1.02 ;
		System.out.println(name+ "\t le solde devient: " +getSolde());
		System.out.println("\n\n");
	}

	public void afficherSomme() {
		System.out.println("la somme retrait est :" + s);

	}

}


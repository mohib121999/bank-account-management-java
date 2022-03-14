public class main {
	public static void main (String[] args) {
		Compte compte1 = new compteEpargne (1705,150.0);
		
		Compte compteEpargne = new compteEpargne (0000,150.0);
		try {
			compteEpargne.verser(100, compteEpargne);
		} catch (versementException e1) {
			System.out.println (e1.getMessage());
		}
		try {
			compteEpargne.retrait (1000,compteEpargne);
		} catch (retraitException e1) {
			System.out.println (e1.getMessage());
		}
		try {
			compteEpargne.retrait(60, compteEpargne);
		} catch (retraitException e1) {
			System.out.println (e1.getMessage());
		}
		compteEpargne.ajouterInteret(compteEpargne);
		compteEpargne.afficherSommeVerser();
		compteEpargne.afficherSomme();
		
		System.out.println("####################################################################################################### ");
		
		Compte compteCourant = new CompteCourant (1234,600, 20);
		try {
			compteCourant.verser(200, compteCourant);
		} catch (versementException e) {
			System.out.println (e.getMessage());
		}
		System.out.println(compteCourant.solde);
		try {
			compteCourant.retrait (1200,compteCourant);
		} catch (retraitException e) {
			System.out.println (e.getMessage());
		}
		try {
			compteCourant.retrait (600,compteCourant);
		} catch (retraitException e) {
			System.out.println (e.getMessage());
		}
		System.out.println(Compte.solde);
		try {
			compteCourant.transfertMoney(500, compteCourant);
		} catch (transfertException e1) {
			System.out.println (e1.getMessage());
		}
		try {
			compteCourant.transfertMoney(100, compteCourant);
		} catch (transfertException e) {
			System.out.println (e.getMessage());
		}
		try {
			compteCourant.retrait (50,compteCourant);
		} catch (retraitException e) {
			System.out.println (e.getMessage());
		}
		compteCourant.afficherSomme();
		System.out.println("\n Mr Bekalti Mohib ");

		
	}

}

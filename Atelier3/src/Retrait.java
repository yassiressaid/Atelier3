import java.util.Scanner;

public class Retrait {
	private String nom;
	private String adresse;
	private static double solde = 50.00;

	public String getNom() {
		return nom;
	}

	public void setNom(String newNom) {
		nom = newNom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String newAdresse) {
		adresse = newAdresse;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double newSolde) {
		solde = newSolde;
	}

	public void retirer() {
		System.out.println("Saisir un montant");
		Scanner prix = new Scanner(System.in);
		double montant = prix.nextDouble();
		double reste = solde % 100.00;
		if (montant > solde || (solde < 100.00 && (reste < 100.00 && reste > 0))) {
			System.out.println("Votre solde est insuffisant pour le retrait. Tu as juste " + solde);
		} else {
			System.out.println("Votre solde aprés retrait: " + (solde - montant));
			prix.close();
		}
	}
}

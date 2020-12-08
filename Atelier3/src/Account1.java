
public class Account1 {
	private String nom;
	private String adresse;
	private double solde;

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

	public void afficher() {
		System.out.println(nom + " habite à " + "(" + adresse + ")" + " - infos solde " + solde + " DH");
	}
}

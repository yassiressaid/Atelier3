
public class Account {
	public  String nom;
	 public  String adresse;
	 public  double solde;
	 
	 public void afficherInfosSolde() {
		 System.out.print(nom + " habite à " + "(" + adresse + ")" + " - infos solde " + solde + " DH" + " et intérêt ");
	 }
	 
	 public void calculerInterer() {
		 System.out.println(solde * 7 / 100);
	 }
}

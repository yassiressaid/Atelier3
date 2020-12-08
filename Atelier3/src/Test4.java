
public class Test4 {
	 public static void main(String[] args) {
		 Account account = new Account();
		 // account 1
		 account.nom = "El Alami Hassan";
		 account.adresse = "Safi";
		 account.solde = 14765.8;
		 account.afficherInfosSolde();
		 account.calculerInterer();
		 
		 // account 2
		 account.nom = "Karimi Khalid";
		 account.adresse = "Casablanca";
		 account.solde = 7654.0;
		 account.afficherInfosSolde();
		 account.calculerInterer();
	 }
}

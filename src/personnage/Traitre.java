package personnage;

public class Traitre extends Samourai {
	private int nvTraitre = 0 ;
	public Traitre(String nom, String boissonPref, int qttArgent,String seigneur) {
		super(nom, boissonPref, qttArgent,seigneur);
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis un traitre de niveau " + nvTraitre);
	}
	
}

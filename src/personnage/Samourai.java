package personnage;

public class Samourai extends Ronin {

	private String seigneur;

	public Samourai(String nom, String boissonPref, int qttArgent,String seigneur) {
		super(nom, boissonPref, qttArgent);
		this.seigneur = seigneur;
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir " + seigneur);
	}
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choissir comme boisson? Tiens, je vais prendre du  " + boisson);
	}

	
}

package personnage;

public class Commerçant extends Humain {
	private int qttArgent = getQttArgent();
	public Commerçant(String nom, String boissonPref,int qttArgent) {
		super(nom,boissonPref,qttArgent);
	}
	public int seFaireExtorquer() {
		qttArgent = 0;
		parler("J'ai tout perdu ! Le monde est trop injuste... ");
		return qttArgent;
	}
	public void recevoir(int don) {
		qttArgent += don;
		parler(qttArgent + " sous ! Je te remercie genereux donateur !");
	}
}

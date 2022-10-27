package personnage;

public class Humain {
	private String nom;
	private String boissonPref;
	private int qttArgent;
	public Humain(String nom, String boissonPref, int qttArgent) {
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.qttArgent = qttArgent;
	}
	private String prendreParole() {
		return "L'humain " + nom + " : ";
	}
	private void parler(String texte) {
		System.out.println(prendreParole() + "< " + texte + " >");
	}
		public void direBonjour() {
		parler("Bonjour ! je m'appelle " + nom + " et j'aime boire du " + boissonPref);
	}
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonPref + " ! Gloups !");
	}
	public int acheter(String bien, int prix) {
		if (prix > qttArgent) {
			parler("j'ai "+ qttArgent +" en poche, je ne peux pas m'acheter " + bien + " , il coute " + prix + ".");
		}
		else {
			parler("j'ai "+ qttArgent +" en poche, je peux m'acheter " + bien + " a " + prix +".");
			qttArgent -= prix;
		}
		return qttArgent;
	}
	public int gagnerArgent(int gain) {
		qttArgent += gain;
		return qttArgent;
	}
	public int perdreArgent(int perte) {
		qttArgent -= perte;
		return qttArgent;
	}









}

package personnage;

public class Humain {
	private String nom;
	private String boissonPref;
	private int qttArgent;
	private String tab_connaissance[] = new String[30];
	private int nbConnaissance=0;
	private int lgMemoire = 30;
	public Humain(String nom, String boissonPref, int qttArgent) {
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.qttArgent = qttArgent;
	}
	protected String prendreParole() {
		return "( " + nom + " ) : ";
	}
	protected void parler(String texte) {
		System.out.println(prendreParole() + "< " + texte + " >");
	}
	protected int getQttArgent() {
		return qttArgent;
	}
	protected String getNom() {
		return nom;
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
	protected int gagnerArgent(int gain) {
		qttArgent += gain;
		return qttArgent;
	}
	protected int perdreArgent(int perte) {
		qttArgent -= perte;
		return qttArgent;
	}
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain.getNom());
		autreHumain.repondre(this);
	}

	private String[] memoriser(String nomHumain) {
		if (nbConnaissance<lgMemoire) {
			tab_connaissance[nbConnaissance] = nomHumain;
			nbConnaissance +=1 ;
		}
		else {
			for (int i=0;i<lgMemoire;i++) {
				tab_connaissance[i] = tab_connaissance[i+1];
				tab_connaissance[nbConnaissance] = nomHumain;
			}
		}
		return tab_connaissance;
	}
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain.getNom());
		
	}
	public void listerConnaissance() {
		int i;
		String rencontre = "";
		for (i=0;i<nbConnaissance-1;i++) {
			if (tab_connaissance[i] != null) {
			rencontre += tab_connaissance[i] + ", ";
			}
		}
		rencontre += tab_connaissance[i] + ".";
		parler("Je connais beaucoup de monde dont " + rencontre);
		
	}







}

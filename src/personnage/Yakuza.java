package personnage;
import personnage.Commerçant;
public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	private int qttArgent = getQttArgent();
	private String nom = getNom();
	public Yakuza(String nom,String boissonPref,int qttArgent,String clan,int reputation) {
		super(nom,boissonPref,qttArgent);
		this.clan = clan;
		this.reputation = reputation; 
	}
	public int getReput() {
		return reputation;
	}
	public void extorquer(Commerçant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		parler(victime.getNom() + " si tu tiens à la vie, donne moi ta bourse !");
		int qttArgentVictime = victime.getQttArgent();
		qttArgent += qttArgentVictime;
		victime.seFaireExtorquer();
		parler("J'ai piqué " + qttArgentVictime + " de " + victime.getNom() + ", ce qui me fait " + qttArgent + ".");
		reputation += 1;
	}
}

package personnage;

public class Ronin extends Humain {
	private int honneur;
	private String nom = getNom();
	private int qttArgent = getQttArgent();
	public Ronin(String nom,String boissonPref,int qttArgent,int honneur) {
		super(nom,boissonPref,qttArgent);
		this.honneur = honneur;
	}
	public int donner(Commerçant beneficiaire) {
		int don = (qttArgent * 10) / 100  ;
		parler(beneficiaire.getNom() + " prend ces "+ don + " sous.");
		honneur += 1;
		return don;
	}
}

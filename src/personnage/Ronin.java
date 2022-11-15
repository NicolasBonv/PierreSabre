package personnage;
import personnage.Yakuza;
public class Ronin extends Humain {
	private String nom = getNom();
	private int qttArgent = getQttArgent();
	private int honneur = 1;
	public Ronin(String nom,String boissonPref,int qttArgent) {
		super(nom,boissonPref,qttArgent);
	}
	public int donner(Commerçant beneficiaire) {
		int don = (qttArgent * 10) / 100  ;
		parler(beneficiaire.getNom() + " prend ces "+ don + " sous.");
		honneur += 1;
		return don;
	}
	public void provoquer(Yakuza yakuza) {
		parler("Je t'ai retrouvé vermine, tu vas payer");
		int forceYakuza = yakuza.getReput();
		int forceRonin = honneur * 2;
		if (forceYakuza <= forceRonin) {
			honneur++;
			gagnerArgent(yakuza.getQttArgent());
			parler("Je t'ai eu petit yakuza");
			yakuza.parler("J'ai perdu mon duel et mes "+ yakuza.getQttArgent() + " sous, snif");}
		else {
			honneur--;
			perdreArgent(qttArgent);
			parler("j'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup");
		}
		}
	}

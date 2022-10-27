package histoire;
import personnage.Humain;
import personnage.Commerçant;
import personnage.Yakuza;
import personnage.Ronin;
public class HistoireTP4 {

	public static void main(String[] args) {
		Humain humain = new Humain("Nicolas","thé framboise",20);
		Commerçant commerçant = new Commerçant("Marco","thé",15);
		Yakuza yakuza = new Yakuza("Rowan le Gris","café",30,"Warsong",0);
		Ronin ronin = new Ronin("Paku le Rouge","lait fraise",60,1);
		
		/*System.out.println("--- Scenario de l'humain :");
		humain.direBonjour();
		humain.boire();
		humain.perdreArgent(5);
		humain.acheter("une théiere", 15);
		humain.gagnerArgent(5);
		humain.acheter("une voiture", 15000);
		humain.gagnerArgent(5);
		humain.acheter("du thé framboise", 10);*/
		
		/*System.out.println("--- Scenario du commerçant :");
		commerçant.direBonjour();
		commerçant.seFaireExtorquer();
		commerçant.recevoir(15);
		commerçant.boire();*/
		
		/*System.out.println("--- Scenario du Yakuza :");
		yakuza.direBonjour();
		yakuza.extorquer(commerçant);*/
		
		System.out.println("--- Scenario du Ronin :");
		ronin.direBonjour();
		int don = ronin.donner(commerçant);
		commerçant.recevoir(don);
		
		
	}

}

package histoire;
import personnage.Humain;
import personnage.Commerçant;
public class HistoireTP4 {

	public static void main(String[] args) {
		Humain nicolas = new Humain("Nicolas","Thé framboise",20);
		Commerçant commerçant = new Commerçant("Commerçant","Thé",15);
		System.out.println("--- Scenario de l'humain :");
		nicolas.direBonjour();
		nicolas.boire();
		nicolas.perdreArgent(5);
		nicolas.acheter("une théiere", 15);
		nicolas.gagnerArgent(5);
		nicolas.acheter("une voiture", 15000);
		nicolas.gagnerArgent(5);
		nicolas.acheter("du thé framboise", 10);
		System.out.println("--- Scenario du commerçant :");
		commerçant.direBonjour();
		commerçant.seFaireExtorquer();
		commerçant.recevoir(15);
		commerçant.boire();
	}

}

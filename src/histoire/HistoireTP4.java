package histoire;
import personnage.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain nicolas = new Humain("Nicolas","Thé framboise",20);
		nicolas.direBonjour();
		nicolas.boire();
		nicolas.perdreArgent(5);
		nicolas.acheter("une théiere", 15);
		nicolas.gagnerArgent(5);
		nicolas.acheter("une voiture", 15000);
		nicolas.gagnerArgent(5);
		nicolas.acheter("du thé framboise", 10);
	}

}

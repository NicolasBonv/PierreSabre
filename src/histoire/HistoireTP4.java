package histoire;
import personnage.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain nicolas = new Humain("Nicolas","Th� framboise",20);
		nicolas.direBonjour();
		nicolas.boire();
		nicolas.perdreArgent(5);
		nicolas.acheter("une th�iere", 15);
		nicolas.gagnerArgent(5);
		nicolas.acheter("une voiture", 15000);
		nicolas.gagnerArgent(5);
		nicolas.acheter("du th� framboise", 10);
	}

}

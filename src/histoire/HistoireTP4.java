package histoire;
import personnage.Humain;
import personnage.Commer�ant;
public class HistoireTP4 {

	public static void main(String[] args) {
		Humain nicolas = new Humain("Nicolas","Th� framboise",20);
		Commer�ant commer�ant = new Commer�ant("Commer�ant","Th�",15);
		System.out.println("--- Scenario de l'humain :");
		nicolas.direBonjour();
		nicolas.boire();
		nicolas.perdreArgent(5);
		nicolas.acheter("une th�iere", 15);
		nicolas.gagnerArgent(5);
		nicolas.acheter("une voiture", 15000);
		nicolas.gagnerArgent(5);
		nicolas.acheter("du th� framboise", 10);
		System.out.println("--- Scenario du commer�ant :");
		commer�ant.direBonjour();
		commer�ant.seFaireExtorquer();
		commer�ant.recevoir(15);
		commer�ant.boire();
	}

}

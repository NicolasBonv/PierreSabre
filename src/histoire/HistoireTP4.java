package histoire;
import personnage.Humain;
import personnage.Commer�ant;
import personnage.Yakuza;
public class HistoireTP4 {

	public static void main(String[] args) {
		Humain humain = new Humain("Nicolas","th� framboise",20);
		Commer�ant commer�ant = new Commer�ant("Marco","th�",15);
		Yakuza yakuza = new Yakuza("Rowan le Gris","caf�",30,"Warsong",0);
		
		/*System.out.println("--- Scenario de l'humain :");
		humain.direBonjour();
		humain.boire();
		humain.perdreArgent(5);
		humain.acheter("une th�iere", 15);
		humain.gagnerArgent(5);
		humain.acheter("une voiture", 15000);
		humain.gagnerArgent(5);
		humain.acheter("du th� framboise", 10);*/
		
		/*System.out.println("--- Scenario du commer�ant :");
		commer�ant.direBonjour();
		commer�ant.seFaireExtorquer();
		commer�ant.recevoir(15);
		commer�ant.boire();*/
		
		System.out.println("--- Scenario du Yakuza :");
		yakuza.direBonjour();
		yakuza.extorquer(commer�ant);
	}

}

package histoire;
import personnage.Humain;
import personnage.Commer�ant;
import personnage.Yakuza;
import personnage.Ronin;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commer�ant marco = new Commer�ant("Marco","th�", 20);
		Commer�ant chonin = new Commer�ant("Chonin","th�", 40);
		Commer�ant kumi = new Commer�ant("Kumi","th�", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong",0);
		Ronin roro = new Ronin("Roro", "shochu", 60,0);
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

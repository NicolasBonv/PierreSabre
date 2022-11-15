package histoire;
import personnage.Humain;
import personnage.Commerçant;
import personnage.Yakuza;
import personnage.Ronin;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commerçant marco = new Commerçant("Marco","thé", 20);
		Commerçant chonin = new Commerçant("Chonin","thé", 40);
		Commerçant kumi = new Commerçant("Kumi","thé", 10);
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

package gameProjectDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import gameProjectDemo.adapters.MernisServiceAdapter;
import gameProjectDemo.business.concretes.GamerManager;
import gameProjectDemo.entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		gamer.setGamerId(1);
		gamer.setName("Feride");
		gamer.setLastName("Karpınar");
		gamer.setDateOfBirth(1996);
		gamer.setIdentityNumber("31325158244");
	

		Gamer gamer2 = new Gamer();
		gamer2.setGamerId(2);
		gamer2.setName("Ümmü Betül");
		gamer2.setLastName("Kayam");
		gamer2.setDateOfBirth(1995);
		gamer2.setIdentityNumber("61786455620");
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(gamer);
		gamerManager.add(gamer2);

		System.out.println("-----Oyuncu Listesi-----");
		
		for (Gamer gamers : gamerManager.getAll()) {
			System.out.println(gamers.getName() + " " + gamers.getLastName());

		}
	}

}

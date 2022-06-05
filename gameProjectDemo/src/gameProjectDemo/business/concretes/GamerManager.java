package gameProjectDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;


import gameProjectDemo.business.abstracts.GamerCheckService;
import gameProjectDemo.business.abstracts.GamerService;

import gameProjectDemo.entities.concretes.Gamer;

public class GamerManager implements GamerService {

	
	private GamerCheckService gamerCheckService;
	List<Gamer> gamers;

	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
		gamers= new ArrayList<Gamer>();
		
	}

	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.CheckIfRealPerson(gamer)) {
			gamers.add(gamer);
			System.out.println(gamer.getName()+" "+gamer.getLastName()+" adlı oyuncu sisteme başarıyla eklendi");
		} else {
			System.out.println("Not a valid person");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Gamer> getAll() {
		
		return gamers;
	}

	@Override
	public Gamer getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void CheckIfRealPerson(Gamer gamer) {
		// TODO Auto-generated method stub

	}

}

package gameProjectDemo.business.concretes;

import gameProjectDemo.business.abstracts.GamerCheckService;
import gameProjectDemo.entities.concretes.Gamer;


public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		return true;
	}

	

}

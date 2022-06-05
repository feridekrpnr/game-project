package gameProjectDemo.dataAccess.concretes.hibernateImpls;

import java.util.ArrayList;
import java.util.List;

import gameProjectDemo.dataAccess.abstracts.GamerRepository;
import gameProjectDemo.entities.concretes.Gamer;

public class HibernateGamerRepository implements GamerRepository{

	
	List<Gamer> gamers = new ArrayList<>();
	@Override
	public void add(Gamer gamer) {
		gamers.add(gamer);
		
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Gamer getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

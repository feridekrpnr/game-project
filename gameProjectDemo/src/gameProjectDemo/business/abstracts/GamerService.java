package gameProjectDemo.business.abstracts;

import java.util.List;

import gameProjectDemo.entities.concretes.Gamer;

public interface GamerService {
     void add(Gamer gamer);
     void delete(Gamer gamer);
     void update(Gamer gamer);
     List<Gamer> getAll();
     Gamer getById(int id);
     
     
     void CheckIfRealPerson(Gamer gamer);
     
}

package gameProjectDemo.business.abstracts;

import gameProjectDemo.entities.concretes.Gamer;

public interface GamerCheckService {
   boolean CheckIfRealPerson(Gamer gamer);
}

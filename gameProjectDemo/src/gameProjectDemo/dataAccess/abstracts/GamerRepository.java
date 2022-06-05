package gameProjectDemo.dataAccess.abstracts;

import java.util.List;

import gameProjectDemo.entities.concretes.Gamer;

public interface GamerRepository {
	void add(Gamer gamer);
    void delete(Gamer gamer);
    void update(Gamer gamer);
    List<Gamer> getAll();
    Gamer getById(int id);

}

package dao;

import dto.PlayerDto;
import entity.Player;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class PlayerDao {
@PersistenceContext
    EntityManager manager;

public Player findByLoginForRegistation(PlayerDto playerDto){
    Query query=manager.createQuery("SELECT player FROM Player AS player WHERE player.login=:login",Player.class);
    query.setParameter("login",playerDto.getLogin());
    return (Player) query.getSingleResult();
}

public Player findByLoginAndPasswordForAuthentication(PlayerDto playerDto){
    Query query=manager.createQuery("SELECT player FROM Player AS player WHERE player.login=:login AND player.password=:password",Player.class);
    query.setParameter("login",playerDto.getLogin());
    return (Player) query.getSingleResult();
}

public void registrationUser(Player player){
    manager.persist(player);
}

public List<Player> getAllUsers(){
    Query query=manager.createQuery("SELECT player FROM Player AS player",Player.class);
    return query.getResultList();
}
}

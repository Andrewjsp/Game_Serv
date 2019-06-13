package dao;

import entity.Earner;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class EarnerDao {

@PersistenceContext(name = "persist")
    EntityManager manager;

public List<Earner> getList(){
    Query query=manager.createQuery("SELECT earner FROM Earner earner",Earner.class);
    return query.getResultList();
}

public Earner getEarner(Earner earner){
    Query query=manager.createQuery("SELECT Earner FROM Earner AS earner where earner.name=:name");
    query.setParameter("name",earner.getName());
    return (Earner) query.getSingleResult();
}
}

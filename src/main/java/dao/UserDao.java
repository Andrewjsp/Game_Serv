package dao;

import entity.User;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@RequestScoped
public class UserDao {
@PersistenceContext
    EntityManager manager;

public User getUser(String login,String password){
    Query query=manager.createQuery("SELECT User AS user FROM User WHERE user.login=:login AND user.password=:password");
    query.setParameter("login",login);
    query.setParameter("password",password);
    query.executeUpdate();
    return (User)query.getSingleResult();
}

public void addUser(User user){
    manager.persist(user);
}

public User findUser(User user){

    return manager.find(User.class,user);
}

public List<User> get(){
    Query query=manager.createQuery("SELECT User FROM User ");
return query.getResultList();
}
}

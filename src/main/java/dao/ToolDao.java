package dao;

import entity.Tool;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class ToolDao {
@PersistenceContext
    EntityManager entityManager;

public List<Tool> getAllTool(){
    Query query=entityManager.createQuery("SELECT Tool FROM Tool");
    return query.getResultList();
}

public Tool descriptionTool(long toolId){
    Query query=entityManager.createQuery("SELECT Tool AS tool FROM Tool WHERE tool.id=:id ");
    query.setParameter("id",toolId);
    query.executeUpdate();
    return (Tool) query.getSingleResult();
}

}

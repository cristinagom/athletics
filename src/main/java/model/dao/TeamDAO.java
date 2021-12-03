package model.dao;

import model.entity.Team;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class TeamDAO implements InterfaceDAO<Team>{

    private EntityManagerFactory emf;
    private EntityManager manager;


    private void initHibernate() {

        emf = Persistence.createEntityManagerFactory("default");
    }

    public TeamDAO() {
        initHibernate();
    }

    public void create(Team t) {
        // Students: Add code!
    }

    public List<Team> find() {

        manager = emf.createEntityManager();
        manager.getTransaction().begin();
        Query query = manager.createQuery("FROM Team");
        return query.getResultList();
    }

    public void update(Team t) {

        // Students: Add code!
    }

    public void delete(Team t) {

        // Students: Add code!
    }
}

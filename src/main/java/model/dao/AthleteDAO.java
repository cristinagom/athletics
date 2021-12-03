package model.dao;

import model.entity.Athlete;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class AthleteDAO implements InterfaceDAO<Athlete> {

    private EntityManagerFactory emf;
    private EntityManager manager;


    private void initHibernate() {
        emf = Persistence.createEntityManagerFactory("default");
    }

    public AthleteDAO() {
        initHibernate();
    }

    @Override
    public void create(Athlete a) {
        // Students: Add code!
    }

    @Override
    public List<Athlete> find() {

        manager = emf.createEntityManager();
        manager.getTransaction().begin();
        Query query = manager.createQuery("FROM Athlete");
        return query.getResultList();
    }

    @Override
    public void update(Athlete a) {

        // Students: Add code!
    }

    @Override
    public void delete(Athlete a) {

        // Students: Add code!
    }
}
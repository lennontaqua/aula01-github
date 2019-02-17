
package br.com.centro.jpa;

import br.com.centro.interfaces.Repositorio;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;


public class JPARepositorio<T> implements Repositorio<T>{

    private EntityManager em;
    private Class<T> type;

    public JPARepositorio(Class<T> type) {
        this.type = type;
    }    

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public Class<T> getType() {
        return type;
    }
    
    
    private void getInTransaction(Runnable runnable){
        EntityTransaction transaction = em.getTransaction();
        if(!transaction.isActive()){
            transaction.begin();
        }
        try {
            runnable.run();
            transaction.commit();
        } catch (Exception e) {
            if(transaction.isActive()){
                transaction.rollback();
            }            
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public void insert(T... elements) throws Exception {
        Runnable insert = new Runnable() {
            @Override
            public void run() {
                for(T element : elements){
                    em.persist(element);
                }
            }
        };
        getInTransaction(insert);
    }

    @Override
    public void update(T... elements) throws Exception {
        Runnable update = new Runnable() {
            @Override
            public void run() {
                for(T element : elements){
                    em.merge(element);
                }
            }
        };
        getInTransaction(update);
    }

    @Override
    public void remove(T... elements) throws Exception {
       Runnable remove = new Runnable() {
            @Override
            public void run() {
                for(T element : elements){
                    element = em.merge(element);
                    em.remove(element);
                }
            }
        };
        getInTransaction(remove);
    }

    @Override
    public void closeConnection() {
        if(em.isOpen()){
            em.close();
        }
    }

    @Override
    public T select(Long key) {
        return em.find(type, key);
    }

    @Override
    public List<T> all() {
        String jSQL = "select e from " + type.getSimpleName() + " e";
        TypedQuery<T> query = em.createQuery(jSQL, type);
        try {
            return query.getResultList();
        } catch (NoResultException e) {
            return Collections.emptyList();
        }
    }
    
}


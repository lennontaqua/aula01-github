package br.com.centro.jpa;

import br.com.centro.interfaces.NomeRepositorio;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class JPANomeRepositorio<T> extends JPARepositorio<T> implements NomeRepositorio<T> {

    public JPANomeRepositorio(String queryName, Class<T> type) {

        super(type);
        this.queryName = queryName;

    }

    private String queryName;

    @Override
    public T select(String name) {
        EntityManager em = getEm();
        Class<T> type = getType();
        TypedQuery<T> query = em.createNamedQuery(queryName, type);
        query.setParameter("name", name);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public List<T> all(String name) {
        EntityManager em = getEm();
        Class<T> type = getType();
        TypedQuery<T> query = em.createNamedQuery(queryName, type);
        query.setParameter("name", name + "%");
        try {
            return query.getResultList();
        } catch (Exception e) {
            return Collections.emptyList();
        }

    }
}

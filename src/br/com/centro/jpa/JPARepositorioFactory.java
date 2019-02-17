package br.com.centro.jpa;

import br.com.centro.conexao.Conexao;
import br.com.centro.interfaces.NomeRepositorio;
import br.com.centro.interfaces.Repositorio;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

public class JPARepositorioFactory {

    public static <T> Repositorio<T> create(Class<T> type) {
        JPARepositorio<T> repositorio = new JPARepositorio<T>(type);
        repositorio.setEm(Conexao.getCreatConnection());
        return repositorio;
    }

    public static <T> NomeRepositorio<T> createnamed(Class<T> type) {
        String queryName = null;
        if (type.isAnnotationPresent(NamedQueries.class)) {
            NamedQueries namedQueries = type.getAnnotation(NamedQueries.class);
            NamedQuery[] names = namedQueries.value();
            for (NamedQuery name : names) {
                if (name.name().contains("ByName")) {
                    queryName = name.name();
                }
            }
        }
        if (queryName == null) {
            throw new IllegalArgumentException("A Classe Não possui Busca Por Nome");
        }
        JPANomeRepositorio<T> repositorio = new JPANomeRepositorio<>(queryName, type);
        repositorio.setEm(Conexao.getCreatConnection());
        return repositorio;
    }
}

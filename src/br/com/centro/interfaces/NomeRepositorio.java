
package br.com.centro.interfaces;

import java.util.List;


public interface NomeRepositorio<T> extends Repositorio<T> {
    T select(String nome);
    
    List<T> all (String name);
}

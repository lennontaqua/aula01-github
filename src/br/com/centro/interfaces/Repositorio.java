
package br.com.centro.interfaces;

import java.util.List;


public interface Repositorio<T> {
    
    void insert (final T ...  elements) throws Exception;
    void update (final T ... elements) throws Exception;
    void remove (final T ... elements) throws Exception;
   
    
    void closeConnection();
    
    T select (Long Key);
    
    List<T> all();
    
}


package br.com.centro.interfaces;

import java.util.List;

public interface MoveData<T> {
   T nextT(T t, List<T> elements);
   
   T previousT(T t, List<T> elements);
   
}

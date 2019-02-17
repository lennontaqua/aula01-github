package br.com.centro.jpa;

import br.com.centro.interfaces.MoveData;
import java.util.List;
import javax.swing.JOptionPane;

public final class JPAMoveData<T> implements MoveData<T> {

    @Override
    public T nextT(T t, List<T> elements) {
        if (elements.indexOf(t) < elements.size() - 1) {
            return elements.get(elements.indexOf(t) + 1);
        } else {

            JOptionPane.showMessageDialog(null, "Último Registro!", "Sistema Escolar", JOptionPane.INFORMATION_MESSAGE);
            return t;

        }
    }
    
    @Override
    public T previousT(T t, List<T> elements) {
        if (elements.indexOf(t) == 0) {
            JOptionPane.showMessageDialog(null, "Primeiro Registro", "Sistema Escolar",JOptionPane.INFORMATION_MESSAGE);
            return t;
        }else
            return elements.get(elements.indexOf(t)-1);
    }
}

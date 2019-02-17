package br.com.centro.utilitario;

import java.awt.AWTKeyStroke;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Utilities 
{
    public static void buttonEnables(Boolean valor, JButton... btn)
    {
        Integer i = 1;
        for(JButton b : btn)
        {
            switch(i)
            {
                case 1: 
                    b.setEnabled(valor);
                    break;
                case 2: 
                    b.setEnabled(valor);
                    break;
                case 3: 
                    b.setEnabled(valor);
                    break;  
                case 4: 
                    b.setEnabled(!valor);
                    break;   
                case 5: 
                    b.setEnabled(!valor);
                    break;                     
                case 6: 
                    b.setEnabled(valor);
                    break; 
                case 7: 
                    b.setEnabled(valor);
                    break;                     
                case 8: 
                    b.setEnabled(valor);
                    break; 
                case 9: 
                    b.setEnabled(valor);
                    break;                     
            }
            i++;
        }
    }
    
    public static void closeWindow(JDialog frm)
    {
        Object options[] = {"Sim", "Não"};
        int option = JOptionPane.showOptionDialog(null, "Deseja Fechar a Tela?", "Sistema de Loja", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if(option == 0)
        {
            frm.dispose();
        }        
    }

    public static void exitSystem()
    {
        Object options[] = {"Sim", "Não"};
        int option = JOptionPane.showOptionDialog(null, "Deseja Fechar o Programa?", "Sistema de Loja", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if(option == 0)
        {
            System.exit(0);
        }      
    }
    
    public static void tabEnter(JDialog frm)
    {
        HashSet conj = new HashSet(frm.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        frm.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
    }
    
    public static void tabEnter(JFrame frm)
    {
        HashSet conj = new HashSet(frm.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        frm.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
    }  
    
    public static void uppercaseLetter(JTextField t){
        t.setText(t.getText().toUpperCase());
    }
    
    public static void lowerLetter(JTextField t){
        t.setText(t.getText().toLowerCase());
    }    
}

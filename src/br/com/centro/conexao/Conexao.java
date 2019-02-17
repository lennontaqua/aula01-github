
package br.com.centro.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Conexao {
    
    public static EntityManager getCreatConnection (){
        EntityManagerFactory em = Persistence.createEntityManagerFactory("PrjEtec");
        System.out.println("Muito fera mano");
        return em.createEntityManager();
    
    }
}

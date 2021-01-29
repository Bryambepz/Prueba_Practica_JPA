/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.utils;

import javax.persistence.*;

/**
 *
 * @author braya
 */
public class JPAUtils {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Prueba_Practica_JPAPU");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Raca;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author José Henrique PG
 */
public class TesteRemoverRaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_Pet");
        EntityManager em = emf.createEntityManager();
        Raca r = em.find(Raca.class, 1);
        em.getTransaction().begin();
        em.remove(r);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Raca;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author José Henrique PG
 */
public class TesteListarRaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_Pet");
        EntityManager em = emf.createEntityManager();
        List<Raca> lista = em.createQuery("from Raca order by id").getResultList();
        for (Raca r : lista) {
            System.out.println("ID: " + r.getId() + " Nome: " + r.getNome());
        }
         em.close();
        emf.close();
    }
    
}

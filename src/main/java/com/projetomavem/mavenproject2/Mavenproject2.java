/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.projetomavem.mavenproject2;

import dominio.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jonata
 */
public class Mavenproject2 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(null, "Jonatas", "jonatas@gmail.com");
        Pessoa p2 = new Pessoa(null, "carlos", "Carlos@gmail.com");
        Pessoa p3 = new Pessoa(null, "Italo", "Italo@gmail.com");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        
        System.out.println("Informações inseridas no banco de dados");

    }
}

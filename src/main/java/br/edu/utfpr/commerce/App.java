package br.edu.utfpr.commerce;

import br.edu.utfpr.commerce.model.local.Endereco;
import br.edu.utfpr.commerce.model.local.Pais;
import br.edu.utfpr.commerce.model.local.Estado;
import br.edu.utfpr.commerce.model.local.Cidade;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("app-comercio");
        
        EntityManager em = factory.createEntityManager();
        
        Pais br = new Pais("Brasil", "BR");
        Estado pr = new Estado("Paraná", "PR", br);
        Cidade medianeira = new Cidade("Medianeira", pr);
        
        EntityTransaction transaction = em.getTransaction();
        
        try{
             transaction.begin(); //Iniciando a transação
             
             
             //em.persist(br); //Persistindo o País Brasil
             //em.persist(pr); //Persistindo o Estado do Paraná
             em.persist(medianeira); //Persistindo a cidade de Medianeira 
             
             
              transaction.commit(); //Efetivando as alterações do DB
        }catch(Exception e){    
            System.out.println("Falha ao executar transação:  "  +  e.getMessage());
        transaction.rollback();        
        } finally{
        // em.close();
         //factory.close();;
        }
        
        Endereco e = new Endereco("Rua A", "1234", "Cidade Alta", medianeira, "85884-000");

       // Pessoa juca = new PessoaFisica("Juca", e, "00011122233344", "12345");

        //System.out.println(juca);
    }
}

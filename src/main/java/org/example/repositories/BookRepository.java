package org.example.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.config.DatabaseConnection;
import org.example.models.Book;
import org.example.models.Vendor;

import java.util.List;

public class BookRepository implements AutoCloseable {

    public final EntityManagerFactory entityManagerFactory = DatabaseConnection.createEntityManagerFactory();

    public void save(Book newBook){
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(newBook);

        entityManager.getTransaction().commit();

        entityManager.close();
    }

    public List<Book> findAll(){
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        List<Book> books = entityManager.createQuery("select b from Book b", Book.class).getResultList();

        entityManager.getTransaction().commit();

        entityManager.close();
        return books;

    }

    public Book findById(Long id){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Book book = entityManager.find(Book.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return book;
    }


    public void deleteById(Long id){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Vendor vendor = entityManager.createQuery("select v from Vendor v join v.books b where b.id = ?1", Vendor.class).
                setParameter(1, id).getSingleResult();
        vendor.removeBookById(id);
        entityManager.persist(vendor);
        entityManager.remove(entityManager.find(Book.class, id));
//        entityManager.createQuery("delete from Book b where b.id = ?1").setParameter("b", id).executeUpdate();


        entityManager.getTransaction().commit();
        entityManager.close();
    }



    @Override
    public void close() throws Exception {
        entityManagerFactory.close();
    }
}

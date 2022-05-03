package org.example.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "vendors")
@Getter@Setter
@ToString
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String email;

    public Vendor(){

    }

    public Vendor(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void removeBookById(Long id){
        books.removeIf(book -> book.getId().equals(id));
    }

    public void addBook(Book newBook){
        this.books.add(newBook);
    }

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    private List<Book> books;

}

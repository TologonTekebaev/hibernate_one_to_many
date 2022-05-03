package org.example.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@Table(name = "books")
@Getter@Setter
@ToString

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String author;
    private BigDecimal price;
    @ManyToOne(cascade = CascadeType.MERGE)
    @ToString.Exclude
    private Vendor vendor;
//    ALL,
//    PERSIST, x
//    MERGE,
//    REMOVE,
//    REFRESH,
//    DETACH;

    public Book(){

    }
    public Book(String name, String author, BigDecimal price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
}

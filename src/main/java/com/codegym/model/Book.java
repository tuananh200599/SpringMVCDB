package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int publishyear;
    private int chapternumber;
    private String publisher;

    @ManyToOne
    @JoinColumn(name = "idBook")
    private Book book;

    public Book getBook() { return book; }

    public void setBook( Book book ) { this.book = book;}




    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublishyear() {
        return publishyear;
    }

    public void setPublishyear(int publishyear) {
        this.publishyear = publishyear;
    }

    public int getChapternumber() {
        return chapternumber;
    }

    public void setChapternumber(int chapternumber) {
        this.chapternumber = chapternumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}


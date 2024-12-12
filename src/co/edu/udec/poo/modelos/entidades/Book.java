package co.edu.udec.poo.modelos.entidades;

import java.util.HashMap;

/**
 *
 * @author redhood
 */
public class Book {
    private static int idCounter = 0;
    private String title;
    private String author;
    private int pages;
    public static HashMap<Integer, Book> booksDB;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public static int generateId() {
        return ++idCounter;
    }

    public int getId() {
        return idCounter;
    }

    public void setId(int id) {
        this.idCounter = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

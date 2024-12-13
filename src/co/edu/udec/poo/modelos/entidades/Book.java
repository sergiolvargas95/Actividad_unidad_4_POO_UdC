package co.edu.udec.poo.modelos.entidades;

import java.util.HashMap;

/**
 *
 * @author redhood
 */
public class Book {
    private String code;
    private String title;
    private String author;
    private int pages;
    public static HashMap<String, Book> booksDB;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
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

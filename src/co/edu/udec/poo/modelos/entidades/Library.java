package co.edu.udec.poo.modelos.entidades;

/**
 *
 * @author redhood
 */
import java.util.List;

public class Library {
    private int id;
    private String name;
    private int BooksNumber;
    private String address;
    private List<Book> books;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBooksNumber() {
        return BooksNumber;
    }

    public void setBooksNumber(int booksNumber) {
        BooksNumber = booksNumber;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


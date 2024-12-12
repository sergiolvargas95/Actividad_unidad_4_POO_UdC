package co.edu.udec.poo.modelos.entidades;

/**
 *
 * @author redhood
 */
import java.util.*;

public class User {
    private int id;
    private String name;
    private String identificacion;
    private String password;
    private String email;
    private String phone;
    private List<Book> BooksList;
    public static HashMap<String, User> usersDB; 

    public List<Book> getBooksList() {
        return BooksList;
    }

    public void setBooksList(List<Book> booksList) {
        BooksList = booksList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}


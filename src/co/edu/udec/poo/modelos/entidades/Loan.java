package co.edu.udec.poo.modelos.entidades;

/**
 *
 * @author redhood
 */
import java.time.LocalDate;
import java.util.List;

public class Loan {
    private int id;
    private int idBiblioteca;
    private User user;
    private List<Book> books;
    private LocalDate LoanDate;
    private LocalDate DueDate;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getLoanDate() {
        return LoanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        LoanDate = loanDate;
    }

    public int getIdBiblioteca() {
        return idBiblioteca;
    }

    public void setIdBiblioteca(int idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDueDate() {
        return DueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        DueDate = dueDate;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

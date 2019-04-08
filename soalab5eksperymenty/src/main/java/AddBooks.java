import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;


@ManagedBean(name = "AddBooks")
@RequestScoped
public class AddBooks {
    //private BookEJB bookEJB;

    private Book book;
    private List<Book> bookList = new ArrayList<Book>();

    public AddBooks(){
        book = new Book();
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("soalab");
        EntityManager em = factory.createEntityManager();

        try {
            Query q = em.createQuery("FROM Book ", Book.class);
            bookList = q.getResultList();
        }
        catch (Exception e){
            System.err.println("Błąd pobierania rekordow: " + e);
        }
    }


    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("soalab");
        EntityManager em = factory.createEntityManager();

        try {
            Query q = em.createQuery("FROM Book ", Book.class);
            bookList = q.getResultList();
        }
        catch (Exception e){
            System.err.println("Błąd pobierania rekordow: " + e);
        }
        return bookList;
    }

    public String AddBook(){

        System.out.println(book.getNazwisko());
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("soalab");
        EntityManager em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(book);
            em.getTransaction().commit();
        }
        catch (Exception e){
            System.err.println("Błąd przy dodawaniu rekordu: " + e);
        }
        return "index";
    }
}

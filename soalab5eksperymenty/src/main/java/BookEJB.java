import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.List;

//@Stateless
public class BookEJB {
    //@PersistenceContext(unitName = "soalab")
    //private EntityManager entityManager;



    /*public List<Book> findBooks(){
        //TypedQuery<Book> query = entityManager.createQuery("FROM Book", Book.class);
        //return query.getResultList();
    }*/

    public void addNew(Book b){
        //entityManager.persist(b);
        //return b;
        /*EntityManagerFactory factory = Persistence.createEntityManagerFactory("soalab");
        EntityManager em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(b);
            em.getTransaction().commit();
        }
        catch (Exception e){
            System.err.println("Błąd przy dodawaniu rekordu: " + e);
        }*/

    }
}

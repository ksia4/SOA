import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Main2 {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("soalab");
        EntityManager em = factory.createEntityManager();

        try {
            Query q = em.createQuery("FROM Book ", Book.class);
            List<Book> books = q.getResultList();

            for(Book s:books){
                System.out.println("Nazwisko: " + s.getNazwisko());
                System.out.println("jestem w forze!");}
            System.out.println("Za forem");
        }
        catch (Exception e){
            System.err.println("Błąd pobierania rekordow: " + e);
        }
    }
}

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("soalab");
        EntityManager em = factory.createEntityManager();

        try{
            /*Student s1 = new Student("adam", "nowak", new Date());
            Student s2 = new Student("marek", "kowalski", new Date());
            Student s3 = new Student("anna", "marchewka", new Date());*/
            Book b1 = new Book("Andrzek","Kotek","ksiazka", "1234", 123, 12.0f);
            Book b2 = new Book("Andrzek","Kotek2","ksiazka", "1235", 123, 12.0f);

            em.getTransaction().begin();
            em.persist(b1);
            em.persist(b2);
            em.getTransaction().commit();
            System.out.println("Zapisano w bazie:" + b1);
            System.out.println("Zapisano w bazie:" + b2);
            //System.out.println("Zapisano w bazie:" + s3);
        }
        catch (Exception e){
            System.err.println("Błąd przy dodawaniu rekordu: " + e);
        }
    }
}

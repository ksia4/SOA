import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

public class Wyszukiwarka {
    private List<Ksiazka> ksiazkaList = new ArrayList<Ksiazka>();
    private List<Autor> autorList = new ArrayList<Autor>();
    private List<String> autorPrintableList = new ArrayList<String>();

    private EntityManagerFactory factory;
    private EntityManager em;

    public Wyszukiwarka(){
        factory = Persistence.createEntityManagerFactory("soalab");
        em = factory.createEntityManager();
        znajdziKsiazki();
        znajdzAutorow();
    }

    public void setKsiazkaList(List<Ksiazka> ksiazkaList) {
        this.ksiazkaList = ksiazkaList;
    }

    public List<Ksiazka> getKsiazkaList() {
        return ksiazkaList;
    }

    public List<Ksiazka> znajdziKsiazki(){
        try {
            Query q = em.createQuery("FROM Ksiazka ", Ksiazka.class);
            ksiazkaList = q.getResultList();
        }
        catch (Exception e){
            System.err.println("Błąd pobierania rekordow: " + e);
        }
        return getKsiazkaList();
    }

    public void setAutorList(List<Autor> autorList) {
        this.autorList = autorList;
    }

    public List<String> getAutorPrintableList() {
        return autorPrintableList;
    }

    public void setAutorPrintableList(List<String> autorPrintableList) {
        this.autorPrintableList = autorPrintableList;
    }

    public List<Autor> getAutorList() {
        return autorList;
    }
    public List<Autor> znajdzAutorow(){
        try {
            Query q = em.createQuery("FROM Autor ", Autor.class);
            autorList = q.getResultList();
            /*autorPrintableList = new ArrayList<String>();
            for(Autor a : autorList){
                autorPrintableList.add(a.getImie() + " " + a.getNazwisko());
            }*/
        }
        catch (Exception e){
            System.err.println("Błąd pobierania rekordow: " + e);
        }
        return getAutorList();
    }

    public void dodajKsiazke(Ksiazka ksiazka){
        try{
            em.getTransaction().begin();
            //em.persist(ksiazka.getAutor());
            em.persist(ksiazka);
            em.getTransaction().commit();
            znajdziKsiazki();
        }
        catch (Exception e){
            System.err.println("Błąd przy dodawaniu rekordu: " + e);
        }
    }
}

import javax.persistence.*;

@Entity
@Table(name = "books")

public class Book {
    private int id;
    private String imie;
    private String nazwisko;
    private String tytul;
    private String isbn;
    private int rokWydania;
    private float cena;

    public Book(){
        super();
    }

    Book(String imie, String nazwisko, String tytul, String isbn, int rokWydania, float cena) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.tytul = tytul;
        this.isbn = isbn;
        this.rokWydania = rokWydania;
        this.cena = cena;
    }

    @Id
    @GeneratedValue
    @Column(name = "id", nullable=false)
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    @Column(name = "imie", nullable=false)
    public void setImie(String imie){
        this.imie = imie;
    }
    @Column(name = "nazwisko", nullable=false)
    public String getNazwisko(){
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Column(name = "tytul", nullable=false)
    public String getTytul(){
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    @Column(name = "isbn", nullable=false)
    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String ISBN) {
        this.isbn = ISBN;
    }

    @Column(name = "rokwydania", nullable=false)
    public int getRokWydania(){
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }

    @Column(name = "cena", nullable=false)
    public float getCena(){
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

}

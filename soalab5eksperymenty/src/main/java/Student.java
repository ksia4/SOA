import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "student")
public class Student {
    private int id;
    private String imie;
    private String nazwisko;
    private Date dodanieData;

    public Student(){
        super();
    }

    Student(String imie, String nazwisko, Date data) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        dodanieData = data;
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "dodanieData", nullable=true)
    public Date getDodanieData(){
        return dodanieData;
    }

    public void setDodanieData(Date dodanieData) {
        this.dodanieData = dodanieData;
    }
}

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "DodajKsiazke")
@RequestScoped
public class DodajKsiazke {
    private Ksiazka ksiazka;
    private List<Ksiazka> ksiazkaList = new ArrayList<Ksiazka>();
    //private List<Autor> autorList = new ArrayList<Autor>();
    private List<SelectItem> selectItems;
    private Autor autor;
    private Wyszukiwarka wyszukiwarka;
    public DodajKsiazke(){
        ksiazka = new Ksiazka();
        wyszukiwarka = new Wyszukiwarka();
        autor = new Autor("","");
        ksiazkaList = wyszukiwarka.znajdziKsiazki();
        //autorList = wyszukiwarka.znajdzAutorow();
        fillSelectItems();
    }

    public String Dodaj(){
        this.ksiazka.setAutor(this.autor);
        System.out.println(ksiazka.getAutor().getNazwisko());
        wyszukiwarka.dodajKsiazke(this.ksiazka);
        return "index";
    }

    public List<SelectItem> getSelectItems() {
        return selectItems;
    }

    public void setSelectItems(List<SelectItem> selectItems) {
        this.selectItems = selectItems;
    }

    private void fillSelectItems(){
        selectItems = new ArrayList<SelectItem>();
        for(Autor a : )
    }
    public Ksiazka getKsiazka() {
        return ksiazka;
    }

    public void setKsiazka(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setKsiazkaList(List<Ksiazka> ksiazkaList) {
        this.ksiazkaList = ksiazkaList;
    }

    public List<Ksiazka> getKsiazkaList() {
        return ksiazkaList;
    }

    public List<Autor> getAutorList() {
        return autorList;
    }

    public void setAutorList(List<Autor> autorList) {
        this.autorList = autorList;
    }
}

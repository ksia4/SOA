
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "bookrecords", eager = true)
@SessionScoped
public class BookStore {

    private ArrayList<Book> actualList;

    private List<String> authorList = Arrays.asList("wszyscy","buu", "Kaczor Donald", "Myszka Miki");
    private List<String> currencyList = Arrays.asList("Oryginalna", "PLN");
    private List<String> typeList = Arrays.asList("wszystkie","romans", "fantastyka", "kryminał");
    private String actualAuthor = "wszyscy";
    private String actualType = "Wszystkie";
    private String actualCurrency = "Oryginalna";


    private static final ArrayList<Book> bookie =
            new ArrayList<Book>(
                    Arrays.asList(
                            new Book("pierwszy", "buu" ,"fantastyka", 30.0, 30.0, "PLN", 123),
                            new Book("drugi", "Kaczor Donald" ,"romans", 0.0, 30.0, "USD", 1243),
                            new Book("trzeci", "Kaczor Donald" ,"fantastyka", 23.0, 23.0, "PLN", 123),
                            new Book("czwarty", "buu" ,"romans", 0.0, 9.50, "EUR", 13),
                            new Book("piaty", "buu" ,"kryminał", 31.0, 31.0, "PLN", 1500),
                            new Book("szosty", "Kaczor Donald" ,"romans", 40.0, 40.0, "PLN", 500),
                            new Book("sieben", "buu" ,"kryminał", 25.0, 25.0, "PLN", 123),
                            new Book("eight", "Myszka Miki" ,"fantastyka", 130.0, 130.0, "PLN", 123),
                            new Book("kyu", "buu" ,"romans", 1130.0, 1130.0, "PLN", 123),
                            new Book("diesjet", "Myszka Miki" ,"kryminał", 230.0, 230.0, "PLN", 123)
                    ));


    public BookStore() {
        actualList = bookie;
    }

    public static ArrayList<Book> getBookie() {
        return bookie;
    }

    public void setActualList(ArrayList<Book> actualList) {
        this.actualList = actualList;
    }

    public ArrayList<Book> getActualList() {
        return actualList;
    }

    public void setAuthorList(List<String> authorList) {
        this.authorList = authorList;
    }

    public List<String> getAuthorList() {
        return authorList;
    }

    public void setCurrencyList(List<String> currencyList) {
        this.currencyList = currencyList;
    }

    public void setTypeList(List<String> typeList) {
        this.typeList = typeList;
    }

    public List<String> getCurrencyList() {
        return currencyList;
    }

    public List<String> getTypeList() {
        return typeList;
    }

    public String getActualAuthor() {
        return actualAuthor;
    }

    public void setActualAuthor(String actualAuthor) {
        this.actualAuthor = actualAuthor;
    }

    public void setActualType(String actualType) {
        this.actualType = actualType;
    }

    public String getActualType() {
        return actualType;
    }

    public void setActualCurrency(String actualCurrency) {
        this.actualCurrency = actualCurrency;
    }

    public String getActualCurrency() {
        return actualCurrency;
    }
    public void changeActualList(){
        actualList = new ArrayList<Book>();

        for(int i = 0; i < bookie.size(); ++i){
            if((actualType.equals("Wszystkie") || bookie.get(i).type.equals(actualType)) && (actualAuthor.equals("wszyscy") || bookie.get(i).author.equals(actualAuthor)))
                actualList.add(new Book(bookie.get(i).title, bookie.get(i).author, bookie.get(i).type, bookie.get(i).pricePL, bookie.get(i).price, bookie.get(i).currency, bookie.get(i).numberOfPages));
            /*if(!actualType.equals("Wszystkie") && !bookie.get(i).type.equals(actualType))
            {System.out.println("nie e");
                System.out.println(actualType);
                continue;}
            if(!actualAuthor.equals("wszyscy") && !bookie.get(i).author.equals(actualAuthor))
            {System.out.println("drugie nie e");
                continue;}
            actualList.add(new Book(bookie.get(i).title, bookie.get(i).author, bookie.get(i).type, bookie.get(i).pricePL, bookie.get(i).price, bookie.get(i).currency, bookie.get(i).numberOfPages));*/
        }
    }
}
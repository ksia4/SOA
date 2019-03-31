public class Book {

    String title;
    String author;
    String type;
    double pricePL;
    double price;
    String currency;
    int numberOfPages;

    Book(String title, String author, String type, double pricePL, double price, String currency, int numberOfPages){
        this.title = title;
        this.author = author;
        this.type = type;
        this.pricePL = pricePL;
        this.price = price;
        this.currency = currency;
        this.numberOfPages = numberOfPages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setPricePL(double pricePL) {
        this.pricePL = pricePL;
    }

    public double getPricePL() {
        if (pricePL > 0.0)
            return pricePL;
        else
            pricePL = CalculateToPL();
            return pricePL;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    double CalculateToPL(){
        switch (currency){
            case "USD": return pricePL * 3.8365;
            case "EUR": return pricePL * 4.3013;
            default: return price;

        }
    }
}

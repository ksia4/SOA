import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.*;

@ManagedBean(name = "Przelicznik")
@RequestScoped

public class Przelicznik {
    private String kwota;

    public String getKwota(){
        return kwota;
    }

    public void setKwota(String kwota){
        this.kwota = kwota;
    }

    private String walutaWe;

    public String getWalutaWe(){
        return walutaWe;
    }

    public void setWalutaWe(String walutaWe){
        this.walutaWe = walutaWe;
    }

    private String walutaWy;

    public String getWalutaWy(){
        return walutaWy;
    }

    public void setWalutaWy(String walutaWy){
        this.walutaWy = walutaWy;
    }

    static private List<String> walutyLista = new ArrayList<>(Arrays.asList("PLN", "EUR"));

    public List<String> getWalutyLista(){
        return walutyLista;
    }

    public void setWalutyLista(List<String> walutyLista){
        this.walutyLista = walutyLista;
    }

    static private Map<String, Float> waluty = createMap();

    private static Map<String, Float> createMap(){
        Map<String, Float> iniList = new HashMap<String, Float>();
        iniList.put("PLN", (float) 1.0);
        iniList.put("EUR", (float) 4.0);//Integer.parseInt(NBPConnector.exchangeRate("EUR")));
        System.out.println("Zrobilo mape");
        return iniList;
    }

    public Map<String, Float> getWaluty(){
        return waluty;
    }

    public void setWaluty(Map<String, Float> waluty){
        this.waluty = waluty;
    }

    public String przelicz(){
        Float kwota = Float.parseFloat(this.kwota);
        kwota = kwota * (1.0f/waluty.get(walutaWy));
        kwota = kwota * waluty.get(walutaWe);
        this.kwota = kwota.toString();

        return "wynik";
    }
}

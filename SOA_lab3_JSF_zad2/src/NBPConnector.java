import jdk.nashorn.internal.parser.JSONParser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class NBPConnector {
    static String exchangeRate(String waluta){
        String url_str = "http://api.nbp.pl/api/exchangerates/rates/a/" + waluta;
        try {
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            return request.getContent().toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "1";
    }
}

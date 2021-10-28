package javaa.ParcialSegundoCorte.Connection;

import java.io.IOException;
import java.net.MalformedURLException;

public interface Httpconnection {
    String getCovidByCountry(String name) throws IOException;
}

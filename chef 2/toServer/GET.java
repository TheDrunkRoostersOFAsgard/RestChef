package toServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 * clase GET es con la cual llamo la informacion del servidor para luego ser pasada a las demas clases
 * @author Hernaldo
 *
 */
public class GET {
/**
 * 
 * @param rd parametro para poder leer todo lo que se le pasa a este metodo (normalmente JSON)
 * @return  retorna el string del JSON que recibe para poder ser trabajado por las demas clases
 * @throws IOException
 */
  private static String readAll(Reader rd) throws IOException {
    StringBuilder sb = new StringBuilder();
    int cp;
    while ((cp = rd.read()) != -1) {
      sb.append((char) cp);
    }
    return sb.toString();
  }
/**
 * 
 * @param url recibe un url para llamar al servidor
 * @return	retorna el JSON
 * @throws IOException  excepciones para visualizar el stack trace de los errores
 * @throws JSONException excepciones para visualizar el stack trace de los errores
 */
  public static JSONArray readJsonFromUrl(String url) throws IOException, JSONException {
    InputStream is = new URL(url).openStream();
    try {
      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
      String jsonText = readAll(rd);
      JSONArray json = new JSONArray(jsonText);
      return json;
    } finally {
      is.close();
    }
  }
}

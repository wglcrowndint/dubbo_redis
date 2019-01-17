package protocol.http;

import framework.Invocation;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by crowndint on 2019/1/15.
 */
public class HttpClient {

    public String post(String hostname, Integer port , Invocation invocation) {
        try {
            URL url = new URL("http",hostname, port, "/");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);

            ObjectOutputStream oos = new ObjectOutputStream(httpURLConnection.getOutputStream());

            oos.writeObject(invocation);
            oos.flush();
            oos.close();

            InputStream inputStream = httpURLConnection.getInputStream();
            String result = IOUtils.toString(inputStream);
            return result;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


}

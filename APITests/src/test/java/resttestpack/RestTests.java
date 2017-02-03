package resttestpack;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.SystemDefaultCredentialsProvider;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sun.net.www.http.HttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shepelevich on 2/3/2017.
 */
public class RestTests {
    private static CloseableHttpClient client;
    private static String url;

    @BeforeClass
    public static void createClient() {
        client = HttpClientBuilder.create().build();
    }

    @Before
    public void setURL() {
        url = "http://apilayer.net/api/live";
    }


    @Test
    public void checkAllKeys() throws IOException {
        url += "?" + "access_key=f208413b43c382be2f83281665d23bc0&currencies=EUR&format=1";
        HttpGet get = new HttpGet(url);
        HttpResponse response = client.execute(get);
        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));
        String result = "", line = "";
        while ((line = rd.readLine()) != null) {
            result += line;
        }
        JSONObject jsonObj = new JSONObject(result);
        Assert.assertTrue(jsonObj.names().toString().contains("success") && jsonObj.names().toString().contains("terms") && jsonObj.names().toString().contains("privacy") && jsonObj.names().toString().contains("timestamp") && jsonObj.names().toString().contains("source") && jsonObj.names().toString().contains("quotes"));
    }

    @Test
    public void checkQuotes() throws IOException {
        url += "?" + "access_key=f208413b43c382be2f83281665d23bc0&currencies=EUR,UAH,RUB&format=1";
        HttpGet get = new HttpGet(url);
        HttpResponse response = client.execute(get);
        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));
        String result = "", line = "";
        while ((line = rd.readLine()) != null) {
            result += line;
        }
        JSONObject jsonObj = new JSONObject(result);
        JSONObject quotes = jsonObj.getJSONObject("quotes");
        Assert.assertTrue(quotes.names().length() == 3);
        Assert.assertTrue(quotes.names().toString().contains("USDEUR") && quotes.names().toString().contains("USDUAH") && quotes.names().toString().contains("USDRUB"));
    }

    @Test
    public void check169Combinations() throws IOException {// у меня находит только 169, а не 170
        url += "?" + "access_key=f208413b43c382be2f83281665d23bc0&currencies=&format=1";
        HttpGet get = new HttpGet(url);
        HttpResponse response = client.execute(get);
        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));
        String result = "", line = "";
        while ((line = rd.readLine()) != null) {
            result += line;
        }
        JSONObject jsonObj = new JSONObject(result);
        JSONObject quotes = jsonObj.getJSONObject("quotes");
        Assert.assertTrue(quotes.names().length() == 169);
    }

    @Test
    public void checkRate() throws IOException {
        url += "?" + "access_key=f208413b43c382be2f83281665d23bc0&currencies=EUR,UAH&format=1";
        HttpGet get = new HttpGet(url);
        HttpResponse response = client.execute(get);
        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));
        String result = "", line = "";
        while ((line = rd.readLine()) != null) {
            result += line;
        }
        JSONObject jsonObj = new JSONObject(result);
        JSONObject quotes = jsonObj.getJSONObject("quotes");
        double rate = Double.parseDouble(quotes.get("USDEUR").toString());
        Assert.assertTrue(rate > 0.9 && rate < 0.99);
    }

    @Test
    public void checkErrorWithSourceUAH() throws IOException {
        url += "?" + "access_key=f208413b43c382be2f83281665d23bc0&source=UAH&format=1";
        HttpGet get = new HttpGet(url);
        HttpResponse response = client.execute(get);
        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));
        String result = "", line = "";
        while ((line = rd.readLine()) != null) {
            result += line;
        }
        JSONObject jsonObj = new JSONObject(result);
        JSONObject error = jsonObj.getJSONObject("error");
        Assert.assertTrue((Integer.parseInt(error.get("code").toString()) == 105) && error.get("info").toString().equals("Access Restricted - Your current Subscription Plan does not support Source Currency Switching."));
    }
}

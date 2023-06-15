package org.saurav;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
       String urlString = "https://api.chucknorris.io/jokes/random";
        URL url = new URL(urlString);

        //connection
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        int responseCode = connection.getResponseCode();

        //extract information from the connection object
        if(responseCode == 200){
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder apiData = new StringBuilder();
            String readLine = null;
            while((readLine = in.readLine()) != null){
                apiData.append(readLine);
            }
            in.close();
            JSONObject jsonAPI_response = new JSONObject(apiData.toString());
            System.out.println("URL "+jsonAPI_response.getString("url"));
            System.out.println("ID "+jsonAPI_response.getString("id"));
            System.out.println("Jokes "+jsonAPI_response.getString("value"));
        }else{
            System.out.println("API Call Could not be placed");
        }
    }
}
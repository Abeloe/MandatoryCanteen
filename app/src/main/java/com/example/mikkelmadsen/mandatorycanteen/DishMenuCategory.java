package com.example.mikkelmadsen.mandatorycanteen;

import android.app.Activity;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONObject;
import org.xml.sax.SAXException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

public class DishMenuCategory extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish_menu_category);
    }



    @Override
    protected void onStart()
    {
     super.onStart();
        ReadTask task = new ReadTask();
        task.execute("http://anbo-canteen.azurewebsites.net/Service1.svc/dishes");
    }


    public void getDish (View view)
    {

     ListView dishView = (ListView) findViewById(R.id.ListView_DiffrentDishes);

        try

        {
            JSONObject jsonObject = new JSONObject();
        }
        finally {

        }
        }

    private class ReadTask extends AsyncTask<String, Void, String>
    {
        @Override
        protected String doInBackground(String... params)
        {
            String urlString = params[0];
            String jsonDocumet = params[1];

            try {

                URL url = new URL(urlString);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setDoOutput(true);
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setRequestProperty("Accept", "application/json");
                OutputStreamWriter osw = new OutputStreamWriter(connection.getOutputStream());
                osw.write(jsonDocumet);
                osw.flush();
                osw.close();
                int responseCode = connection.getResponseCode();
                if (responseCode / 100 != 2) {
                    String responseMessage = connection.getResponseMessage();
                    throw new IOException("HTTP response code: " + responseCode + " " + responseMessage);
                }
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(connection.getInputStream()));
                String line = reader.readLine();
                return line;
            } catch (MalformedURLException ex) {
                cancel(true);
                String message = ex.getMessage() + " " + urlString;
                Log.e("Dish", message);
                return message;
            } catch (IOException ex) {
                cancel(true);
                Log.e("Dish", ex.getMessage());
                return ex.getMessage();
            }
        }


    }
}


/* Implementer evt. API forbindelse der viser forskellige retter - send data videre efter valgt dish til nyt xml.  */



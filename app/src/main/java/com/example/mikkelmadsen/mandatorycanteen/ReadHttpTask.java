package com.example.mikkelmadsen.mandatorycanteen;

import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;

/**
 * Created by MikkelMadsen on 24-03-2017.
 */

public class ReadHttpTask extends AsyncTask<String, Void, CharSequence>

{
    @Override
    protected CharSequence doInBackground(String... urls) {
        String urlString = urls[0];
        try {
            CharSequence result = HTTPHelper.GetHttpResponse(urlString);
            return result;
        } catch (IOException ex) {
            cancel(true);
            String errorMessage = ex.getMessage() + "\n" + urlString;
            //Log.e("BOOK", errorMessage);
            return errorMessage;
        }
    }

}

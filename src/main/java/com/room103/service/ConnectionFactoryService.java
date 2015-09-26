package com.room103.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.room103.utils.ConnectionURL;
import com.room103.utils.FullURLName;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/**
 * Created by kolyan on 9/27/15.
 */
@Service
public class ConnectionFactoryService {

    private Logger logger = Logger.getLogger(ConnectionFactoryService.class);

    public String send(String json, FullURLName fullURLName) {
        logger.info(json);
        try {
            URL url = new URL(ConnectionURL.GROUPS.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            String urlParameters = ConnectionURL.FILTER.toString() + json;
            httpURLConnection.setDoOutput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes(urlParameters);
            dataOutputStream.flush();
            dataOutputStream.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = bufferedReader.readLine()) != null) {
                response.append(inputLine);
            }
            bufferedReader.close();
            logger.info(response.toString());
            return response.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

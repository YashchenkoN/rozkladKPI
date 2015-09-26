package com.room103.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.room103.api.groups.AllGroupsRequest;
import com.room103.api.groups.AllGroupsResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/**
 * Created by kolyan on 9/27/15.
 */
@Service
public class SendRequestServiceImpl implements SendRequestService {

    private static Logger logger = Logger.getLogger(SendRequestServiceImpl.class);
    private Gson gson = new GsonBuilder().create();

    @Override
    public AllGroupsResponse sendAllGroupRequest(AllGroupsRequest allGroupsRequest) {
        /*try {
            URL url = new URL(apiUrl + "/" + urlConst);
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
            httpsURLConnection.setRequestMethod("POST");
            String urlParameters = "request=" + gson.toJson(parameters);
            httpsURLConnection.setDoOutput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
            dataOutputStream.writeBytes(urlParameters);
            dataOutputStream.flush();
            dataOutputStream.close();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = bufferedReader.readLine()) != null) {
                response.append(inputLine);
            }
            bufferedReader.close();

            //print result
            System.out.println(response.toString());
            Map<String, String> map = gson.fromJson(response.toString(), Map.class);

            logger.info(response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        return null;
    }

}

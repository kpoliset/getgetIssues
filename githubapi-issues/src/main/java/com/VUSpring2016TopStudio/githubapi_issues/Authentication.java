package com.VUSpring2016TopStudio.githubapi_issues;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.codec.binary.Base64;
import org.json.JSONException;

public class Authentication {
    getIssues gis = new getIssues();
    public void Authenticate() throws IOException, JSONException
    {
        IssueObjects login = new IssueObjects();
        URL obj = null;
        try {
            obj = new URL(
                    "https://api.github.com/repos/VUSpring2016TopStudio/kpolisetty/issues");
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
   
        HttpURLConnection urlConnection = (HttpURLConnection) obj.openConnection();
        String authString = login.getLoginId() + ":" + login.getLoginPass();
        String authStringEnc = new String(Base64.encodeBase64(authString.getBytes()));
        urlConnection.setRequestProperty("Authorization","Basic " + authStringEnc);
        System.out.println(urlConnection);
        login.setIssueurl(urlConnection);
         //return urlConnection;
        System.out.println(authString);
        gis.AuthIssueURL(urlConnection);
        System.out.println(gis.iobj);
    }
}

package com.VUSpring2016TopStudio.githubapi_issues;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
//import java.net.ProtocolException;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class getIssues {
    IssueObjects iobj = new IssueObjects();
    

    public void AuthIssueURL(URLConnection Urlc)
            throws IOException, JSONException {
        int count = 1;
        // System.out.println(Urlc);
        ((HttpURLConnection) Urlc).setRequestMethod("GET");
        Urlc.setRequestProperty("Accept", "application/json");
        Urlc.setDoOutput(true);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(Urlc.getInputStream()));
        StringBuffer buffer = new StringBuffer();
        String inputLine;
        while ((inputLine = in.readLine()) != null)
            buffer.append(inputLine + "\n");
        in.close();
        JSONArray jsonarray = new JSONArray(buffer.toString());
        for (int i = 0; i < jsonarray.length(); i++) {

            JSONObject obj1 = jsonarray.getJSONObject(i);
            if (obj1.getString("title") != null) {
                iobj.setTitle(count, obj1.getString("title"));
            }
            if (obj1.getString("state") != null) {
                iobj.setState(count, obj1.getString("state"));
            }
            if (obj1.getString("body") != null) {
                iobj.setBody(count, obj1.getString("body"));
            }
            if (obj1.getString("id") != null) {
                iobj.setId(obj1.getString("id"));
                System.out.println(iobj.getId());

            }
            count++;
        }
        iobj.setNumber(count);
        System.out.println(iobj);
        this.printIssues();
        System.out.println(iobj);
        // System.out.println("End");

    }

    public void printIssues() throws IOException {
        File file = new File("D:\\Issue List.txt"); // creates the file
        file.createNewFile(); // creates a FileWriter Object
        FileWriter writer = new FileWriter(file); // Writes the content to the
                                                  // file
        System.out.println(iobj);

        for (int i = 1; i < iobj.getNumber(); i++) {
            writer.write("Issue Title is :" + iobj.getTitle(i));
            writer.write(System.lineSeparator());
            writer.write("Issue State is :" + iobj.getState(i));
            writer.write(System.lineSeparator());
            writer.write("Issue Body is  :" + iobj.getBody(i));
            writer.write(System.lineSeparator());
            writer.write(System.lineSeparator());
            System.out.println("Issue Title is :" + iobj.getTitle(i));
            System.out.println("Issue State is :" + iobj.getState(i));
            System.out.println("Issue Body is  :" + iobj.getBody(i));
            System.out.println("Issue Title is :" + iobj.getId());
            System.out.println("");
        }
        writer.flush();
        writer.close();
    }

}

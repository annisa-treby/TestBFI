package org.example;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import info.debatty.java.stringsimilarity.Levenshtein;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class ExerciseF {
    public List<String> SearchCity(String input) throws IOException {
        String url = "https://raw.githubusercontent.com/lutangar/cities.json/master/cities.json";
        Levenshtein levenshtein=new Levenshtein();
        URL url1 = new URL(url);
        List<String> result = new ArrayList<>();

        URLConnection request = url1.openConnection();
        request.connect();
        JsonParser jsonParser = new JsonParser();
        JsonElement root = jsonParser.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonArray array = root.getAsJsonArray();

        for (JsonElement element: array) {
            JsonObject object = element.getAsJsonObject();
            String country = object.get("country").getAsString();
            String name = object.get("name").getAsString();

            if (country.equals("ID")&&levenshtein.distance(name,input)<=2.9){
                result.add(name);
            }
        }
        return result;
    }
}

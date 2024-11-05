package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonMockup {
    String name;
    String age;
    String city;

    public JsonMockup(String name, String age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public void WriteJson() {
        String name1 = "marco";
        String age1 = "18";
        String city1 = "Camerino";
        JsonMockup mk1 = new JsonMockup(name1, age1, city1);

        String name2 = "simone";
        String age2 = "23";
        String city2 = "Pescara";

        JsonMockup mk2 = new JsonMockup(name2, age2, city2);

        Gson gson = new Gson();

        gson.toJson(mk1);
        gson.toJson(mk2);
        System.out.println(gson.toJson(mk1));
        System.out.println(gson.toJson(mk2));
    }
}

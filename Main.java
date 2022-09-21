package HW3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("text.json");
        BufferedReader brOur = new BufferedReader(new FileReader(file));
        String stOur = brOur.readLine();
        String jsonFile = "";
        while (stOur != null) {
            jsonFile += stOur;
            stOur = brOur.readLine();
        }
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter()).create();

        Type compListType = new TypeToken<ArrayList<Company>>(){}.getType();

        ArrayList<Company> companies = gson.fromJson(jsonFile, compListType);

        AtomicInteger i = new AtomicInteger();
        companies.stream()
                .peek(c->System.out.println(c.name + ":" ))
                .peek(c->c.securities.stream()
                        .filter(s->s.date.isBefore(LocalDate.now()))
                        .forEach(s-> System.out.println(s.name + ", " + s.code + ", " + s.date)))
                .forEach(c->c.getSecurities().stream() .filter(s->s.getDate().isBefore(LocalDate.now())) .forEach(s->i.getAndIncrement()));
        System.out.println(i);
    }
}


package com.example.android.jokelibrary;

import java.util.ArrayList;
import java.util.Random;

public class JokeMaker {
    private static ArrayList<String> jokeList = new ArrayList<String>() {{
        add("Optimist: The glass is half full.\n"
                + "Pessimist: The glass is half empty.\n"
                + "Mother: Why didn’t you use a coaster!");
        add("I asked my daughter if she’d seen my newspaper. " +
                "She told me that newspapers are old school. She said that people use" +
                " tablets nowadays and handed me her iPad. The fly didn’t stand a chance.");
        add("I forgot my cell phone when I went to the toilet yesterday. We have 245 tiles.");
        add("I’ve always thought my neighbors were quite nice people. But then they put a password on their Wi-Fi.");
        add("What did the father say to his baby boy before killing him with a vacuum cleaner?\n\n"
                + "Dyson");
    }};


    public static String getJoke() {
        return jokeList.get(new Random().nextInt(jokeList.size()));
    }
}


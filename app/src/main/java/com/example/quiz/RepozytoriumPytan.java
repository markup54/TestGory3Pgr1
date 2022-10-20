package com.example.quiz;

import java.util.ArrayList;

public class RepozytoriumPytan {
    public static ArrayList<Pytanie> pytania = new ArrayList<>();
    public void wypelnijPytaniami(){
        pytania.add(new Pytanie("Jakie schronisko na obrazku?",
                "Nad MorskimOkiem",
                "Na Wielkiej Raczy",
                "Na Rysiance",
                1,
                R.drawable.obraz,
                "Długi tekst z podpowiedzią"));
    }
}

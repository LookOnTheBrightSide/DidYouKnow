package me.dubh.diduknow;

import java.util.Random;

/**
 * Created by lotbs on 04/10/2017.
 */

public class FactBank {
    private String[] mfacts = {
            "Benni McCarthy is the only South African to win the UEFA Champions League trophy. He won it with Porto.",
            "South Africa won the 1996 Africa Cup Of Nations.",
            "Senzo Meyiwa's jersey number was retired by Kaiser Chiefs following his death.",
            "Patrice Motsipe owns Mamelodi Sundowns.",
            "Tendai Ndoro's favourite meal is pap and amasi.",
            "Dr Khumalo featured in a numebr of Kwaito videos."
    };
    public String getFact(){
        Random randomGenerator = new Random();
        int randomInt  = randomGenerator.nextInt(mfacts.length);
        return mfacts[randomInt];
    }
}

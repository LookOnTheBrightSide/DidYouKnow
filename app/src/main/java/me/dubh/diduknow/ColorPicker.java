package me.dubh.diduknow;

import java.util.Random;

/**
 * Created by lotbs on 04/10/2017.
 */

public class ColorPicker {
    public String[] colors = {
            "#2ecc71",
            "#34495e",
            "#c0392b",
            "#8e44ad",
            "#d35400",
            "#2c3e50"
    };
    Random random = new Random();
    public String getColor(){
        return colors[random.nextInt(colors.length)];
    }
}

package lab2;

import java.lang.*;
public class ball {
    private String color;
    private double weight;

    public ball(){
        color = "blue";
        weight = 10;
    }
    public ball(double w) {
        color = "white";
        weight = 20;
    }
    public ball(double w, String c ) {
        color = c;
        weight = w;
    }

    public String getColor(){ return color;}
    public double getWeight() {return weight;}
}


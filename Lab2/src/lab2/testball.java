package lab2;

import java.lang.*;
public class testball {
    public static void main(String[] args) {
        ball b1 = new ball( 12, "white");
        System.out.println("Weight " + b1.getWeight ()
                + " color is " + b1.getColor());

        ball b2 = new ball(15 );
        System.out.println("Weight " + b2.getWeight ()
                + " color is "+ b2.getColor());

        ball b3 = new ball(15, "black");
        System.out.println("Weight " +b3.getWeight ()
                + " color is "+ b3.getColor());
    }

}

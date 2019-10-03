package lab2;
import java.lang.*;
public class testbook {
    public static void main(String[] args) {
        book b1 = new book( 12, "History");
        System.out.println("Pages " + b1.getPage()
         + " name is " + b1.getName());

        book b2 = new book(15 );
        System.out.println("Pages " + b2.getPage()
        + " name is "+ b2.getName());

        book b3 = new book(15, "Peter Pen");
        System.out.println("Pages " +b3.getPage()
        + " name is "+ b3.getName());
    }

}

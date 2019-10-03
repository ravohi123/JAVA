package lab2;

import java.lang.*;
public class book {
    private String name;
    private int page;

    public book(){
        name = "Math";
        page = 10;
    }
    public book(int p) {
        name = "History";
        page = 20;
    }
    public book(int p, String n ) {
        name = n;
        page = p;
    }

    public int getPage(){ return page;}
    public String getName() {return name;}
}

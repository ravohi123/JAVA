package lab2;

import java.lang.*;
public class dog {
    private String name;
    private int age;
    public dog(String n, int a) {
        name = n;
        age = a;
    }
    public dog(String n) {
        name = n;
        age = 0;
    }
    public dog() {
        name = "Pup";
        age = 0;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void ssetName(String name) {
        this.name = name;
    }
    public String getName(String name) {
        return this.name+", age"+this.age;
    }
    public void intoHumanAge() {
        System.out.println(name+"'s age in human yaers is"+age*7+" years");
    }

}

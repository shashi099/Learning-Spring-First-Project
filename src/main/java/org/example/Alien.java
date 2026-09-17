package org.example;

public class Alien {

    private int age;
    private Laptop lap;  // WE HAVE THE REFERENCE OF LAPTOP CLASS HERE
    public Alien() {
        System.out.println("Object Created");
    }

    public Alien(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("setter injection");
        this.age = age;
    }

    // GETTER SETTER FOR THE LAPTOP VARIABLE
    // TO WORK THIS WE NEED TO CONNECT WITH OBJECT IN SPRING.XML FILE
    // WITH PROPERTY
    public Laptop getLap() {
        return lap;
    }
    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){
        lap.compile();
        System.out.println("Coding");
    }

}

package org.example;

public class Alien {

    private int age;
    private Computer com;  // WE HAVE THE REFERENCE OF Computer Interface HERE
    public Alien() {
        System.out.println("Object Created");
    }
    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("setter injection");
        this.age = age;
    }

    // GETTER SETTER FOR THE Computer
    // TO WORK THIS WE NEED TO CONNECT WITH OBJECT IN SPRING.XML FILE
    // WITH PROPERTY

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        com.compile();
        System.out.println("Coding");
    }

}

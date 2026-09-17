package org.example;

public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop object created");
    }

    public void compile(){
        System.out.println("Compiling using Desktop");
    }

}

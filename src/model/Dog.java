package model;

import java.time.LocalDate;

public class Dog extends Pet{

    Dog(){
    }

    public Dog(String name, LocalDate dob) {
        super(name, dob);
    }

    public void bark(){
        System.out.println("vuff vuff");
    }

}

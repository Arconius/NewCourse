package model;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;

    private LocalDate dob;

    private Address address;

    private Pet pet;

    private Person spouse;

    public Person(Person spouse) {
        this.spouse = spouse;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public Person(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.dob = dob;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", address=" + address +
                ", pet=" + pet +
                ", spouse=" + spouse +
                '}';
    }
}

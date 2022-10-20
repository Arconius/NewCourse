import model.Dog;
import model.Person;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Person tom = new Person("Tom", "Sawyer", LocalDate.of(1821, 1, 23));
        Person jane = new Person("Jane", "Parker", LocalDate.of(1825, 3, 13));
        Dog fido = new Dog("Fido", LocalDate.of(1830, 3, 31));

        tom.setSpouse(jane);
        //jane.setSpouse(tom);
        tom.setPet(fido);
        jane.setPet(fido);

        System.out.println(tom);
    }
}

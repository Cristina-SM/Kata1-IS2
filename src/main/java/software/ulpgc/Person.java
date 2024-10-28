package software.ulpgc;

import java.time.LocalDate;

public class Person {

    private final String name;
    private final LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public int getAge() {
        return toYear(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }

    private int toYear(long days) {
        return (int) (days/365);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + getAge() +
                '}';
    }
}

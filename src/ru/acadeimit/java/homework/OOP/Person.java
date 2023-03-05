package ru.acadeimit.java.homework.OOP;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private int age;

    public Person(String name, String middleName, String lastName, int age) { // конструктор
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {         //геттер для name
        return name;
    }

    public void setName(String name) {     //сеттер для name
        if (!(name.length() == 0)) {
            this.name = name;
        }
    }

    public String getMiddleName() {         //геттер для middleName
        return middleName;
    }

    public void setMiddleName(String name) {     //сеттер для middleName
        this.middleName = middleName;
    }

    public String getLastName() {         //геттер для lastName
        return lastName;
    }

    public void setLastName(String name) {     //сеттер для lastName
        this.lastName = lastName;
    }

    public int getAge() {         //геттер для age
        return age;
    }

    public void setAge(int age) {     //сеттер для age
        this.age = age;
    }

    @Override
    public String toString() {
        return "{ " + name + " " + middleName + " " + lastName + " " + age + " " + "}";
    }

    public static int getYear(int age) {
        int thisYear = 2023;
//        LocalDate currentDate = LocalDate.now();
//        int thisYear = currentDate.getYear();
        return thisYear - age;
    }
}
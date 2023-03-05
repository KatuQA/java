package ru.acadeimit.java.homework;

import ru.acadeimit.java.homework.OOP.Person;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Введите ваше отчество: ");
        String middleName = scanner.nextLine();

        System.out.println("Введите вашу Фамилию: ");
        String lastName = scanner.nextLine();

        System.out.println("Сколько вам полных лет? ");
        int age = scanner.nextInt();

        Person person = new Person(name, middleName, lastName, age);

        //System.out.println(person);
        System.out.println("Вы родились в " + getYear(person.getAge()) + " году.");
    }

    public static int getYear(int age) {
        int thisYear = 2023;
//        LocalDate currentDate = LocalDate.now();          //
//        int thisYear = currentDate.getYear();
        return thisYear - age;
    }

}

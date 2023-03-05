package ru.acadeimit.java.homework.OOP;


import java.util.Scanner;

public class Person_Main {
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

        System.out.println(person);

        //Пример с лекции

//        String name = "Ekaterina";
//        String middleName = "Evgenevna";
//        String lastName = "Zhigulina";
//
//        Person person = new Person(name, middleName, lastName);
//        System.out.println("Первоначальное имя = " + person.getName());
//        person.setName("Katu");
//        System.out.println("Измененное имя = " + person.getName());
//        System.out.println(person);
    }
}

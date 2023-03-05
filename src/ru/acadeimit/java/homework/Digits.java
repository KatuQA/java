package ru.acadeimit.java.homework;

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int number = Math.abs(scanner.nextInt());

        System.out.println("Вы ввели число: " + number);

        System.out.println("Сумма его чисел: " + sumDigits(number));

        System.out.println("Сумма его нечетных чисел: " + sumOdd(number));

        System.out.println("Его максимальное число: " + maxDigit(number));
    }

    public static int sumDigits(int sumDigits)   // Функция для суммирования цифр числа
    {
        int sum = 0;  // переменная для суммы цифр
        while (sumDigits > 0) {
            sum += sumDigits % 10;
            sumDigits /= 10;
        }
        return sum;

    }

    public static int sumOdd(int number)// Функция для суммирования нечетных цифр числа
    {
        int sumOdd = 0; //переменная для суммы нечетных цифр
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sumOdd = sumOdd + digit;
            }
            number = number / 10;

        }
        return sumOdd;
    }

    public static int maxDigit(int number)    // Функция для максимального числа цифры
    {
        int maxDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            maxDigit = Math.max(maxDigit, digit);
        }
        return maxDigit;
    }
}







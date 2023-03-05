package ru.acadeimit.java.homework;

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");

        int number = scanner.nextInt();

        System.out.println("Вы ввели число: " + number);

        System.out.println("Сумма его чисел: " + sumOfDigits(number));

        System.out.println("Сумма его нечетных чисел: " + sumOfOdd(number));

        System.out.println("Его максимальное число: " + maxOfDigit(number));
    }

    public static int sumOfDigits(int sumOfDigits)   // Функция для суммирования цифр числа
    {
        int sum = 0;  // переменная для суммы цифр
        while (sumOfDigits > 0) {
            sum += sumOfDigits % 10;
            sumOfDigits /= 10;
        }
        return sum;

    }

    public static int sumOfOdd(int sumOfOdd)// Функция для суммирования нечетных цифр числа
    {
        int sumOdd = 0; //переменная для суммы нечетных цифр
        while (sumOfOdd > 0) {
            int digit = sumOfOdd % 10;
            if (digit % 2 != 0) {
                sumOdd = sumOdd + digit;
            }
            sumOfOdd = sumOfOdd / 10;

        }
        return (int) sumOdd;
    }
    public static int maxOfDigit(int maxDigit)    // Функция для максимального числа цифры
    {
        int maxOfDigit = 0;
        while (maxDigit > 0) {
            int digit = maxDigit % 10;
            maxDigit = maxDigit / 10;
            maxOfDigit = Math.max(maxOfDigit, digit);
        }
        return (int) maxOfDigit;
    }
}







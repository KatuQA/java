package ru.acadeimit.java.homework;

public class Average {
    public static void main(String[] args) {
        int a = 3; // старт
        int b = 17;  // конец
        if (a < b) {
            int countWhole = 0; // количество чисел в диапазоне
            int countEven = 0; // количество четных чисел в диапазоне
            int sumWhole = 0; // сумма чисел в диапазоне
            int sumEven = 0; // сумма четных числел в диапазоне
            for (int i = a; i <= b; i++) {
                countWhole++;
                sumWhole = sumWhole + i;
                if (i % 2 == 0) {
                    countEven++;
                    sumEven = sumEven + i;
                }
            }
            System.out.println("Диапазон с " + a + " до " + b);
            System.out.println("Сумма чисел всего диапазона = " + sumWhole);
            System.out.println("Колличество чисел всего диапазона = " + countWhole);
            System.out.println("Сумма четных чисел диапазона = " + sumEven);
            System.out.println("Колличество четных чисел диапазона = " + countEven);
            float avgWhole = (float) sumWhole / countWhole;      //float потому, что результат деления может быть дробным
            float avgEven = (float) sumEven / countEven;
            System.out.println("Среднее арифметическое всего диапазона = " + avgWhole);
            System.out.println("Среднее арифметическое четных чисел диапазона = " + avgEven);
        } else {
            System.out.println("Ошибка! Неверно задан дипазон.");
        }
    }
}





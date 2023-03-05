package ru.acadeimit.java.homework;

public class For {
    public static void main(String[] args) {
        System.out.println("Диапазон с 1 до 100");
        for (int i = 100; i >= 1; i--) {
            if (multipleByFour(i)) {
                System.out.println("Число в диапазоне, кратное 4 = " + i);
            }
        }
    }

    public static boolean multipleByFour(int j) {
        return j % 4 == 0;
    }

}


package ru.acadeimit.java.homework;

public class For {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;
        System.out.println("Диапазон с " +b  +" до " +a);
        for (int i = b; i >= a; i--) {
            if (multipleByFour(i)) {
                System.out.println("Число, кратное 4 = " + i);
            }
        }
    }
    public static boolean multipleByFour(int j) {
        {
            if (j % 4 == 0) {
                return true;
            } else return false;
        }
    }
}


package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static void main(String[] args) {
        int maxNumber = max(17, 13);
        System.out.println("максимальное число " + maxNumber);

    }
}

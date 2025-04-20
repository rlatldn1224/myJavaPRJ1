package org.example;

public class Exam01_01 {
    public static void main(String[] args) {
        int t = 4;

        for (int i = 0; i < t; i++) {

            String spaces = " ".repeat(t - i - 1);
            String stars = "*".repeat(2 * i + 1);

            System.out.println(spaces + stars);
        }
    }
}

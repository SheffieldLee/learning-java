package com.example.demo02;

public class Print {
    public static void main(String[] args) {
        PrintMethod();
    }

    public static void PrintMethod() {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

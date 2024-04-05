package com.magicvet;

import java.util.Scanner;

public class Main {

    static String PASSWORD = "default";
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        boolean accepted = false;
        for (int i = 1; i < 3; i++) {
            System.out.println("Password: ");
            String input = scanner.nextLine();
            if (PASSWORD.equals(input)) {
                accepted = true;
                break;
            } else {
                System.out.println("Access denied.");
            }
        }
        System.out.println(accepted ? "Wellcome!" : "App blocked");
    }
}
package org.example;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma String: ");
        String entrada = scanner.nextLine();

        String inverterString = "";

        for (int i = entrada.length() - 1; i >= 0; i--) {
            inverterString += entrada.charAt(i);
        }

        System.out.println("String invertida: " + inverterString);

        scanner.close();
    }
}


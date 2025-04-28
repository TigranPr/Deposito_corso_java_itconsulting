package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crea un solo Scanner per leggere input da console
        Scanner scanner = new Scanner(System.in);

        // Richiesta del nome
        System.out.print("Inserisci il tuo nome: ");
        String userName = scanner.nextLine();
        System.out.println("Utente: " + userName);

        // Richiesta dell'età
        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();
        System.out.println("Età: " + eta);

        // Chiude lo Scanner
        scanner.close();
    }
};

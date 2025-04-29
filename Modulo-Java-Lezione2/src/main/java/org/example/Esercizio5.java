package org.example;

import java.util.Scanner;

//Crea un semplice programma che chiede all'utente due numeri in input e calcola somma,
// differenza e moltiplicazione per poi stamparli in console
public class Esercizio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Acquisizione dei due numeri
        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt();

        // Calcoli
        double somma = num1 + num2;
        double differenza = num1 - num2;
        double prodotto = num1 * num2;

        // Stampa dei risultati
        System.out.println("Risultati:");
        System.out.println("Somma: " + somma);
        System.out.println("Differenza: " + differenza);
        System.out.println("Moltiplicazione: " + prodotto);

        scanner.close();
    }
}

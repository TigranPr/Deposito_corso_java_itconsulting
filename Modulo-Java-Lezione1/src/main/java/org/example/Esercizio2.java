package org.example;

import java.util.Scanner;
//Esercizio 2:
// Andare a dare 4 input numerici diversi e confrontare i vari input con tutte e 3 gli operatori logici
public class Esercizio2 {
    public static void main(String[] args) {

        // Crea un oggetto Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Chiede all'utente di inserire 4 numeri interi
        System.out.print("Inserisci il primo numero: ");
        int a = scanner.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int b = scanner.nextInt();
        System.out.print("Inserisci il terzo numero: ");
        int c = scanner.nextInt();
        System.out.print("Inserisci il quarto numero: ");
        int d = scanner.nextInt();

        boolean diverso = (a != b) && (a != c) && (a != d) && (b != c) && (b != d) && (c != d);
        boolean uguale = (a == b) || (a == c) || (a == d) || (b == c) || (b == d) || (c == d);
        boolean nonUguale = !uguale;

        // Stampa i risultati
        System.out.println("\nRisultati dei confronti:");
        System.out.println("I numeri sono diversi? " + diverso);
        System.out.println("I numeri sono uguali? " + uguale);
        System.out.println("I numeri non sono uguali? " + nonUguale);

        // Chiudo lo Scanner alla fine
        scanner.close();
    }
}

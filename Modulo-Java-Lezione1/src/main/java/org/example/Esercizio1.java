package org.example;

import java.util.Scanner;

// Esercizio 1:
// Andare a creare un input per ogni tipo di primitivo e salvarlo su una variabile specifica dopo di che stampare tutti i dati
public class Esercizio1 {

    public static void main(String[] args) {

        // Crea un oggetto Scanner per leggere l'input dell'utente
        Scanner scanner = new Scanner(System.in);

        // Chiede all'utente di inserire 4 numeri interi
        System.out.print("Inserisci un valore di tipo byte: ");
        byte b = scanner.nextByte();
        System.out.print("Inserisci un valore di tipo short: ");
        short s = scanner.nextShort();
        System.out.print("Inserisci un valore di tipo int: ");
        int i = scanner.nextInt();
        System.out.print("Inserisci un valore di tipo long: ");
        long l = scanner.nextLong();
        System.out.print("Inserisci un valore di tipo float: ");
        float f = scanner.nextFloat();
        System.out.print("Inserisci un valore di tipo double: ");
        double d = scanner.nextDouble();
        // Per il tipo char, leggo un carattere alla volta
        System.out.print("Inserisci un valore di tipo char: ");
        char c = scanner.next().charAt(0);
        System.out.print("Inserisci un valore di tipo boolean (true/false): ");
        boolean bool = scanner.nextBoolean();

        // Chiudo lo Scanner alla fine
        scanner.close();

        // Stampa i dati
        //\n significa "a capo"
        System.out.println("\n--- Valori inseriti ---");
        System.out.println("byte:    " + b);
        System.out.println("short:   " + s);
        System.out.println("int:     " + i);
        System.out.println("long:    " + l);
        System.out.println("float:   " + f);
        System.out.println("double:  " + d);
        System.out.println("char:    " + c);
        System.out.println("boolean: " + bool);
    }
}


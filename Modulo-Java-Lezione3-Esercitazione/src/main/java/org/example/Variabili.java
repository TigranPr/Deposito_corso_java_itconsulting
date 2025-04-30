package org.example;

public class Variabili {
    public static void main(String[] args) {
        //------------------------------------------------------------------------------
        // Esercizio 1:
        // Scrivi un programma Java che dichiara una variabile intera chiamata "numero"
        // e le assegna il valore 10. Stampa il valore della variabile.
        //------------------------------------------------------------------------------
        int numero = 10;
        System.out.println("Il valore della variabile numero è: " + numero);
        //------------------------------------------------------------------------------
        // Esercizio 2:
        // Scrivi un programma Java che dichiara una variabile di tipo float chiamata
        // "altezza" e le assegna il valore 1.75. Stampa il valore della variabile.
        //------------------------------------------------------------------------------
        float altezza = 1.75f;
        System.out.println("Il valore della variabile altezza è: " + altezza);
        //------------------------------------------------------------------------------
        // Esercizio 3:
        // Scrivi un programma Java che dichiara una variabile di tipo boolean chiamata
        // "isPieno" e le assegna il valore true. Stampa il valore della variabile.
        //------------------------------------------------------------------------------
        boolean isPieno = true;
        System.out.println("Il valore della variabile isPieno è: " + isPieno);
        //------------------------------------------------------------------------------
        // Esercizio 4:
        //Scrivi un programma Java che dichiara una variabile di tipo char chiamata "lettera" e le assegna il valore 'A'.
        //Stampa il valore della variabile.
        char lettera = 'A';
        System.out.println("Il valore della variabile lettera è: " + lettera);
        //------------------------------------------------------------------------------
        // Esercizio 5:
        //Scrivi un programma Java che dichiara una variabile di tipo String
        //chiamata "nome" e le assegna il valore "Mario Rossi". Stampa il valore della variabile.
        String nome = "Mario Rossi";
        System.out.println("Il valore della variabile nome è: " + nome);
        //------------------------------------------------------------------------------
        // Esercizio 6:
        //Scrivi un programma Java che dichiara una variabile di tipo double chiamata "peso" e le assegna
        //il valore 68.5. Stampa il valore della variabile.
        double peso = 68.5;
        System.out.println("Il valore della variabile peso è: " + peso);
        //------------------------------------------------------------------------------
        // Esercizio 7:
        //Scrivi un programma Java che dichiara due variabili intere chiamate "numero1" e "numero2" e le assegna
        //i valori 5 e 10 rispettivamente. Calcola la somma delle due variabili e stampa il risultato.
        int numero1 = 5;
        int numero2 = 10;
        int somma = numero1 + numero2;
        System.out.println("La somma di " + numero1 + " e " + numero2 + " è: " + somma);
        //------------------------------------------------------------------------------
        // Esercizio 8:
        //Scrivi un programma Java che dichiara due variabili di tipo double chiamate "prezzo1" e "prezzo2" e le
        //assegna i valori 4.99 e 2.5 rispettivamente. Calcola la differenza tra le due variabili e stampa il risultato.
        double prezzo1 = 4.99;
        double prezzo2 = 2.5;
        double differenza = prezzo1 - prezzo2;
        System.out.println("La differenza tra " + prezzo1 + " e " + prezzo2 + " è: " + differenza);
        //------------------------------------------------------------------------------
        // Esercizio 9:
        //Scrivi un programma Java che dichiara una variabile intera chiamata "annoDiNascita" e le
        //assegna il valore 1990. Calcola l'età basandoti sull'anno corrente (supponi che sia il 2025) e stampa il risultato.
        int annoDiNascita = 1990;
        int annoCorrente = 2025;
        int eta = annoCorrente - annoDiNascita;
        System.out.println("L'età è: " + eta);
    }
}

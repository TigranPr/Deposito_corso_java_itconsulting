package org.example;

import java.util.Random;

public class Numeri {
    public static void main(String[] args) {
        //Esercizio 1:
        //Scrivi un programma Java che calcola la somma di due numeri interi e stampa il risultato.
        int numero1 = 30;
        int numero2 = 14;
        int somma = numero1 + numero2;
        System.out.println("La somma è: " + somma);
        //--------------------------------------------------------------------------------
        //Esercizio 2:
        //Scrivi un programma Java che calcola la differenza tra due numeri decimali e stampa il risultato.
        int numero3 = 20;
        int numero4 = 10;
        double differenza = numero3 - numero4;
        System.out.println("La differenza è: " + differenza);
        //--------------------------------------------------------------------------------
        //Esercizio 3:
        //Scrivi un programma Java che calcola il prodotto di tre numeri interi e stampa il risultato.
        int numero5 = 2;
        int numero6 = 3;
        int numero7 = 4;
        int prodotto = numero5 * numero6 * numero7;
        System.out.println("Il prodotto è: " + prodotto);
        //--------------------------------------------------------------------------------
        //Esercizio 4:
        //Scrivi un programma Java che calcola il quoziente tra due numeri decimali e stampa il risultato.
        double numero8 = 10.0;
        double numero9 = 3.0;
        double quoziente = numero8 / numero9;
        System.out.println("Il quoziente è: " + quoziente);
        //--------------------------------------------------------------------------------
        //Esercizio 5:
        //Scrivi un programma Java che calcola il modulo di un numero intero e stampa il risultato.
        int numero10 = 17;
        int numero11 = 5;
        int modulo = numero10 % numero11;
        System.out.println("Il modulo è: " + modulo);
        //--------------------------------------------------------------------------------
        //Esercizio 8:
        //Scrivi un programma Java che trova il valore massimo tra due numeri interi e stampa il risultato.
        int numero12 = 15;
        int numero13 = 25;
        int massimo = Math.max(numero12, numero13);
        System.out.println("Il valore massimo è: " + massimo);
        //--------------------------------------------------------------------------------
        //Esercizio 9:
        //Scrivi un programma Java che trova il valore minimo tra tre numeri decimali e stampa il risultato.
        double numero14 = 5.5;
        double numero15 = 2.3;
        double numero16 = 8.1;
        double minimo = Math.min(Math.min(numero14, numero15), numero16);
        System.out.println("Il valore minimo è: " + minimo);
        //--------------------------------------------------------------------------------
        //Esercizio 10:
        //Scrivi un programma Java che genera un numero casuale compreso tra 1 e 100 e stampa il risultato.
        Random random = new Random();
        int numeroCasuale = random.nextInt(100) + 1;
        System.out.println("Il numero casuale è: " + numeroCasuale);
    }
}

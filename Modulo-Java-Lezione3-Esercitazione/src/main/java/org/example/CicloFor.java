package org.example;

//Il ciclo "for" è una struttura di controllo che permette di eseguire un blocco di codice un numero specifico di volte.
//Utile quando si conosce in anticipo quante volte si desidera eseguire il ciclo.

import java.util.Scanner;

public class CicloFor {
    public static void main(String[] args) {
        //Esercizio 1
        //Stampare i numeri da 1 a 10 utilizzando un ciclo "for":
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //------------------------------------------------------------------------------
        //Esercizio 2
        //Calcolare la somma dei numeri da 1 a 100 utilizzando un ciclo "for":
        int somma = 0;
        for (int i = 1; i <= 100; i++) {
            somma += i;
        }
        System.out.println("La somma dei numeri da 1 a 100 è: " + somma);
        //------------------------------------------------------------------------------
        //Esercizio 3
        //Stampare i numeri pari da 1 a 20 utilizzando un ciclo "for":
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //------------------------------------------------------------------------------
        //Esercizio 4
        //Calcolare il prodotto dei numeri dispari da 1 a 15 utilizzando un ciclo "for":
        int prodotto = 1;
        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                prodotto *= i;// moltiplica il prodotto corrente per i
            }
        }
        System.out.println("Il prodotto dei numeri dispari da 1 a 15 è: " + prodotto);
        //------------------------------------------------------------------------------
        //Esercizio 5
        //Stampare la tabellina del 5 utilizzando un ciclo "for":
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));// stampa la tabellina del 5
        }
        //------------------------------------------------------------------------------
        //Esercizio 6
        //Stampare i caratteri di una stringa uno alla volta utilizzando un ciclo "for":
        String str = "Internet";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));// stampa il carattere alla posizione i
        }
        //------------------------------------------------------------------------------
        //Esercizio 7
        //Calcolare il fattoriale di un numero utilizzando un ciclo "for":
        int numero = 5; // Cambia questo numero per calcolare il fattoriale di un altro numero
        int fattoriale = 1;
        for (int i = 1; i <= numero; i++) {
            fattoriale *= i;// moltiplica il fattoriale corrente per i
        }
        System.out.println("Il fattoriale di " + numero + " è: " + fattoriale);
        //------------------------------------------------------------------------------
        //Esercizio 8
        //Stampare i numeri in ordine decrescente da 10 a 1 utilizzando un ciclo "for":
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);// stampa i numeri in ordine decrescente
        }
        //------------------------------------------------------------------------------
        //Esercizio 9
        //Stampare i quadrati dei numeri da 1 a 10 utilizzando un ciclo "for":
        for (int i = 1; i <= 10; i++) {
            System.out.println("Il quadrato di " + i + " è: " + (i * i));// stampa il quadrato di i
        }
        //------------------------------------------------------------------------------
        //Esercizio 10
        //Stampare una sequenza di numeri in base all'input dell'utente utilizzando un ciclo "for":
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int numeroUtente = scanner.nextInt();
        System.out.print("Sequenza di numeri da 1 a " + numeroUtente + ": ");
        for (int i = 1; i <= numeroUtente; i++) {
            System.out.print(i + " ");// stampa la sequenza di numeri
        }
        System.out.println();
    }
}

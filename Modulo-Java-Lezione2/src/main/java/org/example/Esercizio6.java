package org.example;

import java.util.Scanner;

//Esercizio: Simulazione di un Distributore Automatico
//Scrivi un programma Java che simuli il funzionamento di un distributore automatico di
//bevande. L'utente inizia con un certo credito iniziale (ad esempio, 10€).
//Il programma mostra un menu con le seguenti opzioni:
//1. Caffè - 1.50€
//2. Cappuccino - 2.00€
//3. Tè - 1.00€
//4. Acqua - 0.50€
//5. Uscire
//L'utente può selezionare una bevanda e il costo viene scalato dal credito disponibile.
//Se il credito non è sufficiente, il programma deve avvisare l'utente e chiedere una
//nuova scelta.
//L'utente può continuare a comprare bevande finché non sceglie di uscire o esaurisce il
//credito.
//Alla fine, il programma stampa il credito rimanente e un messaggio di chiusura.
public class Esercizio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double credito = 10.0;
        boolean continua = true;

        // Inizio del ciclo che simula il distributore automatico
        while (continua) {
            System.out.println("Credito disponibile: " + credito + "€");
            System.out.println("Seleziona una bevanda:");
            System.out.println("1. Caffè - 1.50€");
            System.out.println("2. Cappuccino - 2.00€");
            System.out.println("3. Tè - 1.00€");
            System.out.println("4. Acqua - 0.50€");
            System.out.println("5. Uscire");

            int scelta = scanner.nextInt();

            // Controllo la scelta dell'utente
            switch (scelta) {
                case 1:
                    if (credito >= 1.50) {
                        credito -= 1.50;
                        System.out.println("Hai acquistato un Caffè.");
                    } else {
                        System.out.println("Credito insufficiente per il Caffè.");
                    }
                    break;
                case 2:
                    if (credito >= 2.00) {
                        credito -= 2.00;
                        System.out.println("Hai acquistato un Cappuccino.");
                    } else {
                        System.out.println("Credito insufficiente per il Cappuccino.");
                    }
                    break;
                case 3:
                    if (credito >= 1.00) {
                        credito -= 1.00;
                        System.out.println("Hai acquistato un Tè.");
                    } else {
                        System.out.println("Credito insufficiente per il Tè.");
                    }
                    break;
                case 4:
                    if (credito >= 0.50) {
                        credito -= 0.50;
                        System.out.println("Hai acquistato un'Acqua.");
                    } else {
                        System.out.println("Credito insufficiente per l'Acqua.");
                    }
                    break;
                case 5:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }

        // Stampa il credito rimanente e messaggio di chiusura
        System.out.println("Credito rimanente: " + credito + "€");
        System.out.println("Grazie per aver utilizzato il distributore automatico!");
    }
}

package org.example;

import java.util.Scanner;

//Andare a creare un minigame  dove un utente deve inserire un numero per indovinare uno prefisso da voi,
// il sistema deve dirgli se il risultato inserito e più alto o più basso o ha indovinato
public class Esercizio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Benvenuto nel gioco :)");
        System.out.println("Indovina il numero tra 1 e 10");

        int numeroSegreto = 50;
        System.out.print("Inserisci il tuo tentativo: ");
        int num1 = scanner.nextInt();

        if (num1 < numeroSegreto) {
            System.out.println("Il numero segreto è più alto.");
        } else if (num1 > numeroSegreto) {
            System.out.println("Il numero segreto è più basso.");
        } else {
            System.out.println("Hai indovinato! Il numero segreto era " + numeroSegreto);
            scanner.close();
        }
    }
}

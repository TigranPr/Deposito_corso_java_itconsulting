package org.example;

import java.util.Scanner;

public class ProvaCicli {
    public static void main(String[] args) {

//        // il ciclo while esegue il blocco di codice finché la condizione è vera
//        int i = 0;
//        // Inizializzazione della variabile di controllo
//        while (i <= 5) {
//            i++; // Incremento della variabile di controllo
//            System.out.println(i);
//        }
//        //------------------------------------------------------
//        // il ciclo do-while esegue il blocco di codice almeno una volta
//        int k = 0;
//        do {
//            k++; // Incremento della variabile di controllo
//            System.out.println("numero: " + k);
//        } while (k < 5); // Condizione di continuazione del ciclo
//
//
//        // Variabile di controllo del while: finché è true, il ciclo continua
//        boolean controllo = true;
//
//        // Creo uno Scanner per leggere l’input da console
//        Scanner scanner = new Scanner(System.in);
//
//        // Inizio del ciclo che si ripete finché 'controllo' è true
//        while (controllo) {
//            // Chiedo all’utente se vuole continuare
//            System.out.println("Vuoi continuare?");
//
//            // Leggo l’intera riga di input inserita dall’utente
//            String x = scanner.nextLine();
//
//            // Se l’utente digita "no" o "stop", esco dal ciclo impostando controllo=false
//            if (x.equals("no") || x.equals("stop")) {
//                controllo = false;
//            }
//        }
//
//        // Chiudo lo Scanner per rilasciare la risorsa
//        scanner.close();

        Scanner scanner = new Scanner(System.in);

        // Richiede un numero all'utente
        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();

        // Stampa la tabellina del numero
        System.out.println("Tabellina del " + numero + ":");
        // Ciclo for per moltiplicare il numero da 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Chiudo lo Scanner dopo averlo usato
        scanner.close();
    }
    }



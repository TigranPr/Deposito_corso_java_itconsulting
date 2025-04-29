package org.example;

import java.util.Scanner;

//Andare a creare un sistema che ti permetta di registrarti e fare login su due cicli separati e che solo
// dopo il login ti permetta di usare una calcolatrice a due fattori e un sistema di cambio dei dati
public class Esercizio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String nomeutente = "";
         String password = "";
            boolean connessione = false;
            // Ciclo di registrazione
            while (!connessione) {
                System.out.println("Registrati:");
                System.out.print("Inserisci username: ");
                nomeutente = scanner.nextLine();
                System.out.print("Inserisci password: ");
                password = scanner.nextLine();
                System.out.println("Registrazione completata. Ora puoi effettuare il login.");

                // Ciclo di login
                while (!connessione) {
                    System.out.println("Effettua il login:");
                    System.out.print("Inserisci username: ");
                    String utente = scanner.nextLine();
                    System.out.print("Inserisci password: ");
                    String password2 = scanner.nextLine();

                    if (utente.equals(nomeutente) && password2.equals(password)) {
                        connessione = true;
                        System.out.println("Login effettuato con successo!");
                    } else {
                        System.out.println("Credenziali errate. Riprova.");
                    }
                }
            }
            //---------------------------------------------------------------------------------
            // Ciclo della calcolatrice
            boolean calcolatrice = true;
            while (calcolatrice) {
                System.out.println("Calcolatrice:");
                System.out.print("Inserisci il primo numero: ");
                double numero1 = scanner.nextDouble();
                System.out.print("Inserisci il secondo numero: ");
                double numero2 = scanner.nextDouble();
                System.out.print("Scegli un'operazione (+, -, *, /): ");
                char operazione = scanner.next().charAt(0);

                double risultato = 0;
                switch (operazione) {
                    case '+':
                        risultato = numero1 + numero2;
                        break;
                    case '-':
                        risultato = numero1 - numero2;
                        break;
                    case '*':
                        risultato = numero1 * numero2;
                        break;
                    case '/':
                        if (numero2 != 0) {
                            risultato = numero1 / numero2;
                        } else {
                            System.out.println("Errore: divisione per zero.");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Operazione non valida.");
                        continue;
                }
                System.out.println("Risultato: " + risultato);

                // Chiedi se l'utente vuole continuare
                System.out.print("Vuoi continuare? (s/n): ");
                char continua = scanner.next().charAt(0);
                if (continua != 's') {
                    calcolatrice = false;
                }
            }
            System.out.println("Grazie per aver usato la calcolatrice. Arrivederci :)");

            //---------------------------------------------------------------------------------
            // Ciclo per cambiare i dati
            boolean cambioDati = true;
            while (cambioDati) {
                System.out.println("Vuoi cambiare i tuoi dati? (s/n): ");
                char cambia = scanner.next().charAt(0);
                if (cambia == 's') {
                    System.out.print("Inserisci nuovo username: ");
                    nomeutente = scanner.next();
                    System.out.print("Inserisci nuova password: ");
                    password = scanner.next();
                    System.out.println("Dati cambiati con successo!");
                } else {
                    cambioDati = false;
                }
            }
            System.out.println("Grazie per aver usato il sistema. Arrivederci :)!");
            scanner.close();

    }
}

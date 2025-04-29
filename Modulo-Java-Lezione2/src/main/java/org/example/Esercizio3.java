package org.example;

import java.util.Scanner;

//Scrivi un programma Java che calcoli il preventivo per un'assicurazione auto in base ai
//seguenti criteri:
//1.Età del conducente:
//Meno di 18 anni → "Non sei idoneo per l'assicurazione"
//18 - 25 anni → Applica una maggiorazione del 20% sul prezzo base
//26 - 50 anni → Nessuna maggiorazione
//Più di 50 anni → Sconto del 10%
//2.Anni di esperienza alla guida:
//Meno di 2 anni → Applica una maggiorazione del 30% sul prezzo base
//2 o più anni → Nessuna maggiorazione
//3.Numero di incidenti negli ultimi 5 anni:
//0 incidenti → Nessun aumento
//1 incidente → Aumento del 15%
//2 o più incidenti → Aumento del 30%
//Più di 4 incidenti → "Non sei idoneo per l'assicurazione"
//4.Scelta del pacchetto assicurativo:
//Base: Prezzo standard
//Intermedio: +20%
//Premium: +50%
//Prezzo base dell'assicurazione: 500€
public class Esercizio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double prezzoBase = 500;

        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();

        if(eta < 18) {
            System.out.println("Non sei idoneo per l'assicurazione");
        }

        System.out.println("Inserisci gli anni di esperienza alla guida: ");
        int esperienza = scanner.nextInt();

        double maggiorazioneEsperienza = 0;

        if (esperienza < 2) {
            System.out.println("Applica una maggiorazione del 30% sul prezzo base");
            maggiorazioneEsperienza *= 0.30;
        }

        System.out.println("Inserisci il numero di incidenti negli ultimi 5 anni: ");
        int incidenti = scanner.nextInt();

        if(incidenti > 4) {
            System.out.println("Non sei idoneo per l'assicurazione");
        }
        double aumentoIncidenti = 0;

        if(incidenti == 0){
            aumentoIncidenti = 0.15;
        } else if(incidenti >= 2){
            aumentoIncidenti = 0.30;
        }

        System.out.println("Inserisci il pacchetto assicurativo (Base, Intermedio, Premium): ");
        String pacchetto = scanner.next();

        double maggiorazionePacchetto = 0;
        switch (pacchetto.toLowerCase()) {
            case "base":
                maggiorazionePacchetto = 0;
                break;
            case "intermedio":
                maggiorazionePacchetto = 0.20;
                break;
            case "premium":
                maggiorazionePacchetto = 0.50;
                break;
            default:
                System.out.println("Pacchetto non valido");
        }

        double preventivo = prezzoBase;

        if(eta >= 18 && eta <= 25){
            preventivo += prezzoBase * 0.20;
        } else if(eta > 50){
            preventivo -= prezzoBase * 0.10;
        }

        preventivo += preventivo * maggiorazioneEsperienza;
        preventivo += preventivo * aumentoIncidenti;
        preventivo += preventivo * maggiorazionePacchetto;

        System.out.println("Il preventivo per l'assicurazione auto è: " + preventivo + "€");

        scanner.close();


    }

}


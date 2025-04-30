package org.example;

//Le stringhe sono sequenze di caratteri utilizzate per rappresentare testo.
//In Java, le stringhe sono rappresentate dalla classe String.
//Le stringhe sono immutabili, il che significa che una volta create, non possono essere modificate.
//Tuttavia, è possibile creare nuove stringhe a partire da quelle esistenti.
//Le stringhe possono essere concatenate, confrontate e manipolate in vari modi.
//In questo esercizio, esploreremo alcune operazioni comuni sulle stringhe, come la lunghezza, la conversione in maiuscolo,
//la concatenazione, la ricerca di sottostringhe e la rimozione degli spazi bianchi.
//Le operazioni sulle stringhe sono fondamentali in molti programmi e applicazioni, come la manipolazione
//di testo, la validazione degli input e la formattazione dei dati.

public class Stringhe {
    public static void main(String[] args) {
        //Esercizio 1:
        //Scrivi un programma Java che stampa la lunghezza di una stringa.
        String stringa1 = "Ciao, mondo!";
        int lunghezza = stringa1.length();// calcola la lunghezza della stringa
        System.out.println("La lunghezza della stringa è: " + lunghezza);
        //--------------------------------------------------------------------------------
        //Esercizio 2:
        //Scrivi un programma Java che converte una stringa in maiuscolo.
        String stringa2 = "ciao";
        String maiuscolo = stringa2.toUpperCase();// converte la stringa in maiuscolo
        System.out.println("La stringa in maiuscolo è: " + maiuscolo);
        //--------------------------------------------------------------------------------
        //Esercizio 6:
        //Scrivi un programma Java che concatena due stringhe utilizzando l'operatore +.
        String stringa3 = "Ciao";
        String stringa4 = "Mondo";
        String concatenata = stringa3 + " " + stringa4;
        System.out.println("La stringa concatenata è: " + concatenata);
        //--------------------------------------------------------------------------------
        //Esercizio 8:
        //Scrivi un programma Java che verifica se una stringa contiene una determinata sequenza di caratteri
        //utilizzando il metodo contains.
        String frase = "Ciao, come va?";
        System.out.println("Contiene 'come': " + frase.contains("come"));// verifica se una sottostringa è presente all’interno di un’altra stringa.
        //--------------------------------------------------------------------------------
        //Esercizio 10:
        //Scrivi un programma Java che rimuove gli spazi bianchi da una stringa utilizzando il metodo trim.
        String stringa5 = "       Ciao, mondo!      ";
        String senzaSpazi = stringa5.trim();// rimuove gli spazi bianchi all'inizio e alla fine
        System.out.println("La stringa senza spazi è: '" + senzaSpazi + "'");
    }
}

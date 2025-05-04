package org.example;

// Lo switch è una struttura di controllo che consente di eseguire diverse azioni in base al valore di una variabile.
// È simile a una serie di istruzioni if-else, ma può essere più leggibile e più facile da gestire quando si hanno molte condizioni.
// È particolarmente utile quando si ha un numero limitato di casi da gestire, come nel caso di giorni della settimana, mesi dell'anno, ecc.
// In questo esempio, vedremo come utilizzare lo switch per risolvere vari esercizi pratici.

public class Switch {
    public static void main(String[] args) {
        //Esercizio 1
        //Scrivi un programma Java che stampa il nome del giorno della settimana corrispondente a un numero utilizzando il blocco "switch".
        int giorno = 2;// Cambia il numero per testare altri giorni
        String giornoSettimana;
        switch(giorno){
            case 1:
                giornoSettimana = "Lunedì";
                break;
            case 2:
                giornoSettimana = "Martedì";
                break;
            case 3:
                giornoSettimana = "Mercoledì";
                break;
            case 4:
                giornoSettimana = "Giovedì";
                break;
            case 5:
                giornoSettimana = "Venerdì";
                break;
            case 6:
                giornoSettimana = "Sabato";
                break;
            case 7:
                giornoSettimana = "Domenica";
                break;
            default:
                giornoSettimana = "Numero non valido";
        }
        System.out.println("Il giorno della settimana è: " + giornoSettimana);
        //--------------------------------------------------------------------------
        //Esercizio 2
        //Scrivi un programma Java che stampa il mese corrispondente a un numero utilizzando il blocco "switch".
        int mese = 8;// Cambia il numero per testare altri mesi
        String nomeMese;
        switch(mese){
            case 1:
                nomeMese = "Gennaio";
                break;
            case 2:
                nomeMese = "Febbraio";
                break;
            case 3:
                nomeMese = "Marzo";
                break;
            case 4:
                nomeMese = "Aprile";
                break;
            case 5:
                nomeMese = "Maggio";
                break;
            case 6:
                nomeMese = "Giugno";
                break;
            case 7:
                nomeMese = "Luglio";
                break;
            case 8:
                nomeMese = "Agosto";
                break;
            case 9:
                nomeMese = "Settembre";
                break;
            case 10:
                nomeMese = "Ottobre";
                break;
            case 11:
                nomeMese = "Novembre";
                break;
            case 12:
                nomeMese = "Dicembre";
                break;
            default:
                nomeMese = "Numero non valido";
        }
        System.out.println("Il mese è: " + nomeMese);
        //--------------------------------------------------------------------------
        //Esercizio 3
        //Scrivi un programma Java che calcola il numero di giorni in un dato mese utilizzando il blocco "switch".
        int giorni;
        switch(mese){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                giorni = 31;
                break;
            case 4: case 6: case 9: case 11:
                giorni = 30;
                break;
            case 2:
                giorni = 28; // Ignoriamo gli anni bisestili per semplicità
                break;
            default:
                giorni = -1; // Valore non valido
        }
        System.out.println("Il mese " + mese + " (" + nomeMese + ") ha " + giorni + " giorni.");
        //--------------------------------------------------------------------------
        //Esercizio 4
        //Scrivi un programma Java che stampa la stagione corrispondente a un dato mese utilizzando il blocco "switch".
        String stagione;
        switch(mese){
            case 1: case 2: case 3:
                stagione = "Inverno";
                break;
            case 4: case 5: case 6:
                stagione = "Primavera";
                break;
            case 7: case 8: case 9:
                stagione = "Estate";
                break;
            case 10: case 11: case 12:
                stagione = "Autunno";
                break;
            default:
                stagione = "Numero non valido";
        }
        System.out.println("Il mese " + mese + " (" + nomeMese + ") appartiene alla stagione: " + stagione);
        //--------------------------------------------------------------------------
        //Esercizio 5
        //Scrivi un programma Java che converte un numero romano in decimale utilizzando il blocco "switch".
        String numeroRomano = "IV"; // Cambia il numero romano per testare altri valori
        int numeroDecimale = 0;
        switch (numeroRomano) {
            case "I":
                numeroDecimale = 1;
                break;
            case "V":
                numeroDecimale = 5;
                break;
            case "X":
                numeroDecimale = 10;
                break;
            case "L":
                numeroDecimale = 50;
                break;
            case "C":
                numeroDecimale = 100;
                break;
            case "D":
                numeroDecimale = 500;
                break;
            case "M":
                numeroDecimale = 1000;
                break;
            case "II":
                numeroDecimale = 2;
                break;
            case "III":
                numeroDecimale = 3;
                break;
            case "IV":
                numeroDecimale = 4;
                break;
            default:
                numeroDecimale = -1;
        }
        System.out.println("Il numero romano " + numeroRomano + " corrisponde al numero decimale " + numeroDecimale + ".");
        //--------------------------------------------------------------------------
        //Esercizio 6
        //Scrivi un programma Java che calcola il costo di spedizione in base al peso di un pacco utilizzando il blocco "switch".
        double peso = 2.5; // Cambia il peso per testare altri valori
        double costoSpedizione;
        switch ((int) peso) {
            case 1:
                costoSpedizione = 5.0;
                break;
            case 2:
                costoSpedizione = 10.0;
                break;
            case 3:
                costoSpedizione = 15.0;
                break;
            case 4:
                costoSpedizione = 20.0;
                break;
            default:
                costoSpedizione = -1; // Valore non valido
        }
        System.out.println("Il costo di spedizione per un pacco di " + peso + " kg è: " + costoSpedizione + " euro.");
        //--------------------------------------------------------------------------
        //Esercizio 7
        //Scrivi un programma Java che stampa il nome di un mese abbreviato corrispondente a un numero utilizzando il blocco "switch".
        int numeMese = 4; // Cambia il numero per testare altri mesi
        String meseAbbr;
        switch(numeMese){
            case 1:
                meseAbbr = "Gen";
                break;
            case 2:
                meseAbbr = "Feb";
                break;
            case 3:
                meseAbbr = "Mar";
                break;
            case 4:
                meseAbbr = "Apr";
                break;
            case 5:
                meseAbbr = "Mag";
                break;
            case 6:
                meseAbbr = "Giu";
                break;
            case 7:
                meseAbbr = "Lug";
                break;
            case 8:
                meseAbbr = "Ago";
                break;
            case 9:
                meseAbbr = "Set";
                break;
            case 10:
                meseAbbr = "Ott";
                break;
            case 11:
                meseAbbr = "Nov";
                break;
            case 12:
                meseAbbr = "Dic";
                break;
            default:
                meseAbbr = "Numero non valido";
        }
        System.out.println("Il mese abbreviato è: " + meseAbbr);
        //--------------------------------------------------------------------------
        //Esercizio 8
        //Scrivi un programma Java che stampa il numero romano corrispondente a un numero decimale utilizzando il blocco "switch".
        int numeroDecimale2 = 8; // Cambia il numero decimale per testare altri valori
        String numeroRomano2;
        switch (numeroDecimale2) {
            case 1:
                numeroRomano2 = "I";
                break;
            case 2:
                numeroRomano2 = "II";
                break;
            case 3:
                numeroRomano2 = "III";
                break;
            case 4:
                numeroRomano2 = "IV";
                break;
            case 5:
                numeroRomano2 = "V";
                break;
            case 6:
                numeroRomano2 = "VI";
                break;
            case 7:
                numeroRomano2 = "VII";
                break;
            case 8:
                numeroRomano2 = "VIII";
                break;
            case 9:
                numeroRomano2 = "IX";
                break;
            case 10:
                numeroRomano2 = "X";
                break;
            default:
                numeroRomano2 = "Numero non valido";
        }
        System.out.println("Il numero decimale " + numeroDecimale2 + " corrisponde al numero romano " + numeroRomano2 + ".");
        //--------------------------------------------------------------------------
        //Esercizio 9
        //Scrivi un programma Java che stampa il nome del colore corrispondente a un codice utilizzando il blocco "switch".
        String colore = "Y"; // Cambia il codice per testare altri colori
        String nomeColore;
        switch (colore) {
            case "R":
                nomeColore = "Rosso";
                break;
            case "G":
                nomeColore = "Verde";
                break;
            case "B":
                nomeColore = "Blu";
                break;
            case "Y":
                nomeColore = "Giallo";
                break;
            case "O":
                nomeColore = "Arancione";
                break;
            default:
                nomeColore = "Colore non valido";
        }
        System.out.println("Il colore corrispondente al codice " + colore + " è: " + nomeColore);
        //--------------------------------------------------------------------------
        //Esercizio 10
        //Scrivi un programma Java che calcola il prezzo di un prodotto in base al codice utilizzando il blocco "switch".
        String codiceProdotto = "A"; // Cambia il codice per testare altri prodotti
        double prezzoProdotto;
        switch (codiceProdotto) {
            case "A":
                prezzoProdotto = 10.0;
                break;
            case "B":
                prezzoProdotto = 20.0;
                break;
            case "C":
                prezzoProdotto = 30.0;
                break;
            case "D":
                prezzoProdotto = 40.0;
                break;
            default:
                prezzoProdotto = -1; // Valore non valido
        }
        System.out.println("Il prezzo del prodotto con codice " + codiceProdotto + " è: " + prezzoProdotto + " euro.");
    }
}

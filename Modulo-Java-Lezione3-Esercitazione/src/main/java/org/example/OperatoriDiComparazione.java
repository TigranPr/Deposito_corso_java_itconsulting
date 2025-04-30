package org.example;

// Gli operatori di confronto sono utilizzati per confrontare due valori e restituire un valore booleano (vero o falso).
// Gli operatori di confronto più comuni in Java sono:
// == (uguale), != (diverso), > (maggiore), < (minore), >= (maggiore o uguale), <= (minore o uguale).
// Gli operatori di confronto sono fondamentali per prendere decisioni nel codice e controllare il flusso di esecuzione.
// In questo esercizio, esploreremo alcuni operatori di confronto e come utilizzarli in vari contesti.

public class OperatoriDiComparazione {
    public static void main(String[] args) {
        //Esercizio 1:
        //Scrivi un programma Java che determini se un numero intero è positivo.
        int numero = 10;
        boolean positivo = numero > 0;
        System.out.println("Il numero è positivo? " + positivo);
        //-----------------------------------------------------------------------
        //Esercizio 2:
        //Scrivi un programma Java che verifichi se un numero intero è pari.
        int num = 20;
        int num2 = 21;
        boolean pari = num % 2 == 0;// verifica se il numero è pari
        boolean dispari = num2 % 2 == 0;// verifica se il numero è dispari
        System.out.println("Il numero è pari? " + pari);//true
        System.out.println("Il numero è pari? " + dispari);//false
        //-----------------------------------------------------------------------
        //Esercizio 3:
        //Scrivi un programma Java che confronti due stringhe e determini se sono uguali.
        String str = "PIPPO";
        String str2 = "PIPPO";
        boolean uguali = str.equals(str2);// confronta il contenuto delle stringhe
        System.out.println("Le stringhe sono uguali? " + uguali);//true
        //-----------------------------------------------------------------------
        //Esercizio 4:
        //Scrivi un programma Java che confronti due numeri interi e determini se sono diversi.
        int numero1 = 10;
        int numero2 = 20;
        boolean diversi = numero1 != numero2;// verifica se i numeri sono diversi
        System.out.println("I numeri sono diversi? " + diversi);//true
        //-----------------------------------------------------------------------
        //Esercizio 5:
        //Scrivi un programma Java che verifichi se una stringa è vuota.
        String testo = "";
        System.out.println("La stringa è vuota? " + testo.isEmpty());// verifica se la stringa è vuota
        //------------------------------------------------------------------------
        //Esercizio 6:
        //Scrivi un programma Java che confronti due numeri interi e determini se
        //il primo numero è maggiore del secondo.
        int x = 50;
        int y = 20;
        boolean risultato = x > y;
        System.out.println("Il primo numero è maggiore del secondo? " + risultato);//true
        //------------------------------------------------------------------------
        //Esercizio 7:
        //Scrivi un programma Java che confronti due numeri interi e determini
        //se il primo numero è minore o uguale al secondo.
        int a = 10;
        int b = 20;
        boolean risultato2 = a <= b;
        System.out.println("Il primo numero è minore o uguale al secondo? " + risultato2);//true
        //------------------------------------------------------------------------
        //Esercizio 8:
        //Scrivi un programma Java che confronti due stringhe e determini se la
        //prima stringa è più lunga della seconda.
        String s = "Ciao a tutti";
        String s2 = "Mondo";
        boolean lunghezza = s.length() > s2.length();// confronta la lunghezza delle stringhe
        System.out.println("La prima stringa è più lunga della seconda? " + lunghezza);//false
        //------------------------------------------------------------------------
        //Esercizio 9:
        //Scrivi un programma Java che verifichi se un numero intero è compreso tra due valori specifici.
        int numero3 = 15;
        int min = 10;
        int max = 20;
        boolean compreso = numero3 >= min && numero3 <= max;// verifica se il numero è compreso tra min e max
        System.out.println("Il numero è compreso tra " + min + " e " + max + "? " + compreso);//true
        //------------------------------------------------------------------------
        //Esercizio 10:
        //Scrivi un programma Java che confronti due caratteri e determini se sono uguali.
        char cr = 'A';
        char cr2 = 'B';
        boolean uguale = cr == cr2;// confronta i caratteri
        System.out.println("I caratteri sono uguali? " + uguale);//false
    }
}

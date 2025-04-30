package org.example;

//Le costanti sono variabili il cui valore non può essere modificato dopo la loro inizializzazione.
//In Java, le costanti vengono dichiarate utilizzando la parola chiave "final".

public class Costanti {
    public static void main(String[] args) {
        //Esercizio 1: Definizione di Costanti con final
        //Definire una costante intera e stamparne il valore.
        final int COSTANTE_INTERA = 100;
        System.out.println("Il valore della costante intera è: " + COSTANTE_INTERA);
        //--------------------------------------------------------------------------------
        //Esercizio 2: Costanti di Tipo Stringa
        //Definire una costante di tipo stringa e stamparne il valore.
        final String COSTANTE_STRINGA = "Costante di tipo Stringa";
        System.out.println("Il valore della costante stringa è: " + COSTANTE_STRINGA);
        //--------------------------------------------------------------------------------
        //Esercizio 3: Costanti di Tipo Double
        //Definire una costante di tipo double e stamparne il valore.
        final double COSTANTE_DOUBLE = 3.14;
        System.out.println("Il valore della costante double è: " + COSTANTE_DOUBLE);
    }
}

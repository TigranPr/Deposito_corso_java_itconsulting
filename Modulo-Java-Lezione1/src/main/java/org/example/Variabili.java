package org.example;

public class Variabili {
    public static void main(String[] args) {
        // Tipi primitivi e stampa
        int provaNumero = 12;
        String provaTesto = "Ciao Mondo";
        boolean provaBool = true;
        System.out.println("intero" + provaNumero);
        System.out.println("stringa" + provaTesto);
        System.out.println("booleano" + provaBool);
        //---------------------------------------------------
        // Modifica di variabili
        provaBool = false;
        System.out.println("booleano modificato" + provaBool);
        //---------------------------------------------------
        // Dichiarazione di variabili
        String testo = "Prova";
        System.out.println(testo);
        testo = "Mondo";
        System.out.println("Ciao " + testo);
        String firstPart = "Ciao ";
        String lastPart = "Mondo";
        String fullPart = firstPart + lastPart;
        System.out.println(fullPart);
        //---------------------------------------------------
        //Una volta dichiarata una costante, non può essere modificata
        final int provaNumeroFinal = 15;
        // provaNumeroFinal = 20;  // Questa riga causerebbe un errore, quindi va rimossa
        //------------------------------------------------
        // Operazioni aritmetiche
        int a = 5;
        int b = 6;
        System.out.println("Somma a + b = " + (a + b));
        //------------------------------------------------
        // Operazioni aritmetiche con variabili
        int x2 = 5, y2 = 6, z2 = 50; // variabili dichiarate su una riga diversa
        System.out.println(x2 + y2 + z2);
        //-----------------------------------------------
        // Assegnazione multipla
        int x3, y3, z3;
        x3 = y3 = z3 = 50; // assegnamento corretto
        System.out.println(x3 + y3 + z3);
        //------------------------------------------------
        float myFloat = 35e3f;
        double myDouble = 12E4d;
        System.out.println("Float" + myFloat);
        System.out.println("Double" +  myDouble);
    }
}

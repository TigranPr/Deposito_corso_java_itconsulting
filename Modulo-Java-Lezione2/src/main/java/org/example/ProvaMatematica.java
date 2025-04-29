package org.example;

public class ProvaMatematica {
    public static void main(String[] args) {

        //il min serve per calcolare il minimo tra due numeri
        int a = 42;
        int b = 27;
        int min = Math.min(a, b);
        System.out.println("Il minimo tra " + a + " e " + b + " è: " + min);
        //--------------------------------------------------------------------------------
        //il max serve per calcolare il massimo tra due numeri
        int c = 10;
        int d = 20;
        int maggiore = Math.max(c, d);
        System.out.println("Il maggiore tra " + c + " e " + d + " è: " + maggiore);

        //--------------------------------------------------------------------------------
        // il metodo abs serve per calcolare il valore assoluto di un numero
        int x = -5;
        int y = Math.abs(x);
        System.out.println(y);  // Stampa: 5
        //---------------------------------------------------------------------------------
        // il metodo random serve per generare un numero casuale tra 0 e 1
        double r = Math.random();
        System.out.println(r);
    }
}

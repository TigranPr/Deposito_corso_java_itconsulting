package org.example;

import java.util.Arrays;

public class ProvaCaratteriSpeciali {
    public static void main(String[] args) {

        // \n è il carattere di escape per "nuova riga"
        String saluto = "Riga1\nRiga2\nRiga3";
        System.out.println( saluto);
        // Stampa:
        // Riga1
        // Riga2
        // Riga3


        char apice = '\'';
        System.out.println(apice);// Stampa: '

        String str = "Hello World";
        // split("\\s") divide la stringa su qualsiasi carattere di spazio (spazio, tab, ecc.)
        // restituisce un array di sottostringhe
        String[] words = str.split("\\s");
        // Arrays.toString() serve a trasformare l'array in una rappresentazione testuale leggibile
        // Stampa: [Hello, World]
        System.out.println(Arrays.toString(words));

        // Stringa con spazi all'inizio e alla fine
        String original = "   Hello World   ";
        System.out.println("Originale: [" + original + "]");

        // Applico trim() per rimuovere spazi iniziali e finali
        String trimmed = original.trim();
        System.out.println("Trimmed : [" + trimmed + "]");

    }
}

package org.example;


import java.util.Arrays;

public class Esercizio1 {
    public static void main(String[] args) {
        //Esercizio 1
        //Calcolare la somma degli elementi di un array di interi:
        int[] array = {9, 56, 85, 16, 37};
        int somma = 0;
        for (int i = 0; i < array.length; i++) {// scorre l'array
            somma += array[i];// somma = somma + array[i];
        }
        System.out.println("La somma degli elementi dell'array è: " + somma);
        //--------------------------------------------------------------------
        //Esercizio 2
        //Trovare il valore massimo in un array di numeri interi:
        int[] array2 = {9, 56, 85, 16, 37};
        int max = array2[0];// inizializza il massimo con il primo elemento dell'array
        for (int i = 1; i < array2.length; i++) {
            if (array2[i] > max) {// controlla se l'elemento corrente è maggiore del massimo attuale
                max = array2[i];// aggiorna il massimo
            }
        }
        System.out.println("Il valore massimo dell'array è: " + max);
        //--------------------------------------------------------------------
        //Esercizio 3
        //rovare il valore minimo in un array di numeri interi:
        int[] array3 = {9, 56, 85, 16, 37};
        int min = array3[0];// inizializza il minimo con il primo elemento dell'array
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] < min) {// controlla se l'elemento corrente è minore del minimo attuale
                min = array3[i];// aggiorna il minimo
            }
        }
        System.out.println("Il valore minimo dell'array è: " + min);
        //--------------------------------------------------------------------
        //Esercizio 4
        //Contare il numero di elementi pari in un array di numeri interi:
        int[] array4 = {9, 56, 85, 16, 37};
        int count = 0;// inizializza il contatore
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] % 2 == 0) {// controlla se l'elemento corrente è pari
                count++;// incrementa il contatore
            }
        }
        System.out.println("Il numero di elementi pari nell'array è: " + count);
        //--------------------------------------------------------------------
        //Esercizio 5
        //Contare il numero di elementi dispari in un array di numeri interi:
        int[] array5 = {9, 56, 85, 16, 37};
        int countDispari = 0;// inizializza il contatore
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] % 2 != 0) {// controlla se l'elemento corrente è dispari
                countDispari++;// incrementa il contatore
            }
        }
        System.out.println("Il numero di elementi dispari nell'array è: " + countDispari);
        //--------------------------------------------------------------------
        //Esercizio 6
        //Contare il numero di occorrenze di un elemento in un array di stringhe:
        String[] array6 = {"mela", "banana", "arancia", "mela", "kiwi"};
        String elementoDaContare = "mela";// elemento da contare
        int countOccorrenze = 0;// inizializza il contatore
        for(String elemento : array6) {// questo ciclo for-each scorre l'array
            if(elemento.equals(elementoDaContare)){
                countOccorrenze++;// incrementa il contatore
            }
        }
        System.out.println("Il numero di occorrenze dell'elemento " + elementoDaContare + " nell'array è: " + countOccorrenze);
        //--------------------------------------------------------------------
        //Esercizio 7
        //Copiare gli elementi di un array in un nuovo array:
        int[] vecchio = {9, 56, 85, 16, 37};
        int[] nuovo = new int[vecchio.length];// crea un nuovo array della stessa lunghezza
        for (int i = 0; i < vecchio.length; i++) {
            nuovo[i] = vecchio[i];// copia gli elementi
        }
        System.out.println("Array originale: " + Arrays.toString(vecchio));
        System.out.println("Array nuovo: " + Arrays.toString(nuovo));
        //--------------------------------------------------------------------
        //Esercizio 8
        //Invertire gli elementi di un array:
        int[] array8 = {9, 56, 85, 16, 37};
        int[] arrayInvertito = new int[array8.length];// crea un nuovo array della stessa lunghezza
        for (int i = 0; i < array8.length; i++) {
            arrayInvertito[i] = array8[array8.length - 1 - i];// copia gli elementi in ordine inverso
        }
        System.out.println("Array originale: " + Arrays.toString(array8));
        System.out.println("Array invertito: " + Arrays.toString(arrayInvertito));
        //--------------------------------------------------------------------
        //Esercizio 9
        //Ordinare un array di numeri interi in ordine crescente:
        int[] array9 = {9, 56, 85, 16, 37};
        Arrays.sort(array9);// utilizza il metodo sort della classe Arrays per ordinare l'array
        System.out.println("Array ordinato in ordine crescente: " + Arrays.toString(array9));
        //--------------------------------------------------------------------
        //Esercizio 10
        //Ordinare un array di numeri interi in ordine decrescente:
        int[] array10 = {9, 56, 85, 16, 37};
        Arrays.sort(array10);// utilizza il metodo sort della classe Arrays per ordinare l'array
        int[] arrayDecrescente = new int[array10.length];// crea un nuovo array della stessa lunghezza
        for (int i = 0; i < array10.length; i++) {
            arrayDecrescente[i] = array10[array10.length - 1 - i];// copia gli elementi in ordine inverso
        }
        System.out.println("Array ordinato in ordine decrescente: " + Arrays.toString(arrayDecrescente));



    }
}
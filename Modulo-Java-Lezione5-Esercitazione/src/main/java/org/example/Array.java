package org.example;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //Dati questi numeri, ordina l’array in ordine crescente e stampalo
        int[] array = {9, 56, 85, 16, 37};
        Arrays.sort(array);//sort ha la funzione di ordinare l'array in ordine crescente
        System.out.println("Array ordinato in ordine crescente: " + java.util.Arrays.toString(array));
        //--------------------------------------------------------------------------
        //crea un array di 8 booleani e inizializzalo tutto a true, poi modifica solo gli indici da 2 a 5 (compresi) a false.
        boolean[] booleanArray = new boolean[8];// crea un array di 8 booleani
        Arrays.fill(booleanArray, true);// fill ha la funzione di riempire l'array con il valore true
        for (int i = 2; i <= 5; i++) {//Gli elementi negli indici 0 e 1 restano true, mentre gli indici da 2 a 5 diventano false, e gli indici da 6 a 7 restano true
            booleanArray[i] = false;
        }
        System.out.println("Array booleano: " + Arrays.toString(booleanArray));
        //--------------------------------------------------------------------------
        //Confronta due array di double, uno creato a mano e l’altro copiato, per verificare se “sono identici”.
        double[] array1 = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] array2 = {1.0, 2.0, 3.0, 4.0, 5.0};
        boolean areEqual = Arrays.equals(array1, array2);//equals ha la funzione di confrontare i due array
        if (areEqual) {
            System.out.println("I due array sono identici.");
        } else {
            System.out.println("I due array non sono identici.");
        }
        //--------------------------------------------------------------------------
        //Parti da un array già ordinato, ricerca con binarySearch

        int[] sortedArray = {1, 2, 3, 4, 5};
        int target = 3;
        int index = Arrays.binarySearch(sortedArray, target);//binarySearch ha la funzione di cercare un elemento in un array ordinato
        if (index >= 0) {
            System.out.println("L'elemento " + target + " si trova all'indice " + index + " dell'array ordinato.");
        } else {
            System.out.println("L'elemento " + target + " non è stato trovato nell'array ordinato.");
        }
        //--------------------------------------------------------------------------
        //Stampa un array bidimensionale, visualizzazione con toString e deepToString

        int[][] arrayBidimensionale = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        System.out.println("Array bidimensionale: " + Arrays.toString(arrayBidimensionale));// toString non funziona per gli array bidimensionali
        System.out.println("Array bidimensionale (deepToString): " + Arrays.deepToString(arrayBidimensionale));// deepToString ha la funzione di stampare gli array bidimensionali
        //--------------------------------------------------------------------------
        // usa il metodo copyRange per copiare una parte di un array in un nuovo array
        int[] arrayDaCopiare = {1, 2, 3, 4, 5};
        int[] arrayCopiato = Arrays.copyOfRange(arrayDaCopiare, 1, 4);// copyOfRange ha la funzione di copiare una parte dell'array
        System.out.println("Array copiato: " + Arrays.toString(arrayCopiato));// stampa l'array copiato
        //--------------------------------------------------------------------------
        // usa il metodo fill per riempire un array con un valore specifico
        int[] arrayDaRiempire = new int[5];// crea un array di 5 elementi
        Arrays.fill(arrayDaRiempire, 10);// fill ha la funzione di riempire l'array con il valore 10
        System.out.println("Array riempito: " + Arrays.toString(arrayDaRiempire));// stampa l'array riempito
        //--------------------------------------------------------------------------
        // usa il metodo setAll per impostare tutti gli elementi di un array a un valore specifico
        int[] arrayDaImpostare = new int[5];// crea un array di 5 elementi
        Arrays.setAll(arrayDaImpostare, i -> i * 3);// setAll ha la funzione di impostare gli elementi dell'array a un valore specifico
        System.out.println("Array impostato: " + Arrays.toString(arrayDaImpostare));// stampa l'array impostato
        //--------------------------------------------------------------------------
        // usa il metodo parallelSort per ordinare un array in parallelo
        int[] arrayDaOrdinare = {9, 3, 7, 5, 2};
        Arrays.parallelSort(arrayDaOrdinare);// parallelSort ha la funzione di ordinare l'array in parallelo
        System.out.println("Array ordinato in parallelo: " + Arrays.toString(arrayDaOrdinare));// stampa l'array ordinato
        //--------------------------------------------------------------------------
        // usa il metodo stream per creare uno stream da un array
        int[] arrayDaStream = {1, 2, 3, 4, 5};
        int somma = Arrays.stream(arrayDaStream).sum();// stream ha la funzione di creare uno stream dall'array e sommare gli elementi
        System.out.println("Somma degli elementi dell'array: " + somma);// stampa la somma degli elementi dell'array
        //--------------------------------------------------------------------------
        // usa il metodo mismatch per trovare il primo indice in cui due array differiscono
        int[] array1Mismatch = {1, 2, 3, 4, 5};
        int[] array2Mismatch = {1, 2, 0, 4, 5};
        int mismatchIndex = Arrays.mismatch(array1Mismatch, array2Mismatch);// mismatch ha la funzione di trovare il primo indice in cui i due array differiscono
        if (mismatchIndex >= 0) {
            System.out.println("I due array sono diversi all'indice " + mismatchIndex + ".");
        } else {
            System.out.println("I due array sono identici.");
        }
        //--------------------------------------------------------------------------
        // usa il metodo hashCode per ottenere il codice hash di un array
        int[] arrayDaHash = {1, 2, 3, 4, 5};
        int hashCode = Arrays.hashCode(arrayDaHash);// hashCode ha la funzione di ottenere il codice hash dell'array
        System.out.println("Codice hash dell'array: " + hashCode);// stampa il codice hash dell'array
    }
}

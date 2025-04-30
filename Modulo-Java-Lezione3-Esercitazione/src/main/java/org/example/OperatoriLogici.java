package org.example;

public class OperatoriLogici {
    public static void main(String[] args) {
        //Esercizio 1:
        //Scrivi un programma Java che verifichi se un numero è compreso tra 10 e 20 (estremi inclusi).
        //Utilizza gli operatori logici.
        int numero = 15;
        boolean compreso = numero >= 10 && numero <= 20;
        System.out.println("Il numero è compreso tra 10 e 20? " + compreso);//true
        //--------------------------------------------------------------------------------
        //Esercizio 2:
        //Scrivi un programma Java che determini se un anno è bisestile o meno.
        //Un anno bisestile è divisibile per 4, ma non per 100, a meno che non sia anche divisibile per 400.
        int anno = 1600;
        boolean bisestile = (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);//verifica se l'anno è bisestile
        System.out.println("L'anno è bisestile? " + bisestile);//true
        //--------------------------------------------------------------------------------
        //Esercizio 3:
        //Scrivi un programma Java che verifichi se una stringa è vuota o null.
        String str = "";
        boolean vuota =  str == null || str.isEmpty();//verifica se la stringa è vuota o null
        System.out.println("La stringa è vuota o null? " + vuota);//true
        //--------------------------------------------------------------------------------
        //Esercizio 4:
        //Scrivi un programma Java che verifichi se un numero è positivo e dispari.
        int nume = 9;
        boolean risultato = nume > 0 && nume % 2 != 0;//verifica se il numero è positivo e dispari
        System.out.println("Il numero è positivo e dispari? " + risultato);//true
        //--------------------------------------------------------------------------------
        //Esercizio 5:
        //Scrivi un programma Java che determini se una persona è maggiorenne.
        //La persona è maggiorenne se ha almeno 18 anni.
        int eta = 19;
        boolean moggiornenne = eta >= 18;//verifica se la persona è maggiorenne
        System.out.println("La persona è maggiorenne? " + moggiornenne);//true
        //--------------------------------------------------------------------------------
        //Esercizio 6:
        //Scrivi un programma Java che verifichi se un carattere è una vocale minuscola.
        char carattere = 'a';
        boolean vocale = carattere == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u';//verifica se il carattere è una vocale minuscola
        System.out.println("Il carattere è una vocale minuscola? " + vocale);//true
        //--------------------------------------------------------------------------------
        //Esercizio 7:
        //Scrivi un programma Java che determini se un numero è pari e divisibile per 3.
        int numero2 = 12;
        boolean pariDivisibile = numero2 % 2 == 0 && numero2 % 3 == 0;//verifica se il numero è pari e divisibile per 3
        System.out.println("Il numero è pari e divisibile per 3? " + pariDivisibile);//true
        //--------------------------------------------------------------------------------
        //Esercizio 8:
        //Scrivi un programma Java che verifichi se un numero è negativo o zero.
        int numero3 = -3;
        boolean negativoZero = numero3 < 0 || numero3 == 0;//verifica se il numero è negativo o zero
        System.out.println("Il numero è negativo o zero? " + negativoZero);//true
        //--------------------------------------------------------------------------------
        //Esercizio 10:
        //Scrivi un programma Java che verifichi se un carattere è una consonante minuscola.
        char carattere2 = 'b';
        boolean consonante = (carattere2 >= 'a' && carattere2 <= 'z') && !(carattere2 == 'a' || carattere2 == 'e' || carattere2 == 'i' || carattere2 == 'o' || carattere2 == 'u');//verifica se il carattere è una consonante minuscola
        System.out.println("Il carattere è una consonante minuscola? " + consonante);//true
    }
}

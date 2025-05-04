package org.example;
// Le if sono utilizzate per eseguire un blocco di codice se una condizione è vera.
// Le else if sono utilizzate per eseguire un blocco di codice se una condizione è vera, altrimenti esegue il blocco di codice else.
// Le else sono utilizzate per eseguire un blocco di codice se nessuna delle condizioni precedenti è vera.
// Le condizioni possono essere combinate utilizzando gli operatori logici && (AND) e || (OR).
public class CondizioniIF {
    public static void main(String[] args) {
        //Esercizio 1
        //Scrivi un programma Java che verifica se un numero intero è positivo, negativo o zero.
        int numero = -9; // Cambia questo valore per testare altri numeri
        if(numero > 0){
            System.out.println("il numero è positivo");
        }else if (numero < 0){
            System.out.println("il numero è negativo");
        }else{
            System.out.println("il numero è zero");
        }
        //--------------------------------------------------------------
        //Esercizio 2
        //Scrivi un programma Java che verifica se un numero è pari o dispari.
        int numero1 = 10; // Cambia questo valore per testare altri numeri
        if (numero1 % 2 == 0){
            System.out.println("il numero è pari");
        }else{
            System.out.println("il numero è dispari");
        }
        //--------------------------------------------------------------
        //Esercizio 3
        //Scrivi un programma Java che verifica se un carattere è una lettera maiuscola o una lettera minuscola.
        char carattere = 'F'; // Cambia questo valore per testare altri caratteri
        if(carattere >= 'A' && carattere <= 'Z'){
            System.out.println("il carattere è una lettera maiuscola");
        }else if(carattere >= 'a' && carattere <= 'z'){
            System.out.println("il carattere è una lettera minuscola");
        }else{
            System.out.println("il carattere non è una lettera");
        }
        //--------------------------------------------------------------
        //Esercizio 4
        //Scrivi un programma Java che verifica se un anno è bisestile.
        int anno = 1600; // Cambia questo valore per testare altri anni
        if (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0)) {
            System.out.println("L'anno è bisestile.");
        } else {
            System.out.println("L'anno non è bisestile.");
        }
        //--------------------------------------------------------------
        //Esercizio 5
        //Scrivi un programma Java che verifica se un numero è positivo e pari.
        int numero2 = 8; // Cambia questo valore per testare altri numeri
        if(numero2 >0 && numero % 2 == 0){
            System.out.println("il numero è positivo e pari");
        }else{
            System.out.println("il numero non è positivo e pari");
        }
        //--------------------------------------------------------------
        //Esercizio 6
        //Scrivi un programma Java che verifica se una stringa è vuota o null.
        String string = ""; // Cambia questo valore per testare altre stringhe
        if(string == null || string.isEmpty()){
            System.out.println("la stringa è vuota o null");
        }else {
            System.out.println("la stringa non è vuota");
        }
        //--------------------------------------------------------------
        //Esercizio 7
        //Scrivi un programma Java che verifica se un numero è compreso tra due valori.
        int num = 15;
        int numeroMin = 10;
        int numeroMax = 20;
        if(num > numeroMin && num < numeroMax){
            System.out.println("il numero è compreso tra " + numeroMin + " e " + numeroMax);
        }else{
            System.out.println("il numero non è compreso tra " + numeroMin + " e " + numeroMax);
        }
        //--------------------------------------------------------------
        //Esercizio 8
        //Scrivi un programma Java che verifica se un carattere è una vocale o una consonante.
        char lettera = 'a'; // Cambia questo valore per testare altri caratteri
        if (lettera == 'a' || lettera == 'e' || lettera == 'i' || lettera == 'o' || lettera == 'u' || lettera == 'A' || lettera == 'E' || lettera == 'I' || lettera == 'O' || lettera == 'U'){
            System.out.println("il carattere è una vocale");
        }else{
            System.out.println("Il carattere è una consonante");
        }
        //--------------------------------------------------------------
        //Esercizio 9
        //Scrivi un programma Java che verifica se una persona è maggiorenne o minorenne in base all'età.
        int eta = 18;
        if(eta >= 18){
            System.out.println("la persona è maggiorenne");
        }else{
            System.out.println("la persona è minorenne");
        }
        //--------------------------------------------------------------
        //Esercizio 10
        //Scrivi un programma Java che calcola il prezzo scontato di un prodotto in base all'importo e al tasso di sconto.
        double prezzo = 100.0;
        double sconto = 0.2;
        double prezzoScontato = prezzo - (prezzo * sconto);
        System.out.println("Il prezzo scontato è: " + prezzoScontato);
    }
}
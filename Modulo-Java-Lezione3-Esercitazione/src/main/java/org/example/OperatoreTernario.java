package org.example;

// l'operatore ternario è un operatore condizionale che consente di eseguire una valutazione condizionale in modo compatto.
// La sintassi dell'operatore ternario è la seguente:
// condizione ? valore_se_vero : valore_se_falso;
// Se la condizione è vera, viene restituito il valore_se_vero; altrimenti, viene restituito il valore_se_falso.
// L'operatore ternario è spesso utilizzato come alternativa compatta a un'istruzione if-else.
public class OperatoreTernario {
    public static void main(String[] args) {
        //Esercizio 1:
        //Scrivi un programma Java che verifica se un numero è pari o dispari utilizzando l'operatore ternario.
        int numero = 7;
        String risultato = (numero % 2 == 0) ?"Pari" : "Dispari";// operatore ternario
        System.out.println("Il numero " + numero + " è: " + risultato);
        //--------------------------------------------------------------------------------
        //Esercizio 2:
        //Scrivi un programma Java che calcola il valore assoluto di un numero utilizzando l'operatore ternario.
        int numeroAssoluto = -10;
        int valoreAssoluto = (numeroAssoluto < 0) ? -numeroAssoluto : numeroAssoluto;
        System.out.println("Il valore assoluto di " + numeroAssoluto + " è: " + valoreAssoluto);
        //--------------------------------------------------------------------------------
        //Esercizio 3:
        //Scrivi un programma Java che verifica se un anno è bisestile utilizzando l'operatore ternario.
        int annoBisestile = 1600;
        String bisestile = (annoBisestile % 4 == 0 && (annoBisestile % 100 != 0 || annoBisestile % 400 == 0)) ? "Bisestile" : "Non bisestile";
        System.out.println("L'anno " + annoBisestile + " è: " + bisestile);
        //--------------------------------------------------------------------------------
        //Esercizio 4:
        //Scrivi un programma Java che determina il valore massimo tra due numeri utilizzando l'operatore ternario.
        int numero1 = 10;
        int numero2 = 20;
        int massimo = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("Il valore massimo tra " + numero1 + " e " + numero2 + " è: " + massimo);
        //--------------------------------------------------------------------------------
        //Esercizio 6:
        //Scrivi un programma Java che verifica se una stringa è vuota utilizzando l'operatore ternario.
        String stringa = "";
        String risultato2 = (stringa.isEmpty() ? "La stringa è vuota" : "La stringa non è vuota");
        System.out.println(risultato2);
        //--------------------------------------------------------------------------------
        //Esercizio 7:
        //Scrivi un programma Java che calcola il prezzo scontato di un prodotto in base all'importo e al
        //tasso di sconto utilizzando l'operatore ternario.
        double prezzo = 100.0;
        double sconto = 0.2; // 20% di sconto
        double prezzoScontato = (sconto > 0) ? prezzo - (prezzo * sconto) : prezzo;
        System.out.println("Il prezzo scontato è: " + prezzoScontato);
        //--------------------------------------------------------------------------------
        //Esercizio 8:
        //Scrivi un programma Java che verifica se un numero è positivo, negativo o zero utilizzando l'operatore ternario.
        int numero3 = -5;
        String riusultato3 = (numero3 > 0) ? " Positivo" : (numero3 < 0) ? "Negativo" : "Zero";
        System.out.println("Il numero " + numero3 + " è: " + riusultato3);
        //--------------------------------------------------------------------------------
        //Esercizio 9:
        //Scrivi un programma Java che determina il valore minimo tra tre numeri utilizzando l'operatore ternario.
        int numero4 = 5;
        int numero5 = 10;
        int numero6 = 3;
        int minimo = (numero4 < numero5) ? ((numero4 < numero6) ? numero4 : numero6) : ((numero5 < numero6) ? numero5 : numero6);
        System.out.println("Il valore minimo tra " + numero4 + ", " + numero5 + " e " + numero6 + " è: " + minimo);
        //--------------------------------------------------------------------------------
        //Esercizio 10:
        //Scrivi un programma Java che verifica se una persona è maggiorenne o minorenne in base
        //all'età utilizzando l'operatore ternario.
        int eta = 18;
        String maggiorenne = (eta >= 18) ? "Maggiorenne" : "Minorenne";
        System.out.println("La persona è: " + maggiorenne);
    }
}

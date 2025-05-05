package org.example;

// Scrivere un programma che, dato un certo tempo in giorni, ore, minuti e secondi,
// restituisca il numero totale di secondi.
public class TimeConverter {
    public static final int GIORNO_SEC = 86400; // Numero di secondi in un giorno
    public static final int ORA_SEC = 3600;    // Numero di secondi in un'ora
    public static final int MIN_SEC = 60;      // Numero di secondi in un minuto
    private int s, m, h, d;// secondi, minuti, ore, giorni

    // Costruttore per inizializzare giorni, ore, minuti e secondi
    public TimeConverter(int giorni, int ore, int minuti, int secondi) {
        this.d = giorni;
        this.h = ore;
        this.m = minuti;
        this.s = secondi;
    }

    // Metodo per convertire tutto in secondi
    public int convertiSecondi() {
        return (d * GIORNO_SEC) + (h * ORA_SEC) + (m * MIN_SEC) + s;// calcolo totale secondi
    }

    // Metodo principale per testare la conversione
    public static void main(String[] args) {
        TimeConverter timeConverter = new TimeConverter(1, 2, 3, 4); // 1 giorno, 2 ore, 3 minuti, 4 secondi
        int totalSeconds = timeConverter.convertiSecondi();
        System.out.println("Totale secondi " + totalSeconds + " secondi");
    }
}

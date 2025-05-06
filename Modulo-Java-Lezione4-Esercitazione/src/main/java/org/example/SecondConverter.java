package org.example;
//Scrivere un programma che, dato un certo numero di secondi restituisca il numero
//di giorni, ore, minuti e secondi.
public class SecondConverter {
    public static void main(String[] args) {
        int totalSeconds = 100000; // Esempio di input
        convertSeconds(totalSeconds);
    }

    public static void convertSeconds(int totalSeconds) {
        int secondsInMinute = 60;
        int secondsInHour = 3600;
        int secondsInDay = 86400;

        int days = totalSeconds / secondsInDay;
        totalSeconds %= secondsInDay;

        int hours = totalSeconds / secondsInHour;
        totalSeconds %= secondsInHour;

        int minutes = totalSeconds / secondsInMinute;
        totalSeconds %= secondsInMinute;

        int seconds = totalSeconds;

        System.out.println(days + " giorni, " + hours + " ore, " + minutes + " minuti, " + seconds + " secondi");
    }
}

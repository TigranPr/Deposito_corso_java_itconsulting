package org.example;
//Progettare una classe di nome Dipendente. Tale classe prevede due variabili di
//istanza una definita come nome, di tipo String e una definita come stipendio di
//tipo double. Scrivere un costruttore senza parametri, un costruttore con due
//parametri (nome e stipendio).La classe deve inoltre implementare i seguenti
//metodi. Un metodo definito come public String getNome() che restituisce il nome
//del dipendente. Un metodo definito come public double getStipendio() che
//restituisce lo stipendio del dipendente. Un metodo public void
//setStipendio(double nuovoStipendio) che modifica il valore dello stipendio. Un
//metodo public void setNome(String nuovoNome) che cambia il nome al dipendente.
//Aggiungere poi un metodo aumento(double percentuale), che incrementi lo
//stipendio del dipendente secondo una certa percentuale.
public class Dipendente {
    private String nome;
    private double stipendio;

    // Costruttore senza parametri
    public Dipendente() {
        this.nome = "";
        this.stipendio = 0.0;
    }

    // Costruttore con parametri
    public Dipendente(String nome, double stipendio) {
        this.nome = nome;
        this.stipendio = stipendio;
    }
    // Metodo per ottenere il nome del dipendente
    public String getNome() {
        return nome;
    }
    // Metodo per ottenere lo stipendio del dipendente
    public double getStipendio() {
        return stipendio;
    }
    // Metodo per modificare lo stipendio del dipendente
    public void setStipendio(double nuovoStipendio) {
        this.stipendio = nuovoStipendio;
    }
    // Metodo per modificare il nome del dipendente
    public void setNome(String nuovoNome) {
        this.nome = nuovoNome;
    }
    // Metodo per aumentare lo stipendio del dipendente secondo una certa percentuale
    public void aumento(double percentuale) {
        if (percentuale > 0) {
            stipendio += stipendio * (percentuale / 100);// Aumento dello stipendio
        } else {
            System.out.println("Percentuale non valida.");
        }
    }
    // Metodo per visualizzare le informazioni del dipendente
    public void visualizzaInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Stipendio: " + stipendio);
    }

    // Metodo main per testare la classe
    public static void main(String[] args) {
        // Creazione di un oggetto Dipendente
        Dipendente dipendente = new Dipendente("Mario Rossi", 2000.0);

        // Visualizzazione delle informazioni del dipendente
        dipendente.visualizzaInfo();

        // Modifica dello stipendio
        dipendente.setStipendio(2500.0);

        // Modifica del nome
        dipendente.setNome("Luigi Bianchi");

        // Aumento dello stipendio del 10%
        dipendente.aumento(10);

        // Visualizzazione delle informazioni aggiornate
        dipendente.visualizzaInfo();
    }
}

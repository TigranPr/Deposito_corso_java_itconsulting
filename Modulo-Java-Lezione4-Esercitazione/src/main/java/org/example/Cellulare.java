package org.example;
//Progettare una classe di nome Cellulare, per rappresentare un telefono cellulare
//con contratto a ricarica.
//Tale classe prevede due variabili d'istanza. La prima variabile d'istanza è
//definita come private double carica, e rappresenta il quantitativo di euro
//disponibile per le chiamate. La seconda variabile d'istanza è definita come
//private int numeroChiamate, e rappresenta il numero di chiamate effettuate con
//il cellulare. La classe deve implementare un costruttore public Cellulare(double
//unaCarica), che prende come parametro esplicito la quantità di euro della
//ricarica iniziale. La classe deve inoltre implementare i seguenti metodi. Un
//metodo definito come public void ricarica(double unaRicarica), che ricarica il
//telefonino. Un metodo definito come public void chiama(double minutiDurata), che
//effettua una chiamata di durata in minuti specificata dal parametro esplicito.
//Tale metodo dovrà aggiornare la carica disponibile,ed incrementare la memoria
//contenente il numero di chiamate effettuate dal telefonino. Si assuma un costo
//di 0.20 euro per ogni minuto di chiamata. Un metodo public double numero404(),
//che restituisce il valore della carica disponibile. Un metodo public int
//getNumeroChiamate(), che restituisce il valore della variabile d'istanza
//numeroChiamate. Infine, un metodo public void azzeraChiamate(), che azzera la
//variabile contenente il numero di chiamate effettuate dal telefonino.
public class Cellulare {
    private double credito;
    private int numeroChiamate;

    public Cellulare(double credita, int numeroChiamate) {
        this.credito = credita;
        this.numeroChiamate = numeroChiamate;
    }

    public void ricarica(double ricarica) {
        if (ricarica > 0) {
            credito += ricarica;
        } else {
            System.out.println("Importo di ricarica non valido.");
        }
    }

    public void chiama(double minutiDurata){
        double costoChiamata = 0.20 * minutiDurata;// fa il calcolo del costo della chiamata
        if (credito >= costoChiamata) {
            credito -= costoChiamata;
            numeroChiamate++;
        } else {
            System.out.println("Credito insufficiente per effettuare la chiamata.");
        }
    }
    public double numero404() {
        return credito;
    }
    public int getNumeroChiamate() {
        return numeroChiamate;
    }
    public void azzeraChiamate() {
        numeroChiamate = 0;
    }

    public static void main(String[] args) {
        Cellulare cellulare = new Cellulare(10.0, 0);// crea un oggetto Cellulare con 10 euro di credito e 0 chiamate
        cellulare.ricarica(5.0);// ricarica il cellulare di 5 euro
        System.out.println("Credito disponibile: " + cellulare.numero404() + " €");
        cellulare.chiama(10);// chiama per 10 minuti
        System.out.println("Credito disponibile dopo la chiamata: " + cellulare.numero404() + " €");
        System.out.println("Numero di chiamate effettuate: " + cellulare.getNumeroChiamate());
        cellulare.azzeraChiamate();// azzera il numero di chiamate
        System.out.println("Numero di chiamate dopo azzeramento: " + cellulare.getNumeroChiamate());
    }
}

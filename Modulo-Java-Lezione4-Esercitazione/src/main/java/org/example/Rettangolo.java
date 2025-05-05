package org.example;

//In questo esercizio, implementiamo una classe Rettangolo che rappresenta un rettangolo in un piano cartesiano.
// La classe deve avere i seguenti attributi:
// - altezza
// - base
// - ascissa (coordinata x del vertice in basso a sinistra)
// - ordinata (coordinata y del vertice in basso a sinistra)
// La classe deve avere i seguenti metodi:
// - un costruttore di default che inizializza base e altezza a 1 e ascissa e ordinata a 0
// - un costruttore che inizializza base, altezza, ascissa e ordinata con i valori passati come argomenti
// - i metodi get e set per tutti gli attributi
// - un metodo traslazione(int x, int y) che modifica le coordinate del rettangolo traslandolo di x unità lungo l'asse x e di y unità lungo l'asse y
// - un metodo perimetro() che calcola e restituisce il perimetro del rettangolo
// - un metodo area() che calcola e restituisce l'area del rettangolo
// - un metodo main() che crea un oggetto Rettangolo, stampa le sue proprietà, calcola e stampa il perimetro e l'area, esegue una traslazione e stampa le nuove coordinate

public class Rettangolo {
    private int altezza;
    private int base;
   private int ascissa;
    private int ordinata;

    public Rettangolo(){//questo costruttore inizializza base e altezza a 1 e ascissa e ordinata a 0
        this.base = 1;
        this.altezza = 1;
        this.ascissa = 0;
        this.ordinata = 0;
    }

    public Rettangolo(int base, int altezza, int ascissa, int ordinata) {
        this.base = base;
        this.altezza = altezza;
        this.ascissa = ascissa;
        this.ordinata = ordinata;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAscissa() {
        return ascissa;
    }

    public void setAscissa(int ascissa) {
        this.ascissa = ascissa;
    }

    public int getOrdinata() {
        return ordinata;
    }

    public void setOrdinata(int ordinata) {
        this.ordinata = ordinata;
    }
    public void traslazione(int x, int y) {
        this.ascissa += x;
        this.ordinata += y;
    }
    public int perimetro() {
        return 2 * (base + altezza);
    }
    public int area() {
        return base * altezza;
    }
    public static void main(String[] args) {
        Rettangolo r = new Rettangolo(5, 10, 0, 0);
        System.out.println("Base: " + r.getBase());
        System.out.println("Altezza: " + r.getAltezza());
        System.out.println("Ascissa: " + r.getAscissa());
        System.out.println("Ordinata: " + r.getOrdinata());
        System.out.println("Perimetro: " + r.perimetro());
        System.out.println("Area: " + r.area());

        r.traslazione(2, 3);
        System.out.println("Nuova Ascissa: " + r.getAscissa());
        System.out.println("Nuova Ordinata: " + r.getOrdinata());

    }
}


package org.example;

import java.util.Random;

//Scrivere un programma che usi la classe Random per simulare il lancio di un
//dado, visualizzando un numero casuale compreso tra 1 e 6 ogni volta che viene
//eseguito.
public class Dado {
    private int numFacce;
    private int RandomNum;

    public Dado(int numFacce) {
        this.numFacce = numFacce;
    }
    public int lanciaDado() {// questo metodo simula il lancio del dado
        Random random = new Random();
        RandomNum = random.nextInt(numFacce) + 1;
        return RandomNum;
    }
    public int getNumFacce() {
        return numFacce;
    }
    public void setNumFacce(int numFacce) {
        this.numFacce = numFacce;
    }
    public int getRandomNum() {
        return RandomNum;
    }
    public void setRandomNum(int randomNum) {
        RandomNum = randomNum;
    }
    public static void main(String[] args) {
        Dado dado = new Dado(6);
        System.out.println("Lancio del dado: " + dado.lanciaDado());
    }
}
package org.example;

public class ProvaStringhe {

    public static void main(String[] args) {
        String ciao = "Ciao";
        String pippo = "CiaoPippoSeiBrutto";
        System.out.println("lunghezza della stringa: " + ciao.length());//conta la lunghezza della stringa
        System.out.println("lunghezza della stringa: " + pippo.length());

        System.out.println("lunghezza della stringa: " + pippo.toUpperCase());//trasforma in maiuscolo
        System.out.println("lunghezza della stringa: " + pippo.toLowerCase());//trasforma in minuscolo

        System.out.println("lunghezza della stringa: " + pippo.indexOf("Brutto"));//cerca la posizione della parola "Brutto"

        String primoNome = "Mario";
        String secondoNome = "Rossi";
        String nomeCompleto = primoNome + " " + secondoNome; // concatenazione di stringhe

        String primo = "pippo ";
        String secondo = "porcello";
        System.out.println(primo.concat(secondo));// concatenazione di stringhe
        System.out.println(primo.concat(secondo).concat(secondo));// concatenazione di più stringhe

        int x = 10;
        int y = 20;
        int z =x+y;
        String risultato = "Il risultato è: " + z;
        System.out.println(risultato);// concatenazione di stringhe con variabili

        String s1 = "Buongiorno";
        String s2 = "a tutti";
        String s3 = s1.concat(" ").concat(s2);  // "Buongiorno a tutti"
        System.out.println(s3);

        String prova1= "Buongiorno";
        String prova2 = "a tutti";
        System.out.println(prova1.equals(prova2)); // false

        String buongiorno = "";
        String buongiorno2 = "Buongiorno";
        String paragone = "Buongiorno";
        System.out.println(buongiorno2.equals(paragone)); // false
        System.out.println(buongiorno.isEmpty());// controlla se la stringa è vuota

        String frase = "Ciao a tutti";
        System.out.println(frase.contains("bello")); // false
        System.out.println(frase.contains("Ciao")); // true

    }

}
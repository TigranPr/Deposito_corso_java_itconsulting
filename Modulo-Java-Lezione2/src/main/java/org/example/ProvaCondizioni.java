package org.example;

public class ProvaCondizioni {
    public static void main(String[] args) {
        String s1 = "ciao";
        String s2 = "ciao"  ;
        // Controllo solo se sono uguali nel contenuto
        if (s1.equals(s2)) {
            System.out.println("s1 e s2 hanno lo stesso contenuto!");
        }
        //----------------------------------------------------------
        String a = "Java";
        String b = "java";

        // confronto case-sensitive
        if (a.equals(b)) {
            System.out.println("a e b sono uguali (contenuto)!");
        } else {
            System.out.println("a e b NON sono uguali (contenuto diverso)!");
        }
        //-----------------------------------------------------------
        String x = "test";
        String y = "test";

        if (x == y) {
            System.out.println("x e y puntano allo STESSO oggetto (referenza)!");
        } else if (x.equals(y)) {
            System.out.println("x e y hanno lo STESSO contenuto, ma riferimenti diversi.");
        } else {
            System.out.println("x e y sono DIVERSI sia per referenza sia per contenuto.");
        }
        //-----------------------------------------------------------
        //operatore ternario, meglio usarlo nei momenti piu opportuni
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
        //-----------------------------------------------------------
    }
}

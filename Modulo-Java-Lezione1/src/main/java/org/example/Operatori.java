package org.example;

public class Operatori {
    public static void main(String[] args) {
        // Operatori di assegnazione
        int x = 10;
        x += 5;  // x = x + 5
        System.out.println("x dopo x += 5: " + x);  // Stampa 15

        int y = 10;
        y -= 5;  // y = y - 5
        System.out.println("y dopo y -= 5: " + y);  // Stampa 5

        int z = 10;
        z *= 5;  // z = z * 5
        System.out.println("z dopo z *= 5: " + z);  // Stampa 50

        int a = 10;
        a /= 5;  // a = a / 5
        System.out.println("a dopo a /= 5: " + a);  // Stampa 2

        int b = 10;
        b %= 5;  // b = b % 5
        System.out.println("b dopo b %= 5: " + b);  // Stampa 0

        // Operatori di confronto
        int A = 10;
        int B = 20;
        System.out.println("A == B: " + (A == B));  // false
        System.out.println("A != B: " + (A != B));  // true
        System.out.println("A > B: " + (A > B));   // false
        System.out.println("A < B: " + (A < B));   // true
        System.out.println("A >= B: " + (A >= B));  // false
        System.out.println("A <= B: " + (A <= B));  // true

        // Operatori logici
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("bool1 && bool2: " + (bool1 && bool2));  // false
        System.out.println("bool1 || bool2: " + (bool1 || bool2));  // true
        System.out.println("!bool1: " + !bool1);  // false
        System.out.println("!bool2: " + !bool2);  // true

    }
}

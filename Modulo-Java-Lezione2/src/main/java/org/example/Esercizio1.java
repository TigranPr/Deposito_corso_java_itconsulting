package org.example;

import java.util.Scanner;

//Andare a creare un input per nome per numero per stampare se rispetto a due variabili prefissate nome;
// admin, password 12345 gli inserimenti sono  corretti
public class Esercizio1 {
    public static void main(String[] args) {
        String nome = "admin";
        String password = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome: ");
        String inputNome = scanner.nextLine();

        System.out.print("Inserisci la password: ");
        String inputPssword = scanner.nextLine();

        if (nome.equals(inputNome ) && password.equals(inputPssword)) {
            System.out.println("Accesso consentito");
        } else {
            System.out.println("Accesso negato");
        }

        scanner.close();
    }
}

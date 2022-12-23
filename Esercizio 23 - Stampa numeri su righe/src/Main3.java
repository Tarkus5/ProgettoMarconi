/*
Implementare l’algoritmo facendo in modo che l’utente decida se
stampare i numeri pari o dispari (scelti in un range di valori e su quante colonne)
*/

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti numeri si devono generare partendo da 1?");
        int numeri = scanner.nextInt();
        System.out.println("Dopo quanti numeri creo una nuova riga?");
        int newRiga = scanner.nextInt();
        System.out.println("Stampo i numeri pari o dispari della sequenza?");
        System.out.println("P: pari");
        System.out.println("D: dispari");
        String tipoStampa = scanner.next(); //Raccolgo la scelta dell'utente
        //Genero la sequenza da 1 a numeri
        for (int i = 1; i <= numeri; i++) {

            //Stampo i pari o i dispari
            switch (tipoStampa) {
                case "P":
                    if (i % 2 == 0) { //Caso pari
                        System.out.printf("%3d", i);
                        //Creo le singole righe
                        if (i % (newRiga * 2) == 0) {
                            System.out.println();
                        }
                    }
                    break;

                case "D":
                    if (i % 2 != 0) { //Caso dispari
                        System.out.printf("%3d", i);
                    }
                    //Creo le singole righe
                    if (i % (newRiga * 2) == 0) {
                        System.out.println();

                    }
                    break;
            }
        }
    }
}


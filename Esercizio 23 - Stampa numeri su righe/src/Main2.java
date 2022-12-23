/*
Ripetere l’algoritmo impiegando la Scanner
per specificare quanti numeri stampare e quanti ne deve contenere ogni riga.
*/

import java.util.Scanner;

public class Main2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("La sequenza partirà da 1");
        System.out.println("Inserisci il limite superiore della sequenza di numeri");
        int numeri = scanner.nextInt();
        System.out.println("Dopo quanti numeri genero la nuova riga?");
        int righe = scanner.nextInt();
        int contarighe = 0;
        for (int i = 1; i <= numeri; i++) {
            System.out.printf("%3d", i);
            if (i % righe == 0) {
                System.out.println();
                contarighe++;
            }
        }
        System.out.println();
        System.out.println("Righe generate = " + contarighe);
    }
}
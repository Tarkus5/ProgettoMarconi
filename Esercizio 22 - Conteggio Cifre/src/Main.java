/*
Scrivere un programma che conti il numero di volte che una cifra appare
in un numero di 10 cifre inserito in un array.
Il programma deve creare un array di dimensione 10 che memorizzerà il conto di
ogni cifra da 0 a 9.
*/
public class Main {
    public static void main(String[] args) {
        //Creo un array con 10 possibili posizioni
        int[] elementi = new int[10];

        //Popoliamo l'array con un Math.random
        for (int i = 0; i < elementi.length; i++) {
            elementi[i] = (int) (Math.random() * 10);
        }
        //Stampo l'array
        for (int elemento : elementi) {
            System.out.print(elemento + " ");
        }
        //Conteggio dei singoli valori contenuti nell'array
        //Creiamo un altro array con valori da 0 a 9
        int[] contatore = new int[10];
        for (int i = 0; i < elementi.length; i++) {
            switch (elementi[i]) {
                case 0:
                    contatore[0]++;
                    break;
                case 1:
                    contatore[1]++;
                    break;
                case 2:
                    contatore[2]++;
                    break;
                case 3:
                    contatore[3]++;
                    break;
                case 4:
                    contatore[4]++;
                    break;
                case 5:
                    contatore[5]++;
                    break;
                case 6:
                    contatore[6]++;
                    break;
                case 7:
                    contatore[7]++;
                    break;
                case 8:
                    contatore[8]++;
                    break;
                case 9:
                    contatore[9]++;
                    break;
            }
        }
        System.out.println();
        System.out.println("Leggo quante volte compare una cifra ");
        for (int i = 0; i < contatore.length; i++) {
            System.out.println(i + " ---> " + contatore[i]);
        }
    }
}

/*
SOLUZIONE ALTERNATIVA
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraydieci [] = new int[10];
        int menoria [] = new int[10];

        System.out.println("Inserire dei numero da 0 a 9");
        for (int i = 0; i<arraydieci.length;i++) {
            arraydieci[i] =scanner.nextInt();
        }
        for (int i = 0; i<arraydieci.length;i++){
            for (int z = 0; z<arraydieci.length;z++){
                if (i==arraydieci[z]){

                    menoria [i]++;
                }
            }
        }
        for (int i = 0; i<arraydieci.length;i++) {
            System.out.println("IL numero " + i + " è uscito " + menoria[i] + " volte");
        }
    }
}

*/
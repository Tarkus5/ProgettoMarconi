/*
- Chiediamo all'utente di inserire 5 temperature (int) in un array
- Stampiamo le temperature
- Calcoliamo la media
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Tutti gli oggetti vengono inizializzati con l'operatore "new"
        Scanner inserisci = new Scanner(System.in);
        int temperature[] = new int[5];
        //Chiediamo all'utente di inserire 5 valori, ogni inserimento viene scritto nell'array
        System.out.println("Inserisci i valori richiesti");
        //Creo il ciclo per l'inserimento delle 5 temperature
        for (int i = 0; i < temperature.length; i++){
            System.out.println("Inserisci la temperatura " + (i + 1));
            temperature[i] = inserisci.nextInt();
        }
        //Stampo i risultati dell'array con il for semplificato - foreach
        System.out.print("I valori inseriti sono: ");
        for (int gradi : temperature) { //A sinistra dei : dichiariamo il tipo di variabile, a destra l'array da stampare
            System.out.print(gradi + " ");
        }
        System.out.println();
        //Calcolo la medie delle temperature
        float media = 0;
        float sommatore = 0;
        for (int i = 0; i < temperature.length; i++){
            sommatore = sommatore + temperature[i];
            media = sommatore / temperature.length;
        }
        System.out.print("La media delle temperature è " + media);
    }
}
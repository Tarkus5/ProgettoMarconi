/*
ESERCIZIO
Per accedere ad un cinema, rispetto alla tariffa piena, gli utenti ultra 70enni usufruiscono di uno sconto del 10%,
gli studenti del 15% e i disoccupati del 25%. Codificando i 70enni con una P, gli studenti con una S e i disoccupati con una D,
scrivere un programma che, richiesto il costo di un biglietto e l'eventuale condizione particolare dell'utente,
visualizzi l'importo da pagare.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capienzaCinema = 5;
        float importo = 0.00f;
        final float scontop = 10.00f;
        final float scontos = 15.00f;
        final float scontod = 25.00f;
        float totale = 0;
        do {
            System.out.println("posti disponibili: " + capienzaCinema);
            System.out.println("inserire la tua condizione:");
            System.out.println("P) = ultra 70enne");
            System.out.println("S) = studente");
            System.out.println("D) = disoccupato");
            System.out.println("A) = altro");
            String condizione = scanner.nextLine().toUpperCase();
            //System.out.println("inserisci costo del biglietto");
            float costoBiglietto = 15.00f; //scanner.nextFloat();
            switch (condizione) {
                case "P":
                    importo = costoBiglietto - (costoBiglietto * scontop) / 100;
                    System.out.println(importo);
                    break;
                case "S":
                    importo = costoBiglietto - (costoBiglietto * scontos) / 100;
                    System.out.println(importo);
                    break;
                case "D":
                    importo = costoBiglietto - (costoBiglietto * scontod) / 100;
                    System.out.println(importo);
                    break;
            }
            totale = totale + importo;
            System.out.println("Incasso parziale: " + importo);
            System.out.println("Incasso totsle: " + totale);
            capienzaCinema--;
        } while (capienzaCinema > 0);
        System.out.println("TUTTO ESAURITO");

    }
}
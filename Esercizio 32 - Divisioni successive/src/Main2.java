import java.util.Scanner;

/*
Modifica con il ciclo FOR
*/
public class Main2 {
    public static void main(String[] args) {
        //Dichiaro le variabili
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il prezzo del prodotto");
        float prezzoProdotto = scanner.nextFloat();
        System.out.println("Inserisci l'importo pagato");
        float importoPagato = scanner.nextFloat();
        float resto = importoPagato - prezzoProdotto;
        //Creo un array monete per contenere i tagli
        int[] tagli = {100, 50, 20, 10, 5, 2, 1};
        //Creo un for per passare in rassegna i valori nell'array e dare il resto
        for (int i = 0; i < tagli.length; i++) {
            int monete = (int) (resto / tagli[i]);
            resto = resto % tagli[i];
            System.out.println("Monete da " + tagli[i] + "€: " + monete);
        }
    }
}
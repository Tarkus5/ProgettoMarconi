import java.util.Scanner;

/*
Inserire il prezzo di un prodotto, inserire l'importo pagato (> prezzo prodotto)
Determina quante monete in vari tagli ci vengono restituite
*/
public class Main {
    public static void main(String[] args) {
        //Dichiaro le variabili
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il prezzo del prodotto");
        float prezzoProdotto = scanner.nextFloat();
        System.out.println("Inserisci l'importo pagato");
        float importoPagato = scanner.nextFloat();
        float resto = importoPagato - prezzoProdotto;
        //Determino il numero di banconote per il taglio di 100€
        int taglioCento = (int) (resto / 100);
        resto = resto % 100;
        System.out.println("Banconote da 100€: " + taglioCento);
        //Determino il numero di banconote per il taglio di 50€
        int taglioCinquanta = (int) (resto / 50);
        resto = resto % 50;
        System.out.println("Banconote da 50€: " + taglioCinquanta);
        //Determino il numero di banconote per il taglio di 20€
        int taglioVenti = (int) (resto / 20);
        resto = resto % 20;
        System.out.println("Banconote da 20€: " + taglioVenti);
        //Determino il numero di banconote per il taglio di 10€
        int taglioDieci = (int) (resto / 10);
        resto = resto % 10;
        System.out.println("Banconote da 10€: " + taglioDieci);
        //Determino il numero di banconote per il taglio di 5€
        int taglioCinque = (int) (resto / 5);
        resto = resto % 5;
        System.out.println("Banconote da 5€: " + taglioCinque);
        //Determino il numero di monete per il taglio di 2€
        int taglioDue = (int) (resto / 2);
        resto = resto % 2;
        System.out.println("Monete da 2€: " + taglioDue);
        //Determino il numero di monete per il taglio di 1€
        int taglioUno = (int) (resto / 1);
        resto = resto % 1;
        System.out.println("Monete da 1€: " + taglioUno);
    }
}
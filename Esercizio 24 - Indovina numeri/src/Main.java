/*
Si scriva un algoritmo per un semplice gioco che chieda di indovinare
un codice numerico di cinque cifre.
Quando l’utente scrive la risposta, il programma restituisce due valori:
il numero di cifre al posto giusto e la somma di queste cifre.
Per esempio, se il codice segreto è 53840 e l’utente ipotizza 83241,
le cifre 3 e 4 sono al posto giusto.
Il programma perciò restituirebbe in output i numeri 2 (cifre corrette) e 7
(somma). Si permetta all’utente di provare per un numero prefissato di volte.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creo i 2 array (numeri casuali + numeri miei)
        int[] numeroFortunato = new int[5];
        int[] myNumbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        //Popolo gli array (random)
        for (int i = 0; i < numeroFortunato.length; i++) {
            numeroFortunato[i] = (int) (Math.random() * 9) + 1;
        }
        /*Stampa di servizio per vedere la popolazione dell'array --DA TOGLIERE--
        for (int numero : numeroFortunato) {
            System.out.print(numero + " ");
        }*/
        System.out.println();
        //Popolo l'array my numbers
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Inserisci il " + (i + 1) + "° numero");
            myNumbers[i] = scanner.nextInt();
        }
        //Confronto tra i due array
        int contatore = 0; //Conta quanti numeri sono in corrispondenza
        int somma = 0; //Somma i numeri individuati correttamente
        final int MAXTENTATIVI = 2; //Massimo 3 tentativi
        int numeroTentativi = 0;
        do {
            ++numeroTentativi;
            if (numeroTentativi > 2){
                System.exit(0);
            }
            for (int i = 0; i < myNumbers.length; i++) {
                if (myNumbers[i] == numeroFortunato[i]) {
                    contatore++;
                    somma = somma + myNumbers[i];
                }
            }
            //Stampa della composizione dell'array con i numeri dell'utente
            System.out.println("Hai inserito i seguenti numeri: ");
            for (int mioNumero : myNumbers) {
                System.out.print(mioNumero + " ");
            }
            //Informo l'utente della situazione
            System.out.println("Hai indovinato " + contatore + " numeri");
            System.out.println("La somma dei numeri indovinati è " + somma);
            //Controllo se tutti i numeri sono in corrispondenza
            if (contatore >= 5) {
                System.out.println("Complimenti, hai vinto!");
            }
            //Altrimenti ripeti l'inserimento dei numeri
            else {
                contatore = 0;
                somma = 0;
                for (int i = 0; i < myNumbers.length; i++) {
                    System.out.println("Inserisci il " + (i + 1) + "° numero");
                    myNumbers[i] = scanner.nextInt();
                }
            }
        }
        while (contatore <= 4 || numeroTentativi < MAXTENTATIVI);
    }
}
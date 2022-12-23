/*
Si scriva un programma che dimostri la conversione di tipo per valori double, effettuando le seguenti attività.

Inseriamo nel flusso del programma un numero in virgola mobile x.
Convertire x in un valore intero e memorizzare il risultato in y.
Visualizzare in maniera distinta x e y.
Convertire x in un valore di tipo byte e memorizzare il risultato in z.
Visualizzare in maniera distinta x e z.
 */

public class Main {

    public static void main(String[] args) {
        double x = 10.50; //inserito x nel flusso
        int y = (int) x; //convertito x in valore intero
        System.out.println("Il valore di x è\t" + x); //stampa a video di x
        System.out.println("Il valore di y è\t" + y); //stampa a video di y

        byte z = (byte) x; //convertito x in byte
        System.out.println("Il valore di x è\t" + x); //stampa a video di x
        System.out.println("Il valore di z è\t" + z); //stampa a video di z

    }
}
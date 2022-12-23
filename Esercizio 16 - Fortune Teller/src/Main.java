/*
Scrivere un programma che generi un numero casuale e lo associ
ad una delle seguenti risposte: (è possibile eventualmente inserirne altre)
- Giornata fortunata
- Potrebbe andare meglio
- I prossimi giorni saranno migliori
- Oggi è un giorno eccezionale
*/

public class Main {
    public static void main(String[] args){
        //Inizializzo la variabile del numero casuale
        int numeriGenerati[] = new int[10];
        //Inizializzo le stringhe delle risposte
        String rispostaUno = "Giornata fortunata";
        String rispostaDue = "Potrebbe andare meglio";
        String rispostaTre = "I prossimi giorni saranno migliori";
        String rispostaQuattro = "Oggi è un giorno eccezionale";
        String rispostaCinque = "Oggi la Luna non è dalla tua";
        //Creo il ciclo FOR per andare ad estrarre il numero casuale
        for(int i = 0; i < 1; i++){
            numeriGenerati[i] = (int) (Math.random() * 51);
            System.out.print("Numero estratto " + numeriGenerati[i]);
            //Creo il ciclo IF-ELSE per assegnare le risposte
            if (numeriGenerati[i] <= 10){
                System.out.print(" - " + rispostaUno);
            }
            else if (numeriGenerati[i] > 10 && numeriGenerati[i] <= 20) {
                System.out.print(" - " + rispostaDue);
            }
            else if (numeriGenerati[i] > 20 && numeriGenerati[i] <= 30){
                System.out.print(" - " + rispostaTre);
            }
            else if (numeriGenerati[i] > 30 && numeriGenerati[i] <= 40){
                System.out.print(" - " + rispostaQuattro);
            }
            else{
                System.out.print(" - " + rispostaCinque);
            }
        }
    }
}
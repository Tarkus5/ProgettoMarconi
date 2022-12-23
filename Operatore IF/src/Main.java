public class Main {
    public static void main(String[] args) {
        //Struttura di selezione - IF, ELSE/IF
        //Dichiaro tutte le variabili in gioco PRIMA di entrare nell'IF, in modo da dover variare solo queste invece che tutto il codice
        float saldo = 1500.35f;
        float interessi = 0;
        float tassoBase = 2.5f;
        float penale = 100;
        //Eseguiamo il calcolo degli interesssi solo se il saldo è positivo
        if (saldo>0 && saldo<=1000){
            interessi = saldo * tassoBase / 100; //La variabile "interessi" viene visualizzata ed utilizzata solo dentro il ciclo IF
            saldo = saldo + interessi;
        }
        //Inseriamo il caso else if se il saldo è maggiore di 1000
        else if (saldo>=1000) {
            interessi = saldo * (tassoBase + 1) / 100;
            saldo = saldo + interessi;
        }
        //Il codice riprende da qui dopo l'IF

        //condizione alternativa al ramo IF nel caso in cui l'istruzione di controllo fosse falsa
        else {
            System.out.println("Il tuo conto è negativo. Penale da calcolare");
            saldo = saldo - penale;
        }
        System.out.println("Il totale sul conto è " + saldo);
        if (interessi>0)
            System.out.println("Interessi maturati " + interessi);

    }
}
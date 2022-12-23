import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) {

        //ASSEGNAMENTO SEMPLICE - scrive nell'area di memoria della variabile "a" il valore "10"
        int a = 10;

        //UGUAGLIANZA
        int b = 10;
        int c = 10;
        //b=c; assegnamento semplice, sto dando a "c" il valore di "d"
        boolean confronto = (b==c); //operatore di uguaglianza - risultato "true" o "false", dato dalla variabile booleana che restituisce solo questi risultati
        System.out.println("Il risultato del confronto è " + confronto);

        //ARITMETICI (+, -, *, /, %)
        char lettera1 = 50;
        char lettera2 = 70;
        int sommaChar = lettera1 + lettera2; //dobbiamo mettere int perché non si possono fare le somme tra byte, char, short
        System.out.println(sommaChar);
        //operatore modulo (%) - resto della divisione
        int variabileA = 100;
        int variabileB = 30;
        int restoDivisione = variabileA%variabileB;
        System.out.println("iIl resto della divisione è " + restoDivisione);

        //UNARI + e -, hanno a funzione di cambiare segno di un'espressione
        int fattore1 = -10;
        int fattore2 = -20;
        int cambioSegno = -fattore1;
        int operazioneConCambioSegno = fattore1 + -fattore2;
        System.out.println("Il risultato del cambio segno è " + cambioSegno);
        System.out.println("Il risultato dell'espressione è " + operazioneConCambioSegno);

        //UNARI post incremento
        int variabilePartenza = 1; //voglio che la variabile diventi 2
        System.out.println("Prima la variabile post incremento valeva " + variabilePartenza++);
        System.out.println("Ora la variabile post incremento vale " + variabilePartenza++);

        //UNARI pre incremento
        int variabileIncremento = 1;
        System.out.println("Prima la variabile pre incremento vale " + variabileIncremento);
        System.out.println("Ora la variabile pre incremento vale " + ++variabileIncremento);

        // RELAZIONALI - ritornano come risultato true/false
        int operando1 = 50;
        int operando2 = 100;
        boolean risultato1 = operando1>operando2; //operando 1 è maggiore di operando2?
        boolean risultato2 = operando1==operando2; //operando 1 è uguale di operando2?
        boolean risultato3 = operando1<operando2; //operando 1 è minore di operando2?
        boolean risultato4 = operando1>=operando2; //operando 1 è maggiore o uguale di operando2?
        boolean risultato5 = operando1<=operando2; //operando 1 è minore o uguale di operando2?
        boolean risultato6 = operando1!=operando2; //operando 1 è diverso di operando2?


        //TERNARIO - valorizza la variabile di uscita in base all'esito del confronto
        String risposta1;
        risposta1 = (risultato1) ? "maggiore" : "minore";
        System.out.println("L'operando1 è " + risposta1 + " dell'operando2");

        //LOGICI - simboli: ! (not), && (and), || (or)
        //Immaginiamo di consentire la guida di un'auto se l'età è > 18 anni e cilindrata < 1500cc
        int eta = 18, cilidrata = 1700;
        //primo caso: posso guidare l'auto se ho + di 18 anni e l'auto ha cilindrata inferiore a 1500cc
        boolean canDrive = (eta >= 18 && cilidrata <= 1500); //false perchè cilindrata >
        String response ;
        response = (canDrive) ? "puoi guidare" : "non puoi guidare";
        System.out.println("In base ai dati " + response);
        //Se avessimo messo OR (||) ci restituiva il "puoi guidare", perché almeno una delle due è vera
        boolean canDriveOr = (eta >= 18 || cilidrata <= 1500);
        String response2;
        response2 = (canDriveOr) ? "puoi guidare" : "non puoi guidare";
        System.out.println("In base ai dati " + response2);
        //Il caso dell'operatore NOT (!) - inverte il risultato della valutazione
        int etaMarito = 16;
        boolean autorizza = etaMarito >= 18;
        System.out.println("Ti puoi sposare " + !autorizza); //avendo messo il "!" abbiamo ribaltato il valore, da false a true
        System.out.println("Ti puoi sposare " + autorizza); //vero valore del confronto, quindi false


    }
}
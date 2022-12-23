public class Main {

    //per abbreviare il public static void main, usa "psvm"
    public static void main(String[] args) {

        // per abbreviare la stampa a video, usa "sout"
        System.out.println("Hello world!");

        int valore = 10;
        System.out.println(valore); //stampa 10
        System.out.println("valore"); //stampa "valore" tipo stringa

        //nascita di una variabile, dichiarazione + assegnazione
        int eta = 50; //assegno il valore diretto, dichiarazione unica
        int peso = 100 , altezza = 150; //doppia dichiarazione su stessa riga

        //dichiarazioni multiple
        int spesa, resto, prezzoUnitario;
        prezzoUnitario = 50;
        spesa = prezzoUnitario * 10;
        resto = 1300-spesa;
        //stampa di valori
        System.out.println(spesa);
        System.out.println(resto);

        //stampa di stringhe
        System.out.println("La tua spesa è di " + spesa + "€"); //l'operatore "+" concatena due variabili

        //tipi di dati decimali --float e double
        float prezzo = 14.74F; //per utilizzarla, devo mettere la "F" finale
        double quantita = 10.41; //non serve la "F"

        //conversione dei tipi
        //conversione implicita fatta dal compilatore
        int variabilePiccola = 54141;
        long variabileGrande = variabilePiccola;

        byte a = 50;
        int i = a; //in caso di copia di una variabile in un'altra il cambi della seconda non altera la prima
        i = 80; //cambia il valore di "i", ma non di "a"

        // conversioni impossibili in modo naturale
        /* int valoreUnicodeA = 65;
        char letteraA = valoreUnicodeA;

        double valoreX = 154.0741;
        float f = valoreX; */

        //conversione esplicita fatta da noi, tramite cast
        double distanza = 9.0;
        int punteggio = (int) distanza; //passando sulla riga, forzo il cast premendo su "cast expression to ..." oppure premo alt+maiusc+invio

        //conversione decimali
        double prezzoLibro = 9.99;
        int pagato = (int) prezzoLibro;
        System.out.println("Il prezzo pagato è " + pagato);
        System.out.println("E il tuo resto è " + (prezzoLibro - pagato));

        //conversione con perdita di dati
        int v = 250;
        double e = 325.741;
        byte bt;
        bt = (byte) v;
        System.out.println("Stampo il valore della variabile bt che in partenza era " + v + " Ora vale dopo il cast " + bt);
        //Restituisce -6 perché si vanno a perdere i bit non significativi per il tipo da castare partendo da sinistra

        bt = (byte) e;
        System.out.println("Stampo il valore della variabile bt che in partenza era " + e + " Ora vale dopo il cast " + bt);

        //conversione dei char
        char simbolo = '9';
        System.out.println((int)simbolo); //ottengo dal cast la conversione in valore UNICODE

        //promozione degli operatori
        /*
        Caso A: se uno degli operandi è di tipo double l'altro verrà convertito nel tipo double
        Caso B: se uno degli operandi è di tipo float l'altro verrà convertito nel tipo float
        Caso C: se uno dei due operandi è di tipo long, l'altro verrà convertito nel tipo long
        Caso D: entrambi gli operandi saranno convertiti nel tipo int
        */

        //caso A
        double operando2 = 10.50;
        int operando1 = 502; //convertito in double
        double operazione = operando1 * operando2;

        //caso B
        float operando3 = 41.52f;
        int operando4 = 10; //convertito in float
        float operazione2 = (operando3 * operando4);

        //caso C
        long operando5 = 85;
        int operando6 = 90; //convertito in long
        long operazione3 = operando5 * operando6;

        //caso D
        byte operando7 = 10; //convertito in int
        byte operando8 = 10; //convertito in int
        int operazione4 = operando7 * operando8;

        System.out.println("Stampo operazione4\t" + operazione4);

        //uso delle costanti -- sono immodificabili dopo l'inizializzazione con l'uso di "final"
        final int CODICE = 12541;
        // codice = 4141; --- non posso farlo perché è immodificabile

        //dichiarazione successiva
        final int CODICESEGRETO;
        CODICESEGRETO = CODICE * 2;


    }
}
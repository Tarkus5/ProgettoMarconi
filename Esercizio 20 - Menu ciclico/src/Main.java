import java.util.Scanner;

/*
Creare un menù con scelte cicliche
*/
public class Main {
    public static void main(String[] args) {
        //Inizializzo lo scanner e la variabile di scelta
        Scanner scanner = new Scanner(System.in);
        int scelta = 0;
        int voti[] = null;
        //Eseguo il ciclo per selezionare la voce del menù
        do {
            System.out.println("********************");
            System.out.println("Effettua una selezione");
            System.out.println("1] Inserisci i voti degli esami");
            System.out.println("2] Stampa i voti inseriti");
            System.out.println("3] Determina il voto più alto");
            System.out.println("4] Calcola la media");
            System.out.println("5] Esci dal programma");
            scelta = scanner.nextInt();


            //Recupero la scelta effettuata dall'utente e procedo con il programma
            switch (scelta) {
                case 1: //Codice che inserisce in array i voti degli esami
                    System.out.println("Quanti voti vuoi inserire?");
                    int dimensione;
                    dimensione = scanner.nextInt();
                    voti = new int[dimensione];
                    System.out.println("Inserisci i tuoi " + dimensione + " voti");
                    for (int i = 0; i < voti.length; i++) {
                        voti[i] = scanner.nextInt();
                    }
                    break;
                case 2: //Codice che stampa i voti inseriti nell'array con indice progressivo
                    for (int i = 0; i < voti.length; i++){
                        System.out.println("Voto n° " + (i + 1) + " = " + voti[i]);
                    }
                    break;
                case 3: //Codice che determina il voto più alto
                case 4: //Codice che calcola la media
                case 5: //Uscita dal programma
                    System.exit(0);
            }
        }
        while (scelta > 0 && scelta <= 5);
    }
}
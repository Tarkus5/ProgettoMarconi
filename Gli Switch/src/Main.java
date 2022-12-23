//Andiamo ad inserire i mesi dell'anno

public class Main {
    public static void main(String[] args) {

        System.out.println("In che mese siamo?");
        /* Inseriamo una variabile INTERA che identifica il mese
        e OTTENIAMO LA STAMPA IN STRINGA DEL CORRISPONDENTE MESE
         */
        int mese = 0; //Variabile per il mese da 1 a 12, impostiamo partenza a 0
        String meseCorrente = "inesistente"; //essendo un oggetto, possiamo assegnare un valore nullo con "null"
        mese = 10; //Inseriamo il valore della variabile
        switch (mese){
            //Gestisco le situazioni con i "case" che posso accorpare, mettendo i primi vuoti e mettendo la variabile solo nell'ultimo prima del break
            case 1: meseCorrente = "Gennaio";
            break;
            case 2: meseCorrente = "Febbraio";
            break;
            case 3: meseCorrente = "Marzo";
            break;
            case 4: meseCorrente = "Aprile";
            break;
            case 5: meseCorrente = "Maggio";
            break;
            case 6: meseCorrente = "Giugno";
            break;
            case 7: meseCorrente = "Luglio";
            break;
            case 8: meseCorrente = "Agosto";
            break;
            case 9: meseCorrente = "Settembre";
            break;
            case 10: meseCorrente = "Ottobre";
            break;
            case 11: meseCorrente = "Novembre";
            break;
            case 12: meseCorrente = "Dicembre";
        } //Il programma riprende da qui

        System.out.println("Il mese selezionato è " + meseCorrente);

    }
}
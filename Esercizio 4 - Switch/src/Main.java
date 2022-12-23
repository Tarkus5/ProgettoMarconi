//Definire i mesi dell'anno e le stagioni corrispondenti

public class Main {
    public static void main(String[] args) {

        int mese = 0;
        int stagione = 0;
        String meseCorrente = "inesistente";
        String stagioneCorrente = "inesistente";
        mese = 10;

        switch (mese) {
            case 1:
                meseCorrente = "Gennaio";
                break;
            case 2:
                meseCorrente = "Febbraio";
                break;
            case 3:
                meseCorrente = "Marzo";
                break;
            case 4:
                meseCorrente = "Aprile";
                break;
            case 5:
                meseCorrente = "Maggio";
                break;
            case 6:
                meseCorrente = "Giugno";
                break;
            case 7:
                meseCorrente = "Luglio";
                break;
            case 8:
                meseCorrente = "Agosto";
                break;
            case 9:
                meseCorrente = "Settembre";
                break;
            case 10:
                meseCorrente = "Ottobre";
                break;
            case 11:
                meseCorrente = "Novembre";
                break;
            case 12:
                meseCorrente = "Dicembre";
        }


        /*
        stagione = 8;
            switch (stagione){
                case 1:
                case 2:
                case 3:
                case 12: stagioneCorrente = "Inverno";
                break;
                case 4:
                case 5:
                case 6: stagioneCorrente = "Primavera";
                break;
                case 7:
                case 8:
                case 9: stagioneCorrente = "Estate";
                break;
                case 10:
                case 11: stagioneCorrente = "Autunno";
            }
*/


        //POSSIAMO FARE LO STESSO CON GLI IF E GLI ELSE
            if (mese>=1 && mese <=3 || mese == 12){
            stagioneCorrente = "Inverno";
            }
            else if (mese>=4 && mese <=6){
            stagioneCorrente = "Primavera";
            }
            else if (mese>=7 && mese<=9){
            stagioneCorrente = "Estate";
            }
            else if (mese>=10 && mese<=11){
                stagioneCorrente = "Autunno";
            }


        System.out.println("Il mese selezionato è " + meseCorrente + ". Mentre la stagione è " + stagioneCorrente);
    }
}
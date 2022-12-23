//L'indice di massa corporea IMC
//IMC = massa/altezza x altezza
//sottopeso : se IMC < 18.5
//normale se IMC >= 18.5 e IMC <25
//sovrappeso se IMC >=25 e IMC <= 30
//problemi se IMC > 30

public class Main {
    public static void main(String[] args) {
        //Inserisco le variabili
        int massa;
        float altezza;
        float indiceMassaCorporea = 0;
        String risposta;
        //Inizializzo le variabili
        massa = 79;
        altezza = 1.78f;
        indiceMassaCorporea = massa / (altezza * altezza);

        //Prima ipotesi
        if (indiceMassaCorporea < 18.5){
            risposta = "Risulti essere SOTTOPESO";
        }

        //Seconda ipotesi
        else if (indiceMassaCorporea>=18.5 && indiceMassaCorporea<25) {
            risposta ="Risulti essere NORMOPESO";
        }

        //Terza ipotesi
        else if (indiceMassaCorporea>=25 && indiceMassaCorporea<=30) {
            risposta = "Risulti essere SOVRAPPESO";
        }

        //Quarta ipotesi
        else {
            risposta = "Risulti essere OBESO";
        }

        //Il programma riprende da qui
        System.out.println("Report situazione ICM");
        System.out.println("Il valore del tuo IMC è: " + indiceMassaCorporea);
        System.out.println("La tua condizione è: " + risposta);
    }
}
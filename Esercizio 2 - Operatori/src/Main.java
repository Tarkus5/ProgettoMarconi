/*
Ipotizziamo di dover ammettere in un locale delle persone che per poter accedere devono
rispettare le seguenti caratteristiche:
Età 1>= 18;
Età 2>= 18;
devono essere in coppia;
devono accedere al locale per la prima volta.
*/

public class Main {
    public static void main(String[] args) {

        int etaA = 18, etaB = 25; //dichiaro e inizializzo le due variabili
        boolean coppia = true; //ipotizzo che sono in coppia
        boolean primaVolta = true; //ipotizzo che è la prima volta che vengono
        boolean canEnter = (etaA>= 18 && etaB >= 18 && coppia == true && primaVolta == true); //impongo le condizioni per poter autorizzare l'ingresso
        String risposta ;
        risposta = (canEnter) ? "potete entrare " : "non potete entrare";
        System.out.println("In base ai dati " + risposta);

    }
}
/* Si supponga di partecipare a una festa, per socializzare si stringono le mani a tutti i partecipanti.
Si scriva un frammento di codice usando un’istruzione for che calcoli il numero totale di strette di mano.
 */

public class Main {
    public static void main(String[] args) {
        // Variabile che indica il numero di persone
        int personePresenti = 8; // Noi compresi

        // Contiamo le strette di mano
        int stretteMano = 0;

        // Ciclo FOR che conta quante strette di mano abbiamo fatto
        for (int persone = 1; persone <= personePresenti; persone++) {
            stretteMano = (persone - 1);
        }
        System.out.println("Alla festa ho stretto le mani a " + stretteMano + " persone");

    }
}
public class Main {
    public static void main(String[] args) {
        //Creiamo una stringa
        String saluti = "Bella pe' te"; //Più semplice ed ottimale
        String saluti2 = "Bella pe' te";
        String avviso = new String("Avviso chiusura");//Dichiarazione come oggetto
        String avviso2 = new String("Avviso chiusura");
        //Confronto tra stringhe con "=="
        System.out.println(avviso == avviso2); //Ritorna false perché indirizzi di memoria diversi
        System.out.println(saluti == saluti2); //Ritorna true perché valori uguali
        //Confronto tra stringhe con "compareTo()" - ritorna un numero dalla tabella ASCII - distanza tra le lettere diverse
        int confronto = avviso.compareTo(avviso2);
        System.out.println(confronto);
        //Confronto tra stringhe con "equalsTo() - ritorna true/false
        boolean flag = avviso.equals(avviso2);
        System.out.println(flag);
        //Iterare uan stringa con indici che partono da 0
        for (int i = 0; i < avviso.length(); i++) {
            System.out.println(" Indice " + i + " ---> " + avviso.charAt(i));
        }
        //trim() elimina gli spazi iniziali e finali di una striga
        String password = " qwerty";
        if (password.trim().equals("qwerty")) {
            System.out.println("Accedi");
        } else {
            System.out.println("Password errata");
        }
        //Inserire stringhe in array
        String orario = "Orario corrente: 12-44-56";
        char singoliCaratteri[] = orario.toCharArray();
        for (char carattere : singoliCaratteri) {
            System.out.print(carattere + " ");
        }
        System.out.println();
        //Sezionare una stringa in base ad un carattere di controllo
        String[] splittato = orario.split("-");
        for (String split : splittato) {
            System.out.print(split + " ");
        }

    }
}
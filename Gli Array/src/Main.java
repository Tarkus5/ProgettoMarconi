public class Main {
    public static void main(String[] args) {
        System.out.println("Array");
        /*
        Gli array sono sempre delle variabili che hanno un nome ma, al loro interno
        hanno più valori che possono essere recuperati grazie agli indici.
        */
        String giorniSettimana; //Può contenere solo un valore, scritto così

        //Metodo 1
        String giorniSettimanaDue[]; //Scrittura per gli array, può contenere solo stringhe
        giorniSettimanaDue = new String[7]; //Inizializzazione degli array, dentro le quadre puoi mettere anche variabili int, byte, short già inizializzate
        int numeroElementi = giorniSettimanaDue.length; //Ritorna la dimensione dell'array
        System.out.println("L'array contiene " + numeroElementi + " elementi");

        //Metodo 2
        //Possiamo dichiarare e inizializzare l'array in una sola istruzione
        int[] numeriPari = new int[5]; //Quando inizializziamo l'array, i valori vengono definiti di default in base al tipo
        //int recuperoNumero = numeriPari[1]; //Operazione di lettura indici
        //System.out.println("Recupero il valore di indice 1: " + recuperoNumero);
        //Per assegnare un valore all'indice 1:
        numeriPari[1] = 41;
        int recuperoNumero = numeriPari[1]; //Operazione di lettura indici
        System.out.println("Recupero il valore di indice 1: " + recuperoNumero);

        //Metodo 3
        int numeriDispari[] = {5, 7, 9, 11, 13, 15}; //In questo modo mi fa la scrittura int numeriDispari[] = new int [4]. In questo modo non possiamo ampliare l'array, possiamo solo modificare i valori
        numeriDispari[0] = 17; //Cambio il valore da 5 (indice 0) a 7

        //Uso del ciclo (FOR) per iterare gli elementi dell'array
        for (int i = 0; i < numeriDispari.length; i++){ //Con il length non ci dobbiamo ricordare il numero di valori, li legge in automatico
            System.out.print(numeriDispari[i] + ", ");
        }//Fine dell'array
    }
}
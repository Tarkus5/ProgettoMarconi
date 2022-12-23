public class Main {
    public static void main(String[] args) {
        System.out.println("Classi Wrapper in Java");
        /*
        Lo scopo di queste classi è quello di trattare i tipi primitivi come oggetti.
        Tipi primitivi ----> Wrapper
        byte ----> Byte
        short ----> Short
        int ----> Integer
        long ----> Long
        double ----> Double
        float ----> Float
        char ----> Character
        boolean ----> Boolean
        */
        //Come creare un oggetto da queste classi
        Integer numero = 50; //Creato oggetto "numero" con valore 50
        Float f = 50.50f;
        int mioNumero = numero; //Posso usare l'oggetto in una variabile primitiva
        //Gli oggetti creati in questo modo hanno il compito di acquisire i valori numerici da un formato stringa
        String numeroFortunato = "10";
        int numeroConvertito = Integer.parseInt(numeroFortunato.trim()); //.parseInt metodo per convertire la stringa in tipo primitivo numerico .trim ignora gli spazi
        System.out.println(numeroConvertito * numeroConvertito);
        //Funziona uguale con i decimali
        String peso = "10.50";
        float pesoMerce = Float.parseFloat(peso.trim());
        System.out.println("Il peso della merce è " + pesoMerce + "kg");
        //Trasformo un numero in stringa
        int a = 150;
        String numeroInStringa = String.valueOf(a); //.valueOf trasforma il numero in stringa
        //La classe Character
        //Metodo isLetter (carattere) ---> true se il carattere è una lettera
        //Metodo isDigit (carattere) ---> true se il carattere è una cifra
        char carattereA = 'a';
        char cifraA = '1';
        //Controllo se il carattere in "carattereA" è una cifra o una lettera
        boolean controllo = Character.isLetter(carattereA);
        boolean controlloDue = Character.isDigit(cifraA);
        System.out.println(controllo);
        System.out.println(controlloDue);
        //Usiamo la linea di comando
        String numero1 = args[0];
        System.out.println("Il numero passato da riga di comando è " + numero1);
        int numeroDaEsterno = Integer.parseInt(numero1);
        System.out.println("Il doppio del numero inserito è: " + (numeroDaEsterno * 2));
    }
}
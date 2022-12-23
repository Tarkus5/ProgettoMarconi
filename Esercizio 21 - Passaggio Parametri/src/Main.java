public class Main {
    public static void main(String[] args) { //args è nome standard
        //Uso di [] args crea un array chiamato "args" scrivibile da riga di comando
        // String [] args ---> Posso leggere e scrivere su questo array

        String carattere1 = args[0];
        String carattere2 = args[1];
        System.out.println(carattere1 + " " + carattere2);

        //Compilazione del programma Java ---> javac nomeprogramma.java ---> javac Main.java
        //Una volta compilato crea un file .class (contiene il codice che la macchina virtuale interpreta)
        //Dopo la lettura, la JVM trasforma il .class in un eseguibile
    }
}
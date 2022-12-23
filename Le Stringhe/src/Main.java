public class Main {
    public static void main(String[] args) {
        //Classe String - creazione delle stringhe - metodo 1
        String stringaUno = "Oggi è mercoledì"; //Crea un hashcode
        //Creazione delle stringhe - metodo 2 (oggetto)
        String stringaDue = new String("Buona giornata");
        //Se scrivo una stringa uguale, ci abbina direttamente a quella creata in precedenza
        String stringaTre = "Oggi è mercoledì";
        System.out.println(stringaUno);
        System.out.println(stringaDue);
        //È preferibile creare le stringhe con la sintassi del metodo 1

        //Uso dell'operatore "new" per costruire una stringa
        String s1 = new String(); //Stringa vuota

        //Stringa con valori contenuti in array
        char[] vocali = {'a', 'e', 'i', 'o', 'u'}; //Possiamo passare array byte, char, in
        String s2 = new String(vocali);
        System.out.println(s2);

        //Recupero del valore dell'indice delle stringhe con i metodi

        //Metodo 1: conta dei caratteri - .lenght()
        String s3 = "Sequenza di caratteri";
        System.out.println("Nella stringa ci sono " + s3.length() + " caratteri");

        //Metodo 2: verificare l'inserimento del valore
        String s4 = "";
        System.out.println(s4.isEmpty()); //Restituisce valore booleano per vedere se la stringa è vuota (true) oppure è stato inserito qualcosa (false)

        //Metodo 3: ritorna il carattere all'indice specificato
        System.out.println(s3.charAt(0)); //Ritorna la "s" perché indice = 0

        //Metodo 4: confronto della substringa di partenza di una stringa
        String nome = "Filippo"; //Verifichiamo se la stringa parte con una sequenza di caratteri specificati nel parametro (es. se parte con "Fi")
        boolean ritorno = nome.startsWith("Fi"); //True se inizia con "Fi", false se parte con altre sequenze
        System.out.println(ritorno);
        boolean fine = nome.endsWith("ppo"); //True se finisce con "ppo", false se finisce con altre sequenze
        System.out.println(fine);

        //Metodo 5: trasforma la stringa in maiuscolo, ma non modifica il valoredi partenza
        String avviso = "Oggi siamo aperti";
        System.out.println(avviso.toUpperCase());
        String chiusura = "Siamo chiusi dalle 20".toUpperCase(); //Metto il maiuscolo direttamente nella variabile
        System.out.println(chiusura);

        //Metodo 6: trasforma la stringa in minuscolo
        String avvisoPericolo = "ATTENZIONE".toLowerCase();
        System.out.println(avvisoPericolo);

        //Confronto tra stringhe - non va fatto sul contenuto degli oggetti ma tra gi indirizzi di memoria che lo contengono

        //Operatore di confronto "=="
        String stringaA = new String("Stringa A");
        String stringaB = new String("Stringa A");
        System.out.println(stringaA == stringaB); //Ritorno true o false
        //Esce false perché sono su due spazi di memoria diversa, anche se il contenuto è identico
        String stringaC = "Stringa C";
        String stringaD = "Stringa C";
        System.out.println(stringaC == stringaD);
        //Restituisce true perché, in questo caso, valuta il contenuto

        //Per un confronto più preciso, conviene usare "equals()" o "compareTO()"
        //Equals() ritorna true o false
        String nomeA = "Mario";
        String nomeB = "Maria";
        boolean confronto = nomeA.equals(nomeB); //False perché cambia l'ultima lettera
        System.out.println(confronto);

        //CompareTO() - ritorna valori numerici invece che "true" o "false"
        //I valori numerici corrispondo alla distanza tra le lettere dell'UNICODE
        int confrontoDue = nomeA.compareTo(nomeB);
        System.out.println("La distanza tra le due lettere è di " + confrontoDue + " caratteri");
        //Per ignorare le maiuscole, usa .compareToIgnoreCase()
        //Per ignorare SOLO gli spazi iniziali o finali usa .trim()
        //I metodi si possono concatenare (es. nomeA.trim.compareToIgnoreCase(nomeB))

        //Metodo Split() - Taglia il contenuto della stringa in base ad un determinato carattere di separazione e mette tutto in un array
        String giorno = "21-dicembre-2022";
        String[] splittati = giorno.split("-"); //Taglia il "-"
        System.out.println("stampo l'array \"splittati\" ");
        for (String iterati : splittati) {
            System.out.print(iterati + " ");
        }
        //il metodo .toString stampa il contenuto delle proprietà di un oggetto (non ha effetto sugli array)
        System.out.println();
        //Metodo indexOf() - ci ritorna l'indice corrispondente al carattere specificato
        String indice = "ABCDEFG";
        int carattere = indice.indexOf("D"); //Se non trova corrispondenza inserisce come risultato "-1"
        System.out.println(carattere);

        //Metodo concat() - concatena due stringhe, ha la stessa funziona dell'operatore "+"
        String unisco = "ABC";
        String altraStringa = "DEF";
        String concatenata = unisco.concat(altraStringa); //Puoi andare direttamente di stampa senza dichiarare la nuova stringa
        System.out.println(concatenata);

        //Metodo replace() - sostituisce le occorrenze di una lettera con un'altra specificata
        String sostituita = unisco.replace("C", "Z");
        System.out.println(sostituita);

        //Metodo toCharArray() - simile allo split, travasa il contenuto di una stringa in un array di caratteri o stringhe
        String alfabeto = "ABCDEFGHILMNOPQRSTUVZ";
        char[] lettereAlfabeto = alfabeto.toCharArray();
        for (char singolaLettera:lettereAlfabeto) {
            System.out.print(singolaLettera + " ");
        }
        System.out.println();

        //Metodo contains() - verifica se nella stringa è contenuta una certa sequenza di caratteri (true se sì)
        String password = "pippo741"; //Voglio controllare se la sequenza contiene "ppo"
        boolean sequenza = password.contains("ppo");
        System.out.println(sequenza);
    }
}
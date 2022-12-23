public class Main {
    public static void main(String[] args) {
        //Creo un array di interi
        int[] numeri = {7, 10, 50, 14, 7, 9};

        //Ciclo l'array
        for (int i = 0; i < numeri.length; i++){
            int numeroRecuperato = numeri[i];
            //Per ogni elemento dell'array verifico se è pari
            if (numeroRecuperato%2 == 0){
                //Se è pari lo stampo
                System.out.println("Il numero " + numeroRecuperato + " è pari");
            }
        }
    }
}
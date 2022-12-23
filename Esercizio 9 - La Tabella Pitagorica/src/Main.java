public class Main {
    public static void main(String[] args) {
        //Ciclo esterno
        for (int i = 1; i < 11; i++) {
            //Ciclo interno
            for (int j = 1; j < 11; j++) {
                int prodotto = i * j;
                //char asterisco = '*';
                System.out.print(prodotto + "\t"); //Stampo in orizzontale
                //System.out.print(asterisco + "\t");
            }//Fine ciclo interno
            System.out.println();
        }
    }
}
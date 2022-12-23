public class Main {
    public static void main(String[] args) {
        int estratti[] = new int[10];
        for (int i = 0; i < estratti.length; i++) {
            estratti[i] = (int) (Math.random() * 51);
        }
        System.out.println("Valori generati");
        for (int x = 0; x < estratti.length; x++) {
            if (estratti[x] % 2 == 0) {

                System.out.println("Il numero " + estratti[x] + " è pari");
            }
        }
    }
}
package desafio1009;

public class PrimosVersao01 {

    // Método que verifica se um número é primo
    public static boolean isPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int inicio = 5;
        int fim = 25;

        System.out.print("Primos existentes: ");
        for (int i = inicio; i <= fim; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

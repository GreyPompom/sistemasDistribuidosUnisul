package desafio1009;

public class PrimosVersao02 extends Thread {

    int inicio;
    int fim;

    PrimosVersao02(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }
    @Override
    public void run() {
        System.out.print("Primos existentes: ");
        for (int i = inicio; i <= fim; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
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
        PrimosVersao02 intervalo = new PrimosVersao02(5, 25);

        Thread t1 = new Thread(intervalo);
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

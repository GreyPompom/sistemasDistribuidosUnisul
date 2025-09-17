package desafio1009;

public class PrimosVersao04 extends Thread {

    int inicio;
    int fim;
    String nome;

    PrimosVersao04(int inicio, int fim, String nome) {
        this.inicio = inicio;
        this.fim = fim;
        this.nome = nome;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " iniciou.");
        for (int i = inicio; i <= fim; i++) {
            if (isPrimo(i)) {
                System.out.println(Thread.currentThread().getName() + " encontrou: " + i);
            }
        }
        System.out.println(Thread.currentThread().getName() + " terminou.");

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

        PrimosVersao04 intervalo = new PrimosVersao04(5, 50, "t1");
        PrimosVersao04 intervalo2 = new PrimosVersao04(51, 100, "t2");
        PrimosVersao04 intervalo3 = new PrimosVersao04(101, 150, "t3");

        Thread t1 = new Thread(intervalo,"Thread-Primos-1");
        Thread t2 = new Thread(intervalo2,"Thread-Primos-2");
        Thread t3 = new Thread(intervalo3,"Thread-Primos-3");
        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package desafio1009;

public class PrimosVersao03 extends Thread {

    int inicio;
    int fim;
    String nome;

    PrimosVersao03(int inicio, int fim, String nome) {
        this.inicio = inicio;
        this.fim = fim;
        this.nome = nome;
    }
    @Override
    public void run() {
        System.out.print("Primos existentes: ");
        for (int i = inicio; i <= fim; i++) {
            if (isPrimo(i)) {
                System.out.print(nome +" : " +i + " \n");
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
        int inicio = 5;
        int fim = 25;
        int meio = (inicio + fim) / 2;

        PrimosVersao03 intervalo = new PrimosVersao03(inicio, meio, "t1");
        PrimosVersao03 intervalo2 = new PrimosVersao03(meio + 1, fim, "t2");

        Thread t1 = new Thread(intervalo);
        Thread t2 = new Thread(intervalo2);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

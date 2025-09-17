package desafio1009;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimosVersao05 extends Thread {

    int inicio;
    int fim;
    String nome;
    private List<Integer> primos = new ArrayList<>();

    public List<Integer> getPrimos() {
        return new ArrayList<>(primos); 
    }

    PrimosVersao05(int inicio, int fim, String nome) {
        this.inicio = inicio;
        this.fim = fim;
        this.nome = nome;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " iniciou.");
        for (int i = inicio; i <= fim; i++) {
            if (isPrimo(i)) {
                primos.add(i);
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

        PrimosVersao05 intervalo = new PrimosVersao05(5, 50, "t1");
        PrimosVersao05 intervalo2 = new PrimosVersao05(51, 100, "t2");
        PrimosVersao05 intervalo3 = new PrimosVersao05(101, 150, "t3");

        Thread t1 = new Thread(intervalo, "Thread-Primos-1");
        Thread t2 = new Thread(intervalo2, "Thread-Primos-2");
        Thread t3 = new Thread(intervalo3, "Thread-Primos-3");
        t1.start();
        t2.start();
        t3.start();



        try {
            t1.join();
            t2.join();
            t3.join();
            List<Integer> todosPrimos = new ArrayList<>();
            todosPrimos.addAll(intervalo.getPrimos());
            todosPrimos.addAll(intervalo2.getPrimos());
            todosPrimos.addAll(intervalo3.getPrimos()); 
            Collections.sort(todosPrimos);
            System.out.println("Números primos encontrados: " + todosPrimos);
            System.out.println("Total de números primos encontrados: " + todosPrimos.size());


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
    }
}

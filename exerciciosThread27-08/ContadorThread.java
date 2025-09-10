public class ContadorThread implements Runnable {

    private String nome;

    public ContadorThread(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(nome + ": " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        ContadorThread tarefa1 = new ContadorThread("Thread 1");
        ContadorThread tarefa2 = new ContadorThread("Thread 2");

        Thread t1 = new Thread(tarefa1);
        Thread t2 = new Thread(tarefa2);

        t1.start();
        t2.start();
    }
}

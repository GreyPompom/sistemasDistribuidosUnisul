public class ImprimeMensagem implements Runnable {

    private String mensagem;

    public ImprimeMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(mensagem);

            try {
                Thread.sleep(700); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        ImprimeMensagem tarefa1 = new ImprimeMensagem("Olá do Runnable 1");
        ImprimeMensagem tarefa2 = new ImprimeMensagem("TOlá do Runnable 2");

        Thread t1 = new Thread(tarefa1);
        Thread t2 = new Thread(tarefa2);

        t1.start();
        t2.start();
    }
}

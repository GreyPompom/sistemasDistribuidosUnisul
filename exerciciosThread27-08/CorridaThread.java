public class CorridaThread implements Runnable {
    private String nome;

    public CorridaThread(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void run() {
       for (int i = 10; i <= 100; i+=10){
            System.out.println(nome + " correu: "+i+"metros");
            try {
                Thread.sleep(400); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        CorridaThread corredor1 = new CorridaThread("pedro");
        CorridaThread corredor2 = new CorridaThread("joao");
        CorridaThread corredor3 = new CorridaThread("maria");

        Thread t1 = new Thread(corredor3);
        Thread t2 = new Thread(corredor2);
        Thread t3 = new Thread(corredor1);

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

        System.out.println("Corrida finalizada!");
    }


}

public class LetrasNumeros {

     static class NumerosRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(300); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
     static class LetrasRunnable implements Runnable {
        @Override
        public void run() {
              for (char c = 'A'; c <= 'E'; c++) {
                System.out.println(c);
                try {
                    Thread.sleep(300); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new NumerosRunnable());
        Thread t2 = new Thread(new LetrasRunnable());

        t1.start();
        t2.start();

        try {
            t1.join(); 
            t2.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Acaboi");
    }
}

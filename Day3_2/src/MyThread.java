public class MyThread  implements  Runnable {
    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Thread is Running ->" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread obj=new MyThread();
        Thread t1=new Thread(obj,"A");
        Thread t2=new Thread(obj,"B");
        Thread t3=new Thread(obj,"C");
        t1.start();
        t1.join();
        t2.start();
        t3.start();
        System.out.println("t1--->"+t1.isAlive());
        System.out.println("t2--->"+t2.isAlive());
        System.out.println("t3--->"+t3.isAlive());
    }
}

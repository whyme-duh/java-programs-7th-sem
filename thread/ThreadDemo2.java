package thread;
class Calculation5 implements Runnable{
    @Override
    public void run(){
         for(int i = 1;i<=50;i++){
            System.out.println("Calculation 5 " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Calculation6 implements Runnable{
    @Override
    public void run(){
         for(int i = 1;i<=50;i++){
            System.out.println("Calculation 6 " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadDemo2 {
    Calculation5 c1 = new Calculation5();
    Calculation6 c2 = new Calculation6();
    Thread t1 = new Thread(c1);
    Thread t2 = new Thread(c2);
    // t1.join();
    // t2.join();
}

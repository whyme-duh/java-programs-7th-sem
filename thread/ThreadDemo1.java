package thread;
//using multi threading a program can do multiple task at a same time
// there are two ways to use multi threading in java
// 1: implementing runable interface
// 2 : inheriting (extends) thread class

class Calculation extends Thread{
    @Override
    public void run(){
        for(int i = 1;i<=50;i++){
            System.out.println("Calculation" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
       
    }
}

class Calculation1 extends Thread{
    @Override
    public void run(){
        for(int i = 1;i<=50;i++){
            if(i%2 == 0){
                System.out.println("Even " + i);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadDemo1 {
    Calculation c1 = new Calculation();
    Calculation1 c2 = new Calculation1();
    // c1.join();
    
}

abstract class Calculation{
    // instance variable
    private int x;
    private int y;
    //constructor
    public Calculation(int x, int y){
        this.x = x;
        this.y = y;
    }
    //normal method
    public void add(){
        System.out.println("Addition is " + (this.x + this.y));
    }
    //abstract method
    public abstract void substract(int x1, int y1);
    public abstract int multiplication(int x1 , int y1);


}

class NormalClass extends Calculation{
    private int x2;
    private int y2;
    public NormalClass(int x2, int y2, int x, int y){
        super(x,y); // calls constructor of calculation
        this.x2 = x2;
        this.y2 = y2;
    }
    public void division(){
        System.out.println("Division is " + (this.x2 / this.y2));
    }

    // overriding the abstract method ; providing detail of abstract method
    @Override
    public void substract(int x1, int y1){
        System.out.println("Substraction is " + (this.x2 - this.y2));

    }
    @Override
    public int multiplication(int x1 , int y1){
        return (x1 * y1);
    }
}

public class Abstract {
    public static void main(String[] args) {
        NormalClass n = new NormalClass(10, 12, 5, 15);
        n.add();
        n.division();
        n.substract(10, 20);
        System.out.println(n.multiplication(1, 1));

        // using reference of abstract class

        Calculation c1;
        c1 = n; // dynamic methid dispatch
        c1.add();
    }

    
}



interface Calcs1{
    void add(int x , int y);
    void diff(int x, int y);
    int mul(int x, int y);
}

class Solution implements Calcs1{
    @Override
    public void add(int x, int y){
        System.out.println("Addition is : " + (x + y));
    }
    @Override
    public void diff(int x, int y){
        System.out.println("Difference is : " + (x - y));
    }
    public int mul(int x , int y){
        return x *y;
    }


}

public class Interface {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.add(15, 25);
        s1.diff(10, 5);
        System.out.println(s1.mul(0, 0));

        Calcs1 c1;
        c1 = s1;
        c1.add(100, 14);
    }
    
}
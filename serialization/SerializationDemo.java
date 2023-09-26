package serialization;
import java.io.*;

// Serialization is the process of writing obejct to the file
// deserialization is the prociess of reading object from file
//following classes are used : ObjectOutputStream : to write object
// ObjectInputStream : to read object
class Rectangles implements Serializable{
    private int length;
    private int breadth;

    public Rectangles(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void CalcArea(){
        System.out.println("Area" + this.length*this.breadth);
    }

    public void CalcPeri(){
        System.out.println("Perimeter is " + 2*(this.length+this.breadth));
    }
}


public class SerializationDemo {
    public static void main(String[] args) {
        try {
            Rectangles r1 = new Rectangles(10, 30);
            FileOutputStream fos = new FileOutputStream("csit.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(r1);
            System.out.println("Object written!");
            fos.close();
            os.close();

            // deserialization

            FileInputStream fi = new FileInputStream("csit.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            Rectangles r2 = (Rectangles)ois.readObject();
            r2.CalcArea();
            r2.CalcPeri();
            fi.close();
            ois.close();
        } catch (IOException e) {
            System.out.println(e);
        }catch(ClassNotFoundException c){
            System.out.println(c);
        
    }
}
}

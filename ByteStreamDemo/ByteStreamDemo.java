import java.io.*;

public class ByteStreamDemo {
    public static void main(String[] args) {
        //writing into file through byte stream
        try{
            FileOutputStream fos = new FileOutputStream("csit.txt");
            String data = "asdust a text";
            //converting into byte
            byte []b1 = data.getBytes(data);
            fos.write(b1);
            System.out.println("Written!");

            //reading data from file using byte stream
            FileInputStream fis = new FileInputStream("csit.txt");
            int res;
            while((res = fis.read()) != -1){
                System.out.print((char)res);
            }
            fos.close();
        }catch(IOException i){
            System.out.println("Error " + i);
        }
    }
    
}

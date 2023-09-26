package characterSteamDemo;
import java.io.*;
//character stream can read and write through string
//use two classes: 
//FileReader : to read data from file
//FileWriter : to write data into file


public class CharacterStream {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("csit.txt");
            String data = "This is just a texzt";
            fw.write(data);           
            System.out.println("Written!"); 

            // reading
            FileReader fr = new FileReader("csit.txt", null);
            int res;
            while((res = fr.read())!= -1){
                System.out.println((char)res);
            }
            fr.close();
        }catch(IOException i){
            System.out.println(i);
        }
    }
}

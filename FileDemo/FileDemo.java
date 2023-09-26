import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        try{
            File f1 = new File("csit.txt");
            if(!f1.exists()){
                f1.createNewFile();
            }
            else{
                System.out.println("File already exist");
            }
            System.out.println("name of file is" + f1.getName());
            System.out.println("Path of the file " + f1.getPath());
            System.out.println("absolte path is " + f1.getAbsolutePath());
            System.out.println("Size is " + f1.getTotalSpace());
        }catch(IOException i){
            System.out.println("error : "+i);
        }

    }
    
}

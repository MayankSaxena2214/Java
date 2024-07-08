import java.io.*;

public class FileExample {
    public static void main(String[] args) throws IOException{
        File f=new File("./name.txt");
        System.out.println(f.exists());
        f.createNewFile();
        System.out.println(f.exists());
    }
}

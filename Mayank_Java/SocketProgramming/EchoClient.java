import java.net.Socket;
public class EchoClient {
    public static void main(String[]args){
        try{
            System.out.println("ClientStarted");
        Socket soc=new Socket("localhost",9806);
        
        }
        catch(Exception e){ 
            System.out.println("Error:"+e);
        }
    }
}

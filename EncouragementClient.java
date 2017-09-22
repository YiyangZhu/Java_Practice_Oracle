import java.io.*;
import java.net.*;

public class EncouragementClient{
    public static void main(String[] args){
        EncouragementClient client = new EncouragementClient();
        client.go();
    }
    
    public void go(){
        try{
            Socket s = new Socket("127.0.0.1",4242);
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader br = new BufferedReader(streamReader);
            String encouragement = br.readLine();
            System.out.println(encouragement+"!");
            br.close();
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
}
        
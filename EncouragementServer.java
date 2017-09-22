import java.io.*;
import java.net.*;

public class EncouragementServer{
    private String[] encouragementList = {"You should be proud of yourself","Excellent job","Well done","Great job","You work really hard to achieve those"};
    public static void main(String[] args){
        EncouragementServer server = new EncouragementServer();
        server.go();
    }
    
    public void go(){
        try{
            ServerSocket serverSocket = new ServerSocket(4242);
            
            while(true){
                Socket s = serverSocket.accept();
                PrintWriter w = new PrintWriter(s.getOutputStream());
                String encouragement = getEncouragement();
                w.println(encouragement);
                w.close();
                System.out.println(encouragement);
            }
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    public String getEncouragement(){
        int random = (int)(Math.random()*encouragementList.length);
        return encouragementList[random];
    }
}
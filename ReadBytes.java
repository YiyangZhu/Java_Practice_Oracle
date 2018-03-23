import java.io.*;

class ReadBytes{
    public static void main(String[] args) throws IOException{
        byte[] data = new byte[10];
        System.out.println("Please enter some characters.");
        System.in.read(data);
        for(int i = 0; i < 10; i++){
            System.out.print((char)data[i]);
        }
    }
}
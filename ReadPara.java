class ReadPara implements Reader{
    String s;
    
    public static void main(){
    }
        
    
    void go(){
        s = "abcdedfhijklmnopqrstuvwxyz";
        System.out.println(read());
    }
    //must have public as the access modifier
    public String read(){
        return s;
    }
}
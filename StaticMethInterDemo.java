class StaticMethInterDemo implements MyID{
    public static void main(String[] args){
        System.out.println("The universal ID is: "+MyID.getUniversalID());
    }
    
    public int getUserID(){
        return 10;
    }
}
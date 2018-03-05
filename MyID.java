public interface MyID{
    int getUserID();
    
    //default interface method
    default int getAdminID(){
        return -1;
    }
    
    //static interface method
    //static method MUST have implementation!
    static int getUniversalID(){
        return 0;
    }
    
}
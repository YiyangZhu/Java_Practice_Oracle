//demonstrates default method in interface
interface MyIF{
    //a "normal" method in interface
    //does not define a default implementation
    int getUserID();
    
    //a default method, with default implementation
    default int getAdminID(){
        return -1;
    }
}
class DefaultMethodInterDemo{
    public static void main(String[] args){
        MyIFImp m = new MyIFImp();
        //call default method in interface
        System.out.println("Admin ID is:"+m.getAdminID());
        //call abstract method in interface
        System.out.println("User ID is:"+m.getUserID());
        //both works
    }
}
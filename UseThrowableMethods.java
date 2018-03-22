class UseThrowableMethods{
    public static void main(String[] args){
        try{
            ExceptionTest.generateException();
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("\nStandard message is:\n"+ex);
            System.out.println("\nStack trace is:");
            ex.printStackTrace();
        }
        System.out.println("After catch statement.");
    }
}
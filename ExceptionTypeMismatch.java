class ExceptionTypeMismatch{
    public static void main(String[] args){
        int[] array = new int[5];
        try{
            System.out.println("Before exception is generated.");
            array[9] = 11;
        } catch(ArithmeticException ex){
            System.out.println("Arithmetic exception. Will not be displayed.");
        }
        System.out.println("Will not be displayed.");
    }
}
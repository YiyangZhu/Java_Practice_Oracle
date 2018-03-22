class ThrowDemo{
    public static void main(String[] args){
        try{
            System.out.println("Before throw.");
            throw new ArithmeticException();
        } catch (Throwable ex){
            System.out.println("Catch the exception thrown.");
        }
        System.out.println("After try and catch block.");
    }
}
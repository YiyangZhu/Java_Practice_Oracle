class ExceptionDemo2{
    public static void main(String[] args){
        try{
            ExceptionTest.generateException();
            System.out.println("This won't be displayed.");
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Array index out of bounds error!");
        }
        System.out.println("After catch statement.");
    }
}
   
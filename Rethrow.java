class Rethrow{
    static void genException(){
        int[] numer = {9,27,81,243,729,2187,6561};
        int[] denom = {3,0,9,9,0,0};
        for(int i = 0; i < numer.length; i++){
            try{
                System.out.println(numer[i]+"/"+denom[i]+"="+numer[i]/denom[i]);
            } catch (ArithmeticException ex){ // subclass must be put before super class, else will cause error - unreachable code error
                System.out.println("Arithmetic exception! Cannot divide by zero!"); // Throwable is the superclass of ALL exceptions
            } catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Array index out of bounds exception!");
                throw ex;
            }
        } 
    }
}
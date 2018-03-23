class CustomExceptionDemo{
    public static void main(String[] args){
        int[] numer = {9,27,80,243,729,2187,6561};
        int[] denom = {3,0,9,9,0,9};
        for(int i = 0; i < numer.length; i++){
            try{
                if(numer[i] % 3 != 0){
                    throw new NonIntResultException(numer[i],denom[i]);
                }
                System.out.println(numer[i]+"/"+denom[i]+"="+numer[i]/denom[i]);
            } catch (ArithmeticException ex){
                System.out.println(ex); 
            } catch (ArrayIndexOutOfBoundsException ex){
                System.out.println(ex);
            } catch (NonIntResultException ex){
                System.out.println(ex); //toString() has been overriden in NonIntResultException class
            }
        }
    }
}
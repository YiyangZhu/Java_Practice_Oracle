class ChainedExceptions{
    
    public static void main(String[] args){
        int c = (char) 1;
        System.out.println(c);
        try{
            java.io.IOException ex = new java.io.IOException("exception");
            ex.initCause(new NullPointerException("null pointer exception"));
            throw ex;
        } catch (Exception e){
            System.out.println(e.getCause());
        }
    }
}
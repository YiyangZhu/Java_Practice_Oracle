class RethrowDemo{
    public static void main(String[] args){
        try{
            Rethrow.genException();
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Fatal error! Program terminated!");
        }
    }
}
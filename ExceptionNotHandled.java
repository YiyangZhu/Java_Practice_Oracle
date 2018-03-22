class ExceptionNotHandled{
    public static void main(String[] args){
        int[] array = new int[5];
        System.out.println("Before exception is generated.");
        array[9] = 18;
    }
}
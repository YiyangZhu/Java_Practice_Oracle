class ExceptionDemo1{
    public static void main(String[] args){
        int[] array = new int[7];
        try{
            System.out.println("This is before exception is generated.");
            array[10] = 8;
            System.out.println("This will not show.");
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index out of bounds exception!");
        }
        System.out.println("This is after catch statement.");
    }
}
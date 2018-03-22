class ExceptionTest{
    static void generateException(){
        int[] nums = new int[5];
        System.out.println("Before exception is generated.");
        nums[9] = 11;
        System.out.println("This won't be displayed.");
    }
}

 
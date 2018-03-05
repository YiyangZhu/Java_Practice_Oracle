class ByTwoDemo{
    public static void main(String[] args){
        ByTwos b = new ByTwos();
        for(int i = 0; i < 5; i++){
            System.out.println("Next value is "+b.getNext());
            System.out.println("Previous value is "+b.getPrevious());
        }
        System.out.println("\nResetting");
        b.reset();
        for(int i = 0; i < 5; i++){
            System.out.println("Next value is "+b.getNext());
            System.out.println("Previous value is "+b.getPrevious());           
        }
        System.out.println("\nStart with 100");
        b.setStart(100);
        for(int i = 0; i < 5; i++){
            System.out.println("Next value is "+b.getNext());
            System.out.println("Previous value is "+b.getPrevious());
        }
    }
}
class SeriesDemo{
    public static void main(String[] args){
        ByTwos b = new ByTwos();
        ByThrees b2 = new ByThrees();
        for(int i = 0; i < 5; i++){
            System.out.println("By Twos, next value is "+b.getNext());
            System.out.println("By Twos, previous value is "+b.getPrevious());
            System.out.println("By Threes, next value is "+b2.getNext());
            System.out.println("By Threes, previous value is "+b2.getPrevious());
        }
        System.out.println("\nResetting");
        b.reset();
        for(int i = 0; i < 5; i++){
            System.out.println("By Twos, next value is "+b.getNext());
            System.out.println("By Twos, previous value is "+b.getPrevious());
            System.out.println("By Threes, next value is "+b2.getNext());
            System.out.println("By Threes, previous value is "+b2.getPrevious());
        }
        System.out.println("\nStart with 100");
        b.setStart(100);
        for(int i = 0; i < 5; i++){
            System.out.println("By Twos, next value is "+b.getNext());
            System.out.println("By Twos, previous value is "+b.getPrevious());
            System.out.println("By Threes, next value is "+b2.getNext());
            System.out.println("By Threes, previous value is "+b2.getPrevious());
        }
    }
}
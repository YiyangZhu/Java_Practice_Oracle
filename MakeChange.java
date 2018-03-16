class MakeChange{
    public static void main(String[] args){
        int input = 58;
        System.out.println("There are "+makeChange(input)+" different ways.");
    }
    
    static int makeChange(int n) {
        int ways = 0;
        for (int count25 = 0; count25 * 25 <= n; count25++) {
            for (int count10 = 0; count10 * 10 <= n-count25*25; count10++) {
                for (int count5 = 0; count5 * 5 <= n-count25*25-count10*10; count5++) {
                    ways++;
                }
            }
        }
        return ways;
    }
}
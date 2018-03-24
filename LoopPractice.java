public class LoopPractice{
    public static void main(String[] args){
        useFor();
        useWhile();
        useDoWhile();
    }
    
    static void useFor(){
        for(int i = 1; i <= 9; i++){
            for(int j = i; j <= 9; j++){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
    
    static void useWhile(){
        int i = 1, j = 1;
        while( i != 10){
            j = i;
            while(j != 10){
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
                j++;
            }
            i++;
            System.out.println();
        }
    }
    
    static void useDoWhile(){
        int i = 1, j = 1;
        do { 
            j = i;
            do {   
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
                j++;
            } while (j <= 9);
            i++;
            System.out.println();
        } while (i <= 9);
    }
}
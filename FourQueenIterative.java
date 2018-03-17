import java.util.Stack;

class FourQueenIterative{

    public static void main(String[] args){
        Stack<int[][]> stack = new Stack<>();
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(j == i){
                    continue;
                }
                for(int k = 0; k < 4; k++){
                    if(k==i || k == j){
                        continue;
                    }
                    for(int l = 0; l < 4 ; l++){
                        if(l == i||l==j||l==k){
                            continue;
                        }
                        int[][] board = new int[4][4];
                        board[0][i]=1;
                        board[1][j]=1;
                        board[2][k]=1;
                        board[3][l]=1;
                        stack.push(board);
                    }
                }
            }
        }
        System.out.println(stack);
        int count = 0;
        A: while(!stack.empty()){
            int[][] board = stack.pop();
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    if(board[i][j] == 1){
                        if(!ok(board,i,j)){
                        continue A;
                        }
                    }
                }
            }
            print(board);
            count++;
            System.out.print(count+" ");
        }
        System.out.println("After loop:"+stack);  
    }
    
     static boolean ok(int[][] board, int i, int j){
        for(int row = 0 ; row < i; row++){
            if(board[row][j] == 1){
                return false;
            }
        }
        
        for(int column = 0 ; column < j; column++){
            if(board[i][column] == 1){
                return false;
            }
        }
        
        for(int k = 1 ; i-k >= 0 && j-k >= 0; k++){
            if(board[i-k][j-k] == 1){
                return false;
            }
        }
            
        for(int k = 1 ; i-k >= 0 && j+k < 4; k++){
            if(board[i-k][j+k] == 1){
                return false;
            }
        }    
        return true;
    }
    
    static void print(int[][] array){
        System.out.println(array);
        for(int[] a: array){
            for(int b: a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
    
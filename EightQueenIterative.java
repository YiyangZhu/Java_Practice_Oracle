import java.util.Stack;

class EightQueenIterative{

    public static void main(String[] args){
        Stack<int[][]> stack = new Stack<>();
        int count = 0;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8 ; j++){
                if(j == i){
                    continue;
                }
                for(int k = 0; k < 8 ; k++){
                    if(k==i || k == j){
                        continue;
                    }
                    for(int l = 0; l < 8 ; l++){
                        if(l == i||l==j||l==k){
                            continue;
                        }
                        for(int m = 0; m < 8 ; m++){
                            if(m==i||m==j||m==k||m==l){
                                continue;
                            }
                            for(int n = 0; n < 8 ; n++){
                                if(n==i||n==j||n==k||n==l||n==m){
                                    continue;
                                }
                                for(int o = 0; o < 8; o++){
                                    if(o==i||o==j||o==k||o==l||o==m||o==n){
                                        continue;
                                    }
                                    for(int p = 0; p < 8; p++){
                                        if(p==i||p==j||p==k||p==l||p==m||p==n||p==o){
                                            continue;
                                        }
                                        int[][] board = new int[8][8];
                                        board[0][i]=1;
                                        board[1][j]=1;
                                        board[2][k]=1;
                                        board[3][l]=1;
                                        board[4][m]=1;
                                        board[5][n]=1;
                                        board[6][o]=1;
                                        board[7][p]=1;
                                        if(ok(board,0,i)&&ok(board,1,j)&&ok(board,2,k)&&ok(board,3,l)&&ok(board,4,m)&&ok(board,5,n)&&ok(board,6,o)&&ok(board,7,p)){
                                            print(board);
                                            stack.push(board);
                                            count++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.print(count+" ");
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
            
        for(int k = 1 ; i-k >= 0 && j+k < 8; k++){
            if(board[i-k][j+k] == 1){
                return false;
            }
        }    
        return true;
    }
    
    static void print(int[][] array){
        for(int[] a: array){
            for(int b: a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
    
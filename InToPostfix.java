import java.util.Stack;

class InToPostfix{
    static String output = "";
    
    public static void main(String[] args){
        String input = "1-(2+3*(4-5*6)-7)+8*9";
        System.out.println(inToPostfix(input));
    }
    
    static String inToPostfix(String input){
        int length = input.length();
        Stack<String> operators = new Stack<>();
        output = input.substring(0,1); //put first element to output
        for(int i = 1; i < length; i++){
            String ith = input.substring(i,i+1);
            if(isOperator(ith)){    //+ - * /
                if(operators.empty()){ //stack: no element
                    operators.push(ith);    //push + - * / to stack
                } else {
                    while(!operators.empty() && needToPop(operators.peek(),ith)){ //judge on precedence
                        output += operators.pop();
                    }
                    operators.push(ith);
                }
            } else if(isLeftPa(ith)){
                operators.push(ith);
            } else if (isRightPa(ith)){
                while((!operators.empty()) && (!isLeftPa(operators.peek()))){
                    output += operators.pop();
                }
                if(!operators.empty()){
                    operators.pop();
                }
            } else {
                output += ith;
            }
        }
        while(!operators.empty()){
            output += operators.pop();
        }
        return output;
    }
    
    static boolean isOperator(String s){
        if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
            return true;
        }
        return false;
    }
    
    static boolean isLeftPa(String s){
        if(s.equals("(")){
            return true;
        }
        return false;
    }
    
    static boolean isRightPa(String s){
        if(s.equals(")")){
            return true;
        }
        return false;
    }
    
    static boolean needToPop(String s1, String s2){
        if((s1.equals("+")||s1.equals("-")) && (s2.equals("*")||s2.equals("/")) || s1.equals("(")){
            return false;
        } else {
            return true;
        }
    }
}
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

class Calculator{
    static HashMap<String, Integer> map = new HashMap<>();
    static String output = "";
    static int countLeft = 0;
    static int countRight = 0;
    static String previous;
    public static void main(String[] args){
        read();  
    }
    
    static void read(){
        Scanner sc = new Scanner(System.in);
        String line;
        while( sc.hasNextLine()){
            line = sc.nextLine();
            if(line.equals("exit")){
                System.exit(0);
            } else if(line.equals("clear all")){
                map.clear();
                continue;
            } else if(line.equals("show")){
                System.out.println(map);
                continue;
            } else if(line.length() >= 7 && (line.substring(0,5)).equals("clear")){
                map.remove(line.substring(6));
                continue;
            }
            String result = removeSpace(line);
            splitEqual(result);
        }
    }
    
    static String removeSpace(String s){
        String result = new String();
        for(int i = 0; i < s.length(); i++){
            if(s.substring(i,i+1).equals(" ")){
                continue;
            } else {
                result += s.substring(i,i+1);
            }
        }
        return result;
    }
    
    static void splitEqual(String result){
        String[] sArray = result.split("=");
        Integer d = getResult(sArray[sArray.length-1]);
        for(int i = 0; i < sArray.length-1; i++){
            map.put(sArray[i],d);
        }
    }
    
    static int getResult(String s){
        String stringValue = inToPostfix(s);
        return calculateValue(stringValue);
    }
    
    static boolean valid(String s){
        if(s.equals("0")||s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||s.equals("5")||
           s.equals("6")||s.equals("7")||s.equals("8")||s.equals("9")||s.equals(".")){
            return true;
        } else {
            return false;
        }
    }
    
    static String inToPostfix(String input){
        int length = input.length();
        Stack<String> operators = new Stack<>();
        
        output = input.substring(0,1); //put first element to output
        for(int i = 1; i < length; i++){
            previous = input.substring(i-1,i);
            String ith = input.substring(i,i+1);
            //skip space
            if(ith.equals(" ")){
                continue;
            }
            //judge whether invalid integer
            if(isInteger(previous) && isInteger(ith)){
                System.out.println("Error! Invalid expression!");
                return null;
            }
            //detect whether divide by zero
            if(divideByZero(previous, ith)){
                System.out.println("Error! Divide by zero!");
                return null;
            }
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
                countLeft++;
            } else if (isRightPa(ith)){
                countRight++;
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
        //judge on parenthesis mismatch
        if(countLeft!=countRight){
            System.out.println("Error! Parenthesis mismatch!");
            return null;
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
    
    static boolean isInteger(String s){
        if(s.equals("0")||s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||
           s.equals("5")||s.equals("6")||s.equals("7")||s.equals("8")||s.equals("9")){
            return true;
        }
        return false;
    }
    
    static boolean divideByZero(String previous, String ith){
        if(previous.equals("/") && ith.equals("0")){
            return true;
        }
        return false;
    }
    
    static int calculateValue(String s){
        Stack<Integer> s1 = new Stack();
        Stack s2 = new Stack();
        for(int i = 0; i < s.length();i++){
            if(isInteger(s.substring(i,i+1))){
                s1.push(Integer.parseInt(s.substring(i,i+1)));
            } else {
                s1.push(calculate(s1.pop(),s1.pop(),s.substring(i,i+1)));
            }
        }
        return s1.pop();
    }
    
    static int calculate(int i, int j, String s){
        switch(s){
            case "+":
                return j+i;
            case "-":
                return j-i;
            case "*":
                return j*i;
            case "/":
                return j/i;
            default:
                return -10000000;
        }
    }   
}
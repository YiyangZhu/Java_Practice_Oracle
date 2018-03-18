import java.util.HashMap;
import java.util.Scanner;

class Calculator{
    static HashMap<String, Double> map = new HashMap<>();
    public static void main(String[] args){
        String s;
        Scanner sc = new Scanner(System.in);
        String line;
        while((line = sc.nextLine())!=null){
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
        Double d = getResult(sArray[sArray.length-1]);
        for(int i = 0; i < sArray.length-1; i++){
            map.put(sArray[i],d);
        }
    }
    
    static Double getResult(String s){
        int start = 0;
        int end = 1;
        Double d;
        while(valid(s.substring(start,end))){
            end++;
        }
        end++;
        d = Double.parseDouble(s.substring(start,end));
        start = end + 1;
        end += 2;
        while(valid(s.substring(start,end))){
            end++;
        }
        end++;
        d += Double.parseDouble(s.substring(start,end));
        return d;
    }
    
    static boolean valid(String s){
        if(s.equals("0")||s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||s.equals("5")||
           s.equals("6")||s.equals("7")||s.equals("8")||s.equals("9")||s.equals(".")){
            return true;
        } else {
            return false;
        }
    }
        
}
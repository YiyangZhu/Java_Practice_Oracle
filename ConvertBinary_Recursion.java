class ConvertBinary_Recursion{
    static int result;
    static int count = 0; // count records how many times the i was divided by 2
    
    public static void main(String[] args){
        System.out.println(convertBinary(9));
        System.out.println(iteBinary(15));
    }
    
    static int convertBinary(int i){
        if(i == 0) return result;
        if(i == 1) return (result + (int)Math.pow(10,count));
        if(i % 2 == 0){
            result = result + 0*(int)Math.pow(10,count);
        } else {
            result = result + 1*(int)Math.pow(10,count);
        }
        count++;
        return convertBinary(i / 2);
    }
    
    static int iteBinary(int i){
        int iteResult = 0;
        int iteCount = 0;
        while(i != 0){
            if(i % 2 == 0){
                iteResult = iteResult + 0*(int)Math.pow(10,iteCount);
            } else {
                iteResult = iteResult + 1*(int)Math.pow(10,iteCount);
            }
            i = i / 2;
            iteCount++;
        }
        return iteResult;
    }       
}
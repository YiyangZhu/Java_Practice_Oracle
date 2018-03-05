//demonstrates how to use interface variables
class IConstD implements IConst{
    public static void main(String[] args){
        int[] nums = new int[MAX];
        for(int i = -5; i < MAX + 1; i++){
            if(i < MIN || i >= MAX) System.out.println(ERRORMSG);
            else{
                nums[i] = i;
                System.out.print(nums[i]+" ");
            }
        }
    }
}
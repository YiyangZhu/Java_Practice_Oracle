class CircularQueue implements ICharQ{
    char q[];
    int putloc, getloc;
    
    CircularQueue(int size){
        q = new char[size+1];
        putloc = getloc = 0;
    }
    
    public void put(char ch){
        if((putloc+1) == getloc || (putloc == q.length - 1)&&(getloc == 0)){
            System.out.println("Queue is Full!");
            return;
        }
        q[putloc++] = ch;
        if(putloc == q.length) putloc = 0;
    }
    
    public char get(){
        if(getloc == putloc){
            System.out.println("Queue is Empty!");
            return (char)0;
        }
        char ch =  q[getloc++];
        if(getloc == q.length) getloc = 0;
        return ch;
    }   
            
}
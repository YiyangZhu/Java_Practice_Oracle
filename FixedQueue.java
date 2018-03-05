class FixedQueue implements ICharQ{
    char q[];
    int putloc, getloc;
    
    FixedQueue(int size){
        q = new char[size];
        putloc = getloc = 0;
    }
    
    public void put(char ch){
        if(putloc == q.length){
            System.out.println("Queue is Full!");
            return;
        }
        q[putloc++] = ch;
    }
    
    public char get(){
        if(getloc == putloc){
            System.out.println("Queue is Empty!");
            return (char)0;
        }
        return q[getloc++];
    }
}
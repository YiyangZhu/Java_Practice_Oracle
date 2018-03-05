class DynQueue implements ICharQ{
    char q[];
    int putloc, getloc;
    
    DynQueue(int size){
        q = new char[size];
        putloc = getloc = 0;
    }
    
    public void put(char ch){
        if(putloc == q.length){
            char[] t = new char[q.length*2];
            for(int i= 0; i < q.length; i++) t[i] = q[i]; // resizing
            q = t;
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
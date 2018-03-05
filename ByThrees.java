//implements interface Series
class ByThrees implements Series{
    int start;
    int val;
    
    ByThrees(){
        start = 0;
        val = 0;
    }
    
    public int getNext(){
        val += 3;
        return val;
    }
    
    public void reset(){
        val = start;
    }
    
    public void setStart(int x){
        start = x;
        val = x;
    }
    
    int getPrevious(){
        int previous = val - 6;
        return previous;
    }
}
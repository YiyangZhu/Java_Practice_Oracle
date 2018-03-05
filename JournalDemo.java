
class JournalDemo{
    public static void main(String[] args){
        Journal[] journals = new Journal[3];
        journals[0] = new Journal("The Art of Computing","Key W.",2018);
        journals[1] = new Journal("Coding Changes the World","Yiyang Z.",2017);
        journals[2] = new Journal("Programming programs","Xiaobao Y.",2016);
        for(int i = 0; i < journals.length; i++){
            journals[i].display();
        }
    }
}
        
    
    
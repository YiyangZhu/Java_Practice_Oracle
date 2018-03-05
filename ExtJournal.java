package journalPackExt;

class ExtJournal extends journalPack.Journal{
    private String editor;
    
    ExtJournal(String n, String a, int p, int e){
        super(n,a,p);
        editor = e;
    }
    
    void display(){
        super.display();
        System.out.print("\tEditor: "+editor+"\t");
    }
}
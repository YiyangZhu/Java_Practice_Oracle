//demonstrate package
package journalPack;

class Journal{
    private String name;
    private String author;
    private int publiYear;
    
    Journal(String n, String a, int p){
        name = n;
        author = a;
        publiYear = p;
    }
    
    void display(){
        System.out.println("name: "+name+"\tauthor"+"\tpubliDate");
    }
}
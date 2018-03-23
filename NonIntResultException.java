class NonIntResultException extends Exception{
    int n;
    int d;
    
    NonIntResultException(int n, int d){
        this.n = n;
        this.d = d;
    }
    
    public String toString(){
        return "Result of "+n+"/"+d+" is not an integer.";
    }
}
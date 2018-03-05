class IQDemo{
    public static void main(String[] args){
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);
        ICharQ iQ;
        char ch;
        iQ = q1;
        for(int i = 0; i < 10; i++){
            iQ.put((char)('A'+i));
        }
        System.out.println("Elements in fixed queue:");
        for(int i = 0; i < 10; i++){
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
        
        iQ = q2;
        for(int i = 0; i < 10; i++){
            iQ.put((char)('Z'-i));
        }
        System.out.println("Elements in dynamic queue:");
        for(int i = 0; i < 10; i++){
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
        
        iQ = q3;
        for(int i = 0; i < 10; i++){
            iQ.put((char)('A'+i));
        }
        System.out.println("Elements in circular queue:");
        for(int i = 0; i < 10; i++){
            ch = iQ.get();
            System.out.print(ch);
        }
        System.out.println();
    }
}
        
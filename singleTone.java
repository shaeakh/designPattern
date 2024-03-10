// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class a {
    private int id ;
    private String s; 
    a(int id, String s){
        this.id = id; 
        this.s = s;
    }
    public void cng(int id,String s){
        this.id = id; 
        this.s = s;
    }
    public void show(){
        System.out.println("id "+id+" name "+s);
    }
}


class HelloWorld {
    public static void main(String[] args) {
        a A = new a(5,"A");
        A.show();
        a B = new a(10,"B");
        B.show();
        
        A = B;
        A.show();
        B.cng(1,"C");
        A.show();
        
    }
}

// output
// id 5 name A
// id 10 name B
// id 10 name B
// id 1 name C


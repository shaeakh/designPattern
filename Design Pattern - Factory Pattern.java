
public class Main {
  public static void main(String[] args) {
    buttonFactory bf = new buttonFactory();
    
    button b = bf.getButton("IOS");
    b.show();
  }
}

 interface button {
     public void show();
}

class IosButton implements button{
    @Override
    public void show(){
    	    System.out.println("this is an IOS button");
    }
    
}

class androidButton implements button{
    @Override
    public void show(){
    	    System.out.println("this is an Android button");
    }
}

class buttonFactory{
        public button getButton(String os){
        if(os.equalsIgnoreCase("Android")){
            return new androidButton();
        }
        else if(os.equalsIgnoreCase("IOS")){
            return new IosButton();
        }
        else {
            return null;
        }
    }
    
}


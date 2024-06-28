
class context{
    private state State;

    context(){
        State = null;
    }

    public void setState(state State){
        this.State = State;
    }

    public state getState(){
        return this.State;
    }    
}

interface state{
    public void DoAction(context Context);
}

class Start_State implements state{

    @Override
    public void DoAction(context Context) {
        System.out.println("\nPlayer is in start state\n");
        Context.setState(this);
    }

    public String toString(){
        return "\nStart State\n";
    }

}

class Stop_State implements state{

    @Override
    public void DoAction(context Context) {
        System.out.println("\nPlayer is in Stop State\n");
        Context.setState(this);        
    }

    public String toString(){
        return "\nStop State\n";
    }

}

public class State_Design_Pattern {
    public static void main(String[] args) {
        context Context = new context();

        Start_State s1 = new Start_State();
        s1.DoAction(Context);
        System.out.println(Context.getState().toString());

        Stop_State s2 = new Stop_State();
        s2.DoAction(Context);
        System.out.println(Context.getState().toString());
    }
}
import java.util.ArrayList;
import java.util.List;

class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String get_State() {
        return state;
    }
}

class Originator {
    private String state;

    public void Set_State(String state) {
        this.state = state;
    }

    public String get_State() {
        return state;
    }

    public Memento get_Memento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.get_State();
    }

}

class Caretaker {
    private List<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }

}

public class Memento_Design_Pattern {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.Set_State("State #1");
        originator.Set_State("State #2");
        caretaker.addMemento(originator.get_Memento()); 

        originator.Set_State("State #3");
        caretaker.addMemento(originator.get_Memento()); 

        originator.Set_State("State #4");
        System.out.println("Current State: "+originator.get_State());

        originator.getStateFromMemento(caretaker.getMemento(0));
        System.out.println("First Saved State: "+originator.get_State());

        originator.getStateFromMemento(caretaker.getMemento(1));
        System.out.println("Second Saved State: "+originator.get_State());



    }
}

import java.util.Scanner;  

interface Strategy {
    public int Do_Operation(int num1, int num2);
}

class Operation_add implements Strategy {
    @Override
    public int Do_Operation(int num1, int num2) {
        return num1 + num2;
    }
}

class Operation_substract implements Strategy {
    @Override
    public int Do_Operation(int num1, int num2) {
        return num1 - num2;
    }
}

class Operation_multiply implements Strategy {
    @Override
    public int Do_Operation(int num1, int num2) {
        return num1 * num2;
    }    
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute_calc(int num1, int num2) {
        return strategy.Do_Operation(num1, num2); 
    }
}

public class Strategy_Design_Pattern {
    public static void main(String[] args) {
        Context context = new Context(new Operation_multiply());        
        int num1 = 10;
        int num2 = 5;
        System.out.println(context.execute_calc(num1, num2));
    }
}

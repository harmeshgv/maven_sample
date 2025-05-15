package pack;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        calculator c = new calculator();
        c.a = 1;
        c.b = 2;
        System.out.println(c.addition(4,6));
    }
    
}

class calculator {

    int a;
    int b;

    public int addition() {
        return a+b;
    }

    public int subtraction() {
        return a-b;
    }

    public int multiplication() {
        return a*b;

    }

    public int square() {
        return a*a;
    }

    public int division() {
        if(b==0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a/b;
    }
    public int modulus() {
        if(b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a%b;
    }

    public int addition(int a, int b) {
        return a+b;
    }

    public int subtraction(int a, int b) {
        return a-b;
    }

    public int multiplication(int a, int b) {
        return a*b;

    }

    public int division(int a , int b) {
        if(b==0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a/b;
    }

    public int square(int a) {
        return a*a;
    }

    public int modulus(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a%b;
    }


}

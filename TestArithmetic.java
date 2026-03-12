import arithmetic.*;
import java.util.Scanner;
public class TestArithmetic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        Add add = new Add();
        Sub sub = new Sub();
        Mul mul = new Mul();
        Div div = new Div();
        System.out.println("Addition: " + add.calculate(a,b));
        System.out.println("Subtraction: " + sub.calculate(a,b));
        System.out.println("Multiplication: " + mul.calculate(a,b));
        System.out.println("Division: " + div.calculate(a,b));
    }
}

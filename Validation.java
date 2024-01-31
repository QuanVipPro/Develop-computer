package View;

import java.util.Scanner;
import Controller.Calculator.Operator;

public class Validation {
    
    Scanner sc = new Scanner (System.in);
    public float checkNum(String mess){
        System.out.print(mess);
        while (true) {
            try{
                float result = Float.parseFloat(sc.nextLine());
                return result;
            }catch(NumberFormatException e){
                System.out.println("Please input a number!");
                System.out.print("Enter again: ");
            }
        }
    }
    public Operator checkOp(String operator) {
        switch (operator) {
            case "+":
                return Operator.ADD;
            case "-":
                return Operator.SUBTRACT;
            case "*":
                return Operator.MULTIPLY;
            case "/":
                return Operator.DIVIDE;
            case "^":
                return Operator.EXPONENT;
            case "=":
                return Operator.EQUAL;
            default:
                System.out.println("Please input (+, -, *, /, ^)");
                System.out.print("Enter Operator: ");
                return checkOp(sc.nextLine());
        }
    }
}

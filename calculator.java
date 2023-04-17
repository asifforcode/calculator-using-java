import javax.naming.spi.StateFactory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// making calculator using switch
        System.out.println("Enter first number: ");
        Scanner sc=new Scanner(System.in);
        float a= sc.nextFloat();
        System.out.println("Enter second number: ");
        float b= sc.nextFloat();
        System.out.println("Enter operator: ");
        String operator= sc.next();
        switch (operator){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "%":
                System.out.println(a%b);
                break;
            default:
                System.out.println("Please choose correct operations");

        }

    }
}





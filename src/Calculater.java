import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num1, num2, choice;
        System.out.print("Please Enter number1: ");
        num1= scan.nextInt();
        System.out.print("\nPlease Enter number2:");
        num2 = scan.nextInt();
        System.out.print("\nPlease choose your operation");
        System.out.println("\n1-Addition\n2-Subtraction\n3-Multiplation\n4-Division");
        System.out.println("You are choose: ");
        choice= scan.nextInt();

        if(choice==1){
            System.out.println("Addition: " +(num1+num2));

        }else if(choice==2) {
            System.out.println("Substraction:" + (num1-num2));
        }else if (choice==3) {
            System.out.println("Multiplation:" + (num1*num2));
        }else if(choice==4){
            System.out.println("Division:" + (num1/num2));
            }

        }
    }


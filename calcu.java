import java.util.Scanner;
public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
	addition(num1, num2);
	subtraction(num1, num2);


 }
public static void addition(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
}
public static void subtraction(int num1, int num2){
    int sub = num1 - num2;
    System.out.println("The difference is: " + sub);
}




}


 }

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
	multiplication(num1, num2);
	division(num1, num2);
	modolus(num1, num2);


 }
public static void addition(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
}
public static void subtraction(int num1, int num2){
    int sub = num1 - num2;
    System.out.println("The difference is: " + sub);
}
public static void multiplication(int num1, int num2){
    int multip = num1 * num2;
    System.out.println("The product is: " + multip);
}

public static void division(int num1, int num2){
    int div = num1 / num2;
    System.out.println("The quotient is: " + div);
}
public static void modulus(int num1, int num2){
    int mod = num1 % num2;
    System.out.println("The Modolus is: " + mod);

}



 }

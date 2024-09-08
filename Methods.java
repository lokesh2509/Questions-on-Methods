
/**
 * Methods
 */

import java.util.*;

public class Methods {

    // Question 1: Printing a give name from the user
    public static void printMyName(String str) {
        System.out.println("Hello !!! \n My Name is " + str);
    }

    // Question 2: Make a method for adding 2 numbers and return the sum of those
    // numbers
    public static float sumOfTwoNumbers(float num1, float num2) {
        return num1 + num2;
    }

    // Question 3: Make a method for multiplying 2 numbers and return the product
    public static float productOfTwoNumbers(float num1, float num2) {
        return num1 * num2;
    }

    // Question 4: Factorial of a number
    public static void factorialByNormalMethod(int num) {
        int fact = 1;

        if (num == 0) {
            System.out.println("Factorial of number " + num + " is " + 1);
        } else {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of number " + num + " is " + fact);
        }
    }

    // Question 5: Make a method to check if a number is prime or not.
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Question 6: Make a method to check if a given number n is even or not.
    public static void numberIsEvenOrOdd(int num) {
        if (num < 0) {
            System.out.println("Negative number is Invalid Input");
        } else if (num % 2 == 0) {
            System.out.println("Number is Even");
        } else if (num % 2 != 0) {
            System.out.println("Number is Odd");
        }
    }

    // Question 7: Make a method to print the table of a given number n.
    public static void tableOfNumeber(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    // Question 8:Enter 3 numbers from the user & make a Method to print their
    // average.
    public static float isAverage(float num1, float num2, float num3) {
        return (num1 + num2 + num3) / 3;
    }

    // Question 9: Write a Method to print the sum of all odd numbers from 1 to n.
    public static int sumOfNumbers(int n){
        int min_val = 1;
        int sum = 0;

        for(int i=1; i<=n; i++){
            if (i%2!=0) {
                sum=sum+i;
            }
        }

        return sum;
    }

    // Question 10:Write a Method which takes in 2 numbers and returns the greater
    // of those two.
    public static void isGreater(int num1, int num2){
        System.out.println("The greater number is "+((num1>num2)?num1:num2));
    }

    // Question 11:Write a Method that takes in the radius as input and returns
    // the circumference/perimeter of a circle.
    public static void circumferenceOfCircle(int radius){
        final float pie = 3.14f;
        System.out.println(2*pie*radius);
    }

    // Question 12:Write a Method that takes in age as input and returns if that
    // person is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static String isEligible(int age){
        if (age>=18) {
            return "Eligible to vote";
        }
        else{
            return "Not eligible to vote";
        }
    }

    // Question 13:Write an infinite loop using do while condition.
    public static void infiniteLoop(){
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(true);
    }

    // Question 14:Write a program to enter the numbers till the user wants and at
    // the end it should display the count of positive, negative and zeros entered.
    public static void isPositiveNegativeZero(int num){
        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i=1; i<=num;i++){
            System.out.println("Enter the number: ");
            int user_input = sc.nextInt();

            if (user_input>0) {
                positive++;
            }
            else if(user_input<0){
                negative++;
            }
            else{
                zero++;
            }
        }

        System.out.println("Total Positive Numbers: "+positive);
        System.out.println("Total Negative Numbers: "+negative);
        System.out.println("Total Zeros: "+zero);
    }
    
    // Question 15:Two numbers are entered by the user, x and n. Write a Method to
    // find the value of one number raised to the power of another i.e. xn.
    public static int exponentialNumber(int x, int n){
        int num = 1;
        for(int i=1; i<=n;i++){
            num =  num*x;
        }

        return num;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Question 1:
        printMyName(sc.nextLine());

        // Question 2:
        System.out.println(sumOfTwoNumbers(sc.nextFloat(), sc.nextFloat()));

        // Question 3:
        System.out.println(productOfTwoNumbers(sc.nextFloat(),sc.nextFloat()));

        // QUetion 4:
        System.out.println("Facotrial by normal Method:");
        factorialByNormalMethod(sc.nextInt());

        // Question 5:
        System.out.println(isPrime(sc.nextInt()));

        // Question 6:
        numberIsEvenOrOdd(sc.nextInt());

        // Question 7:
        tableOfNumeber(sc.nextInt());

        //Question 8:
        System.out.println(isAverage(sc.nextFloat(), sc.nextFloat(), sc.nextFloat()));

        //Question 9:
        int n = sc.nextInt();
        System.out.println("The sum of the off number from 1 to "+n+" is "+sumOfNumbers(n));

        //Question 10:
        isGreater(sc.nextInt(),sc.nextInt());

        //Question 11:
        circumferenceOfCircle(sc.nextInt());

        //Question 12:
        System.out.println(isEligible(sc.nextInt()));

        //Question 13:
        infiniteLoop();

        //Question 14:
        System.out.println("How many numbers you want to check?");
        isPositiveNegativeZero(sc.nextInt());

        //Question 15:
        System.out.println("Enter Base value:");
        int Base = sc.nextInt();
        System.out.println("Enter Exponent value:");
        int Exponent = sc.nextInt();
        System.out.println(exponentialNumber(Base, Exponent));;

    }
}
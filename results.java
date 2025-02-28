import java.util.Scanner;
//We import the Scanner class from the java.util package. 
// This class is used to get input from the user. Without this import, we wouldn’t be able to use Scanner
public class Results {
//We define a class named SimpleCalculator. In Java, all code must be inside a class. 
// public means the class is accessible from 
// other parts of the program (though it's not necessary for a simple program like this).
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        // The public keyword means the method is accessible from anywhere. static means this method can be called without creating an instance of the class. void means the method does not return any value. 
        // String[] args is used to pass command-line arguments, though we are not using them here.
        // Prompt the user to enter two numbers
        Scanner scanner = new Scanner(System.in);
        //The main method is the entry point for any Java application. It’s where the program starts running. 
        //We create a new instance of the Scanner class named scanner. 
        // System.in refers to standard input, which is the keyboard in this case. 
        // This means the scanner object will read user input from the console.
        System.out.print("Enter the first number: ");
        //This line prints the prompt "Enter the first number: " to the console without moving to a new line,
        //  so the user can input their first number on the same line.
        double num1 = scanner.nextDouble();
        //The program waits for the user to enter a number. 
        // The nextDouble() method of scanner reads a floating-point number (decimal number) 
        // from the user and assigns it to the variable num1. 
        // The variable num1 is of type double, which allows storing numbers with decimals.
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        //The program waits for the user to input the second number.
        // It uses the nextDouble() method to read the second number and assigns it to the variable num2.
        
        // Perform calculations
        double sum = num1 + num2;
        //We calculate the sum of the two numbers by adding num1 and num2. 
        // The result is stored in the sum variable, which is also of type double
        double difference = num1 - num2;
        //We calculate the difference by subtracting num2 from num1. 
        // The result is stored in the difference variable.
        double product = num1 * num2;
        //We calculate the product by multiplying num1 and num2. 
        // The result is stored in the product variable.
        double quotient = 0;
        //We declare a variable quotient and initialize it to 0. 
        // This will store the result of the division operation later. 
        // We initialize it with 0 in case we need to handle the division by zero scenario.

        // Check if the second number is not zero to avoid division by zero
        if (num2 != 0) {
            //Here, we use an if statement to check if num2 is not equal to zero. 
            // This is to avoid division by zero, which would cause an error. 
            // If num2 is not zero, we perform the division.
            quotient = num1 / num2;
            //If the second number (num2) is not zero, we calculate the quotient by 
            //dividing num1 by num2 and assign the result to the quotient variable.
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
        //If num2 is zero (which we check earlier in line 21), we print an error message: 
        //"Error: Division by zero is not allowed." 
        //This prevents the program from trying to divide by zero and crashing.

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        //This line prints the sum of the two numbers to the console. We use System.out.println 
        // to print the result and move to a new line afterward.
        //  "Sum: " is a string, and sum is the calculated result, so the + operator concatenates them.
        if (num2 != 0) {
            System.out.println("Quotient: " + quotient);
        }

        // Close the scanner
        scanner.close();
    }
}

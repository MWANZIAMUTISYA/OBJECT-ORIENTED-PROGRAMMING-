/*
Name: Mwanzia Mutisya
Reg No: CT101/G/19165/23
Date: 23/01/2025
Calculation of employee bonus
Assignment 2
 */
import java.util.Scanner; //import the scanning utility


public class EmployeeBonus {//declares the class
    public static void main(String[]args){//declares java predefiner main function
        Scanner myOBJ=new Scanner(System.in);//function to allow user navigation

        //user or employee can enter their salary must be an integer
        System.out.print("Enter you salary: ");
        int salary = myOBJ.nextInt();

       //user enters the  integer number of years served
        System.out.print("Enter number of years: ");
        int years = myOBJ.nextInt();


        //initializing the bonus
        double bonus=0;
        //using if else statement to determine the bonus as per employee
        if (years>10){
            bonus=0.12;//bonus increment per service term
        } else if (years>=6 && years <=10) {
            bonus=0.1;
        }else if (years<6){
            bonus=0.08;
        }
        else {
            System.out.println("Invalid Input");
        }
        //initializing the net bonus
        double netbonus;
        netbonus=salary*bonus;
        //print out the employees net bonus
        System.out.println("Your net bonus is: " + netbonus);
        //close scanner
        myOBJ.close();

    }
}
/*Maria Cameleia Danciu
 *Student ID: 21416657
 *Instructor: Dr. Ikram Rehman
 *Date: 10.08.2019
 *This is a BMI(Body Mass Index) program. It calculates the body mass for males and females.
 */
package bmi;
import java.util.Scanner;
//import java.math.RoundingMode;
import java.text.DecimalFormat;

public class BmI {
    public static void main(String[] args) {
        DecimalFormat df2 = new DecimalFormat("#.##");
        String ANSI_RESET = "\u001B[0m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RED = "\u001B[31m";
        
        while(true){     
            System.out.println("\t Hello! Welcome to the BMI calculator! Let's see how fit you are :) ");
            
            Scanner input = new Scanner(System.in); 
            
            System.out.println("1. Please enter your first name.");
            String name = input.next();
        
            System.out.println("2." + name + " are you a male(m) or a female(f)?");
            String gender = input.next();
                
            System.out.println("3." + name +  " please enter your height in meters.");
            Double height = input.nextDouble();
            
            System.out.println("4." + name + " please enter your weight in kilograms.");
            Double weight = input.nextDouble();
        
            Double bmi = weight/Math.pow(height,2);   
            //df2.setRoundingMode(RoundingMode.UP);        
            System.out.println("Your BMI is:");
            System.out.println(df2.format(bmi));  
        
            if(gender.equals("m") ||gender.equals("M") || gender.equals("male")){ 
                if(bmi < 20.7){
                    System.out.println(ANSI_RED + "You are underweight mate." + ANSI_RESET);
                }
                else if(bmi > 20.7 && bmi < 26.4) {
                    System.out.println(ANSI_GREEN + "Well done " + name + "! Your weight is healhty! Yaaay!" + ANSI_RESET);
                }
                else{
                    System.out.println(ANSI_RED + "Sorry " + name + ", you are overweight!" + ANSI_RESET);
                }            
            }
            else{
                if(bmi < 19.1){
                    System.out.println(ANSI_RED + "Sorry " + name + " apparently you are underweight." + ANSI_RESET);
                }
                else if(bmi > 19.1 && bmi < 25.8) {
                    System.out.println(ANSI_GREEN + "Well done " + name + "! Your weight is healhty! Yaaay!" + ANSI_RESET);
                }
                else{
                    System.out.println(ANSI_RED + "Sorry " + name + ", you are overweight!" + ANSI_RESET);
                }
            }        
        }
    }            
}
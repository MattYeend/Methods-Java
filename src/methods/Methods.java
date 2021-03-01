/*
Methods
 */
package methods;

import java.util.Scanner;

public class Methods {

    //Smallest class - Find smallest out of three numbers
    public static double smallest(double x, double y, double z){
        return Math.min(Math.min(x, y), z);
    }
    
    //average class - Find average out of three numbers
    public static double average(double x, double y, double z){
        return (x + y + z)/3;
    }
    
    //sumDigits class - Compute the sum of digits into an integer
    public static int sumDigits(long n){
        int result = 0;
        while(n>0){
            result += n % 10;
            n /= 10;
        }
        return result;
    }
    
    //getPentgonalNumber class - Display the first 50 pentangonal numbers
    public static int getPentagonalNumber(int i){
        return(i * (3 * i - 1)) / 2;
    }
    
    //futureInvestmentValue class - Compare future investement value at given interest rate for specified number of years
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
    
    //printMatrix class - Display an n-by-n matrix
    public static void printMatrix(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        //Find smallest number out of three
        System.out.println("Finds smallest number out of three");
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The smallest number is: " + smallest(x, y, z) + "\n");
        
        //Find average of three numbers
        System.out.println("Find average of three numbers");
        System.out.print("The average number is: " + average(x, y, z) + "\n");
        System.out.println("");
        
        //Compute the sum of digits into an integer
        System.out.println("Compute the sum of digits into an integer");
        System.out.print("Input an integer: ");
        int digits = in.nextInt();
        System.out.println("The sum of the digits is: " + sumDigits(digits) + "\n");
        
        //Display the first 50 pentangonal numbers
        System.out.println("Display the first 50 pentagonal numbers");
        int count = 1;
        for(int i = 1; i <=50; i++){
            System.out.printf("%-6d", getPentagonalNumber(i));
            if(count % 10 == 0) System.out.println();
            count++;
        }
        System.out.println("");
        
        //Compare future investement value at given interest rate for specified number of years
        System.out.println("Compare future investement value at given interest rate for specified number of years");
        /*
        Already defined
        Scanner in = new Scanner(System.in);
        */
        System.out.print("Input the investment amount: ");
        double investment = in.nextDouble();
        System.out.print("Input the rate of interest: ");
        double rate = in.nextDouble();
        System.out.print("Input the number of years: ");
        double year = in.nextDouble();
        rate *= 0.01;
        System.out.println("Years   FutureValue");
        for(int i = 1; i <= year; i++){
            int formatter = 19;
            if(i >= 10) formatter = 18;
            System.out.printf(i + "%" + formatter + ".2f\n", futureInvestmentValue(investment, rate/12, i));
        }
        System.out.println("");
        
        //Display an n-by-n matrix
        System.out.println("Display an n-by-n matrix");
        System.out.print("Input a number: ");
        int n = in.nextInt();
        printMatrix(n);
    }
}

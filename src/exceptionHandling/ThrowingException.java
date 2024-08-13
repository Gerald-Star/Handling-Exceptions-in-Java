package exceptionHandling;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowingException {
    public static double calculatePay(double hours, double payRate) 
    throws NegativeInputException {
        if(hours > 40) {
            throw new IllegalArgumentException("Overtime is not allowed.");
        }
        else if (hours < 0 || payRate < 0){
            throw new NegativeInputException();
        }
        return hours * payRate;
    }

    public static void rethrowException() throws IOException {
        File file = new File(pathname: "nonexistent.txt");
        file.createNewFile();
    }

    public static void rethrowMultipleException() 
    throws IOException, InputMismatchException {
        File file = new File(pathname: "nonexistent.txt");
        file.createNewFile();
    }

    //  Polymorphic Exception Handling throws statement
    public static void rethrowExceptions() throws Exception{
        File file = new File(pathname: "nonexistent.txt");
        file.createNewFile();
        Scanner fileReader = new Scanner(file);

    }
}

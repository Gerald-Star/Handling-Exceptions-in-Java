package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandling {
  public static void main(String[] args) {
    try {
      File file = new File("numbers.txt");
      Scanner fileReader = new Scanner(file);
      while (fileReader.hasNext()) {
        System.out.println(fileReader.nextDouble());
      }
      //fileReader.close();
    } catch (FileNotFoundException | InputMismatchException e) {
      System.out.println(e.getMessage());

    } catch (Exception e) { // This is the last exception to be caught
      System.out.println("Something went wrong.");
    } finally {
      System.out.println("The 'try catch' is finished.");

    }
  }
}

// ? Catch Multiple with Single Block 
// e.printStackTrace() method
// The printStackTrace() method in Java is a tool used to handle exceptions and errors.
// It is a method of Java's throwable class which prints the throwable along with other details like the line number and class name where the exception occurred.
// The printStackTrace() method is used to print the stack trace of the exception to the console.

/*
 * 
 * try {
 * Scanner fileReader = new Scanner(arrays);
 * while (fileReader.hasNext()) {
 * System.out.println(fileReader.nextDouble());
 * }
 * }catch (FileNotFoundException | InputMismatchException  e) {
 * e.printStackTrace();
 * }
 */
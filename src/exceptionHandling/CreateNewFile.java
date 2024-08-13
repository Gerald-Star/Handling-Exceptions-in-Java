package exceptionHandling;

// ? Exception handling is a way to handle runtime errors. 
import java.io.File;
import java.io.IOException;

public class CreateNewFile {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\MyName\\filename.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}


/* It is mainly used to handle exceptions that can occur during the execution of a program and to 
take appropriate action rather than halting the program.
 
The Java throws keyword is used to declare an exception. 
It gives an information to the programmer that there may occur an exception 
so it is better for the programmer to provide the exception handling code so that normal flow can be maintained.

Use cases of Exception Handling in Java:

1. To maintain normal flow of the application.
2. To handle the runtime errors.
3. To provide meaningful error messages to the user.
4. To avoid abrupt termination of the application.

*/

// ? Checked vs Unchecked Exceptions

/* 
* Checked exceptions are checked at compile-time. 
It means if a method is throwing a checked exception then 
it should handle the exception using try-catch block or 
it should declare the exception using throws keyword, 
        otherwise the program will give a compilation error.

For example, IOException is a checked exception.

? Unchecked Exception
 * Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
 * These are also called as Runtime Exceptions.
It means if your program is throwing an unchecked exception and even 
if you didn't handle/declare that exception, the program won't give a compilation error.
For example, ArithmeticException is an unchecked exception.

Example of UnChecked Exception:

int a = 50/0; //ArithmeticException

Scanner sc = new Scanner(System.in);

int i = sc.nextInt(); //InputMismatchException

int[] arr = new int[5];

System.out.println(arr[7]); //ArrayIndexOutOfBoundsException

String s = null;

double input = console.readDouble(); //NullPointerException

double input = console.nextDouble(); //NullPointerException

There classes are in the java.lang package.

There are classes in the java.util package that are also unchecked exceptions.

There are classes ib the Java that are called run-time exceptions


* Three ways to Handling Multiple Exceptions

? 1. Polymorphism in Exception Handling
The catch block that catches the exception is not compatible with the exception 
type thrown by the try block. Especially when the try block throws multiple exceptions and 
you are not sure which exception will be thrown.

Using super class as a way to handle multiple exceptions.
Example: Class ArrayIndexOutOfBoundsException is a subclass of IndexOutOfBoundsException.

java.lang.Throwable
java.lang.Exception
java.lang.RuntimeException
java.lang.Error

? 2. The order of Multiple Catch blocks

 A catch block that catches the exception must be above the catch block 
that catches the exception.

 If the catch block that catches the exception is below the catch block 
that catches the exception, it will give a compilation error.

 If the catch block that catches the exception is above the catch block 
that catches the exception, it will give a compilation error.

? 3. Catch Multiple in single blocks







*/

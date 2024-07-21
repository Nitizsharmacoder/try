package com.nitiz.Exception;



import com.nitiz.oop.Book;



import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
public class CheckedException {
    // CompileTime Exceptions are checked exceptions: java enforces us to implements
    // exception handling during compile time

    public static void main(String[] args) {
        try{
            // open resources
            Class c = Class.forName("com.siris.oop.Book");  // Loading a class
            // read / write from resource during which exception occurs

            Constructor con = c.getDeclaredConstructor();
            Book book = (Book) con.newInstance();   // creates object using default constructor

            book.setIsbn(123131);
            book.setTitle("Glory");
            book.setAuthor("Paul");
            book.setPrice(1200.00);
            System.out.println(book);

            // close resources which may be skipped when exception occurs
        }catch (ClassNotFoundException e){
            System.out.println("Exception occured: "+ e);
        } catch (NoSuchMethodException e) {
            System.out.println("Exception: "+ e.getMessage());
        } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
            System.out.println("Exception: "+ e.getMessage());
        } catch (Exception e){
            System.out.println("Exception: "+ e.getMessage());
        }
        finally {
            // optional block
            System.out.println("Finally block");
            // to close resources which is always executed
        }

        System.out.println("Program ends normally");
    }
}

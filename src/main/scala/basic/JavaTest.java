package scalaexcercise.basic;

public class JavaTest {
    public static void main(String args[]) {

        // Creating object of class in main() method
        JavaTest t = new JavaTest();

        // Trying to call above functions of class where
        // Error is thrown as this class is inheriting
        // multiple classes
       // t.fun();
    }
}

//  Class 1
// First Parent class
class Parent1 {

    // Method inside first parent class
    void fun() {

        // Print statement if this method is called
        System.out.println("Parent1");
    }
}
// Class 2
// Second Parent Class
class Parent2 {

    // Method inside first parent class
    void fun() {

        // Print statement if this method is called
        System.out.println("Parent2");
    }
}
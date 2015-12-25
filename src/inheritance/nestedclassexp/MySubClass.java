package inheritance.nestedclassexp;

/**
 * @author rimon mostafiz (ferary.rimon@gmail.com)
 */
public class MySubClass extends MyClass {
    public static void main(String[] args) {
        MySubClass subClass = new MySubClass();
        MyNestedClass nestedClass = subClass.new MyNestedClass();
        /*
         it is possible to create an instance of the nested class MyNestedClass
         which is defined in the superclass (MyClass) via a reference to the subclass (MySubclass).
         */
    }
}

package Task;


public class helloworld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // This will print "Hello, World!" to the console
        System.out.println(1+2+3); // This will print 6 because all are numbers and added together
        System.out.println(1+'2'+3);/*2 is consider ss character so convert into ASCII value */
        System.out.println(1 + 2 + "3"); // This will print "33" because 1 and 2 are added first
        System.out.println("1" + 2 + 3); // This will print "123" because "1" is a string, so concatenation occurs
        System.out.println("1" + '2' + 3); // This will print "123" because "2" is a string, so concatenation occurs
        
    }
}
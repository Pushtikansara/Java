package Task;


public class helloworld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // This will print "Hello, World!" to the console
        System.out.println(1+2+3); // This will print 6 because all are numbers and added together
        System.out.println(1+'2'+3);/*2 is consider ss character so convert into ASCII value */
        System.out.println(1 + 2 + "3"); // This will print "33" because 1 and 2 are added first
        System.out.println("1" + 2 + 3); // This will print "123" because "1" is a string, so concatenation occurs
        System.out.println("1" + '2' + 3); // This will print "123" because "2" is a string, so concatenation occurs
        int num=0x7E;
        System.out.println(num); // This will print 120000000000 because 12e10 is scientific notation for 12 * 10^10
        //byte b = 127;
        int b=12;//this is in range of byte
        byte c=(byte)b; 
        System.out.println(c); // This will print 12 because byte can be implicitly converted to

        int a=257;//out of range
        byte k =(byte)a;
        System.out.println(k); 
        byte d=30;
        byte e=40;
        int f=d*e;
         System.out.println(f); 
    }
}
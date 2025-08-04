// File: Institute.java
package lab;

public class Institute {
    int idcode = 0;
    public static String iname = "CSPIT"; // default institute name
    public final String location = "CHARUSAT";

    public Institute() {
        System.out.println("Welcome to " + iname);
    }

    public Institute(int idcode, String iname) {
        this.idcode = idcode;
        Institute.iname = iname;
    }

    public static void changeInst(String name) {
        iname = name;
    }
}

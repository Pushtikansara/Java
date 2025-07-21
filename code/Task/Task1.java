package Task;

public class Task1 {
      public static void main(String[] args) {
          String str1 = "Pushti";
         // str1 = "Kansara";
          System.out.println(str1);

     
      String str2=new String("Pushti");
        
            System.out.println(str2);
            System.out.println(str1 == str2);// false because str1 is in string pool and str2 is in heap memory
            System.out.println(str1.equals(str2));// true because content is same
            System.out.println(str1.intern() == str2.intern());// true because both strings are interned to the same string pool
            System.out.println(str1.length());
            System.out.println(str1.charAt(2)); // start from 0, so index 2 is the third character
            System.out.println(str1.indexOf("s"));
            System.out.println(str1.lastIndexOf("s"));// last occurrence of 's'
            System.out.println(str1.substring(1, 4)); // from index 1 to index 3

        }
    
}

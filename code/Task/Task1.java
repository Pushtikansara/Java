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
            String str3=" Pushti Kansara";
            System.out.println(str3.contains("Kansara"));
            System.out.println(str3.toUpperCase());
            System.out.println(str3.toLowerCase());
            System.out.println(str3.equalsIgnoreCase("pushti kansara"));
            System.out.println(str3.trim());
            System.out.println(str3.replace("Pushti", "Kansara"));
            System.out.println(str3.replaceAll("a", "i"));// replace all occurrences of "a " with "i"
            System.out.println(str3.split(" ")); // splits the string by space and returns an
            StringBuffer strBuffer = new StringBuffer("Mahek Patel ");
            strBuffer.append("Shah");
            System.out.println(strBuffer);
            strBuffer.insert(6, "Kumar ");
            System.out.println(strBuffer);
            strBuffer.delete(6, 12);
            System.out.println(strBuffer);
            strBuffer.reverse();
            System.out.println(strBuffer); 
        }
    
}

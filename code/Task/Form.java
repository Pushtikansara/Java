package Task;

public class Form {     
            
    public static void main(String[] args) {
        // This class is currently empty, you can add functionality as needed.
       String pattern ="[a-zA-Z]+";
       String fname = "PushtiKansara";
       System.out.println(fname.matches(pattern));
       String pincode ="[0-9]{6}+";
       String pin = "36200";
      if(pin.matches(pincode)){
           System.out.println("Valid Pincode");
       }else{
           System.out.println("Invalid Pincode");
       }
       String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
       String email = "1pushtikansara@gmail.com";
       if(email.matches(emailPattern)){
           System.out.println("Valid Email");
       }else{
           System.out.println("Invalid Email");
       }
    }
    
}

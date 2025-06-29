package Task;
class sumofnum{
    int n;
    sumofnum(int num) {
        n = num;
    }
    int calculateSum() {
        return (n * (n + 1)) / 2;
    }

}

public class sum {
    public static void main(String[] args) {
        int number = 10; // Example number
        sumofnum sumObj = new sumofnum(number);
        int result = sumObj.calculateSum();
        System.out.println("The sum of the first " + number + " natural numbers is: " + result);

        
    }
   
    
    
}

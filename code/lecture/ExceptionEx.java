package lecture;
class myException extends Exception{
    int age;
    public void setAge(int a){
        age=a;
        if(age<18){
            try{
                throw new myException();
            }
            catch(myException e){
                System.out.println("You are not eligible for licence");
            }
        }
        else if(age>=60){
            try{
                throw new myException();
            }
            catch(myException e){
                System.out.println("Now you don't need licence");
            }
        }
        else{
            System.out.println("You are eligible for licence");
        }
    }


}

public class ExceptionEx {
    public static void main(String[] args) {
        myException obj=new myException();
        obj.setAge(15);
        obj.setAge(90);
        obj.setAge(52);
    }

    
}

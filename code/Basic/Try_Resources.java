package Basic;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Try_Resources {
    public static void main(String a[]) throws IOException {
        int num =0;
    try(BufferedReader bf=new BufferedReader((new InputStreamReader(System.in)))){
        num=Integer.parseInt(bf.readLine());
        System.out.println(num);

    }
}
    
}

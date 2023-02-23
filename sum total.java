import java.util.Scanner;

public class projet{
     public static void main(String[] args) {
        int sum=0;
        Scanner scanner =new Scanner(System.in);
        for(int i=0;i<5;i++){
            int input =scanner.nextInt();
            sum=input+sum;}
        System.out.print(sum);    
    }


 }

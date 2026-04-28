import java.util.Scanner;

public class Asg2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = scanner.nextInt();
        if(num<0){
            System.out.print("number is negative\n" );
        }
        else if(num>0){
            System.out.print("number is positive\n");
        }
        else{
            System.out.print("number is zero\n");   
        }

        if(num%5 == 0){
            System.out.print("number is multiple of 5\n");
        }
        else{
            System.out.print("number is not a multiple of 5\n");

        }
        int count = 0;
        int temp = num;
        while(temp != 0){
            temp = temp/10;
            count ++;
        }
        if(num==0){
            count = 1;
        }
        System.out.print(count+ "\n");
        if(count==3){
            System.out.print("number is three digit\n");

        }
        else{
            System.out.print("number is not three digit\n");
            
        }
        

    }
}
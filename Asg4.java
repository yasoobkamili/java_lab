import java.util.Scanner;

public class Asg4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter two digit number: ");
        int num = scanner.nextInt();
        if(num<10 || num>99){
            System.out.print("Invalid input!!\n");
        }
        else{
            int onesDigit = num%10;
            int tensDigit = num/10;
            int sum = onesDigit + tensDigit;
            int product = onesDigit * tensDigit;
            int finalNum = sum + product;
            if(finalNum == num){
                System.out.print("number is special!!\n");
            }
            else{
                System.out.print("number is not special!!\n");
                
            }

        }

    }
}
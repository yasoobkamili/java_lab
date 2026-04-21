import java.util.Scanner;

public class Asg1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a 5 digit number: ");
		int num = scanner.nextInt();
		if(num<10000 || num >99999){
			System.out.print("Wrong input!! \n");
		}
		else{
		
			int oddSum = ((num/10000)%10) + ((num/100)%10) + (num%10);
			int evenSum = ((num/1000)%10) + ((num/10)%10);
			System.out.print("sum of numbers at even positions: "+ evenSum + "\n");
			System.out.print("sum of numbers at odd positions: "+ oddSum + "\n");
			int diff = evenSum - oddSum;
			if(diff<0){
				diff = -diff;
			}
			System.out.print("difference: "+ diff + "\n");


			
		}
		
	}
}

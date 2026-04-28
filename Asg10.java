//  Write a Java program to search for a given element in a onedimensional array and display its position(s) if found.
import java.util.Scanner;

public class Asg10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,5,6,756,8,54,2,34,2,56,75,9,8};
        System.out.println("Enter target:");
        int target = sc.nextInt();
        int flag = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == target){
                System.out.print(arr[i]+" found at position " + i);
                flag = 1;
            }
        }
        System.out.print("\n");
        if(flag==0){
            System.out.println("\nTarget not found.");
        }
    }
}
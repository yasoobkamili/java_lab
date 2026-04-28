// Write a Java program to read n elements in a onedimensional array and display the elements in reverse order and count the number of even and odd elements. 
import java.util.Scanner;

public class Asg9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int even = 0;
        System.out.println("enter elements:");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0){
                even++;
            }
        }
        System.out.println("no of even elements: "+even +"\n"+"no of odd elements: "+ (size-even) );
        for(int i=size-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        
    }
}

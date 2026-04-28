// Write a Java program to read two one-dimensional arrays and merge them into a single array, then display the merged array in sorted order.  
import java.util.Scanner;
import java.util.Arrays;

public class Asg11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array:");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for(int i = 0; i<size1;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter size of second array:");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for(int i = 0; i<size2;i++){
            arr2[i] = sc.nextInt();
        }

        int size = size1 +size2;
        int[] arr = new int[size];
        for(int i = 0; i<size1;i++){
            arr[i] = arr1[i];
        }
        for(int i = size1; i<size;i++){
            arr[i] = arr2[i-size1];
        }
        System.out.println(Arrays.toString(arr1) + " + " + Arrays.toString(arr2) + " = " + Arrays.toString(arr) );
    }
}
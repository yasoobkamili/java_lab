import java.util.Scanner;
import java.util.Arrays;
public class Asg8{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter no of elements");
    int size = sc.nextInt();
    int min=0,max=0;
    int sum = 0;
    int[] arr;
    arr = new int[size];

    System.out.println("enter elements");
    for(int i = 0; i<size; i++){
      arr[i] = sc.nextInt();
      sum += arr[i];
      if(i == 0){
        max = arr[i];
        min = arr[i];
      }
      else if(arr[i]>max){
        max = arr[i];
      }
      else if(arr[i]<min){
        min = arr[i];
      }
    }
    double avg = (double)sum/size;
    System.out.println("Array:"+Arrays.toString(arr)+"\nSum: "+sum+"\nMin: "+min+"\nMax: "+max+"\nAverage: "+avg);
  }
}
// Write a Java program that counts how many times each digit appears in a
// number.
import java.util.Scanner;

public class Asg6{
    public static void main(String[] args){
        int num = 12312021;
        int[] digitCount = new int[10];
        String temp = Integer.toString(num);
        for(int i = 0 ; i<temp.length();i++){
            int obs = Character.getNumericValue(temp.charAt(i));
            digitCount[obs]++;
        }
        for(int i = 0; i<10; i++){
            System.out.println("("+ i +","+digitCount[i]+")");

        }

    }
}
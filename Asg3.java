import java.util.Scanner;

public class Asg3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your salary in rupees: ");
        int basic = scanner.nextInt();
        double hra =0.3 * basic;
        if(basic<=20000){
            hra = 0.2 * basic;
        }
        System.out.print("HRA = " + hra + "\n");

        double da = 0.8*basic;
        System.out.print("DA = " + da + "\n");

        double grossSalary = basic + hra +da;
        System.out.print("Gross Salary = " + grossSalary + "\n");
        
        double tax = 0;
        if(grossSalary>50000){
            tax = 0.1*grossSalary;
        }
        System.out.print("Tax = " + tax + "\n");

        double netSalary = grossSalary + tax;
        System.out.print("Net Salary = " + netSalary + "\n");



       
        

    }
}
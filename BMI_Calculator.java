//BMI CALCULATOR
import java.util.Scanner;
public class BMI_Calculator {
    public static void main(String args[]) {
        float weight;
        float height;
        double BMI;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight(in kg): ");
        weight = sc.nextFloat();
        System.out.print("Enter your height(in meters): ");
        height = sc.nextFloat();
        BMI = weight/(height*height);
        System.out.println("Your BMI is "+BMI);
        if(BMI < 18.5) {
            System.out.println("You are UnderWeight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("You are normal weight");
            
        } else if(BMI >= 25 && BMI <= 29.9) {
            System.out.println("you are Overweight");
        } else  {
            System.out.println("you are obese.");
            
        }
        
    }
    
}

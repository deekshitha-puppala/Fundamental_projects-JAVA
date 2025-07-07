//MULTIPLICATION OF THE TABLE
import java.util.*;
public class Multiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter number: ");
        number = sc.nextInt();
        for(int i=1;i<11;i++) {
            System.out.print(number+ "X" + i + "=" + (number*i));
            System.out.println();
        }
        
    }
}

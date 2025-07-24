
import java.util.*;
public class GroceryList{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <String> GroceryList = new ArrayList<>();
        int choice = 0;

        do { 
            System.out.println("1. Add Item\n2. View Item\n3. Remove Item\n4. Clear Items\n5.Exit");
            System.out.print("Enter your Choice: ");
           

            try {
                choice = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1: 
                    System.out.println("Enter item name: ");
                    String item = scan.nextLine();
                    GroceryList.add(item);
                    System.out.println(item + " " + "Added.");
                    System.out.println();
                    break;
                    
                case 2:          
                    System.out.println("Grocery List: ");
                    if (GroceryList.isEmpty()) {
                        System.out.println("List is empty.");
                    } else {
                        for (int i = 0; i < GroceryList.size(); i++) {
                            System.out.println((i + 1) + ". " + GroceryList.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter item number to remove: ");
                    try {
                        int removeIndex = Integer.parseInt(scan.nextLine()) - 1;
                        if (removeIndex >= 0 && removeIndex < GroceryList.size()) {
                            String removedItem = GroceryList.remove(removeIndex);
                            System.out.println("'" + removedItem + "' removed.");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;
                case 4:
                    GroceryList.clear();
                    System.out.println("List Cleared.");
                    System.out.println();
                    break;
                case 5: 
                    System.out.println("Exited..");
                    break;

                default:
                    System.out.println("Enter valid choice");
            }
            
        } 
        while (choice != 5);
        
            scan.close();
    }
}
    

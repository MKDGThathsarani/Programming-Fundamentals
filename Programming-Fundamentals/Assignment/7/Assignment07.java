import java.util.Scanner;
import java.util.ArrayList;

public class Assignment07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> clothingIDs = new ArrayList<>();
        
        while(true) {
            System.out.print("Enter Clothing ID (1-1000, -1 to exit): ");
            int id = input.nextInt();
            
            if(id == -1) break;
            
            if(id < 1 || id > 1000) {
                System.out.println("Invalid ID! Must be between 1-1000");
                continue;
            }
            
            if(clothingIDs.contains(id)) {
                System.out.println("Duplicate element! ID " + id + " already selected.");
            } else {
                clothingIDs.add(id);
                System.out.println("ID " + id + " added.");
            }
        }
        
        System.out.println("\nSelected Clothing IDs:");
        System.out.println(clothingIDs);
        
        // Convert to array if needed
        Integer[] idArray = clothingIDs.toArray(new Integer[0]);
    }
}

import java.util.*;
class Example{
   public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number: ");
        int Number = input.nextInt();
        
        switch (Number){  
            case 1:
                System.out.println("Enter 1 for DecimalToBinary");
                break;
            case 2:
                System.out.println("Enter 2 for DecimalToOctal");
                break;
            case 3:
                System.out.println("Enter 3 for DecimalToHexa");
                break;
            case 99:  
                System.out.println("Enter 99 for Exit");
                break; 
            default:
                System.out.println("Invalid Number");
        }  
        
        System.out.println("Select the convertor: ");
   }
}


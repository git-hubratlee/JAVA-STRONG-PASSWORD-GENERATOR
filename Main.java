import java.util.*;

class Main {
    public static void main(String[] args) {
        Random rand = new Random(); //Creating Random Object.
        Scanner sc = new Scanner(System.in); //Creating Scanner for input for User.
        
        System.out.print("Enter the length of your password: "); //User Enters Preffered Length Of Password.
        int length = sc.nextInt();
        
        String poss = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890~!@#$%^&*?/"; //The possibility out of which Strong Password is Generated.
        
        System.out.print("Your Generated Strong Password Is: ");
        for (int i = 0; i < length; i++) {
            int randomIndex = rand.nextInt(poss.length()); //Changes Alphabetical Value to Numeric
            char randomChar = poss.charAt(randomIndex); //Changes Numeric Value Back to Alphabetical.
            System.out.print(randomChar); // Prints the Password.
        }
        
        sc.close();
        }
}

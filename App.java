import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


 public  class  App {
    public static void main(String[] args) {


         Scanner aScanner = new Scanner(System.in);
         String plainText;
         int shiftKey;

         System.out.println("Please enter message to be encrypted: ");
         plainText = aScanner.nextLine();

         System.out.println("Please enter shift key ");
         shiftKey = aScanner.nextInt();

         System.out.println("The Encrypted Text: " + EncryptedText (plainText,shiftKey));


     }
 }
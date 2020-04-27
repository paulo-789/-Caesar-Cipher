 import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      System.out.println("WELCOME TO THE SYSTEM OF CEASAR!");
      while (true) {
           System.out.println("CHOSE :ENCRYPTION,Decryption");
           String navigationchoice = input.nextLine().toLowerCase();
            if (navigationchoice.equals("ENCRYPTION")) {
                System.out.println("Enter text to be encrypted: ");
                String plainText = input.nextLine().toLowerCase();
                System.out.println("Enter the shift value: ");
                int shiftValue = input.nextInt();
                CaesarCipher message = new CaesarCipher(plainText, shiftValue);
                System.out.println("Plain Text: " + message.getPlainText() + "\n Shift key: " + message.getShiftKey());
                System.out.println("Encrypted Text: " + message.EncryptText());

            } else if (navigationchoice.equals("Decryption")) {
                System.out.println("Enter text to be decrypted: ");
                String encryptedText = input.nextLine().toLowerCase();
                System.out.println("Enter the shift value: ");
                int reverseShiftValue = input.nextInt();
                CaesarCipher encryptText = new CaesarCipher(encryptedText, reverseShiftValue);
                System.out.println("Decrypted Message: " + encryptText.DecryptText());
                break;
            } else {
                System.out.println("Invalid choice. Try Again");
            }


        }
    }
}

 import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE SYSTEM OF CEASAR!");
        System.out.println("CHOSE:ENCRYPTION,Decryption");
        Scanner input = new Scanner(System.in);
        String navigationchoice = input.nextLine();
           System.out.println("CHOSE 1 ENCRYPTION,Decryption");
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
            } else {
                System.out.println("Invalid choice. Try Again");
            }


        }
    }


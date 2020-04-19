package models;

public class Caesar {
    public static String EncryptText(String message, int shiftKey) {
        //c(x) =  x + shiftKey Mod(%) 26;
        final String ALPAHABETS = "abcdefghijklmnopqrstuvwxyz";
        message = message.toLowerCase();

        StringBuilder cyperText = new StringBuilder();

        for(int counter = 0;counter < message.length();counter++) {
            if(!Character.isLetter(message.charAt(counter))) {
                cyperText.append(message.charAt(counter));
            }
            else {
                int charPosition = ALPAHABETS.indexOf(message.charAt(counter));
                int keyValue = (charPosition + shiftKey) % 26;

                char cyperValue = ALPAHABETS.charAt(keyValue);

                cyperText.append(cyperValue);
            }
        }

        return cyperText.toString();
    }

}

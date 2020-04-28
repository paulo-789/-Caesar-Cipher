public class CaesarCipher {
    private String plainText;
    private int shiftKey;

    public CaesarCipher(String plainText,int shiftKey) {
        this.plainText = plainText;
        this.shiftKey = shiftKey;
    }

    public String getPlainText() {
        return this.plainText;
    }
    public int getShiftKey() {
        return this.shiftKey;
    }

    public String EncryptText() {
        StringBuilder cyperText = new StringBuilder();
        for(char character : plainText.toCharArray()){
            if (character !=' '){
                int asciiPosition = character - 'a';
                int newPosition = (asciiPosition + shiftKey) % 26;
                char newCharacter = (char) ('a' + newPosition);
                cyperText.append(newCharacter);
            }
            else {
                cyperText.append(character);
            }
        }

        return cyperText.toString();
    }
    public  String DecryptText() {
        int reverseShift = 26 - (shiftKey % 26);
        StringBuilder cyperText = new StringBuilder();
        for(char character : plainText.toCharArray()) {
            if (character !=' '){
                int asciiPosition = character - 'a';
                int newPositon =(asciiPosition + reverseShift) % 26;
                char newCharacter = (char) ('a' + newPositon);
                cyperText.append(newCharacter);
            }else {
                cyperText.append(character);

            }
        }

        return cyperText.toString();

    }

}

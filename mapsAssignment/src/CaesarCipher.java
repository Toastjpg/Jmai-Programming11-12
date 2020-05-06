import java.util.LinkedHashMap;

public class CaesarCipher {
    private String message;
    private int shift;
    private String encryptedMessage = "";
    private String decryptedMessage = "";
    /*private String intmapstring = "";
    private String charmapstring = "";*/


    private LinkedHashMap<Character, Integer> integerLinkedHashMap = new LinkedHashMap<>();
    private LinkedHashMap<Integer, Character> characterLinkedHashMap = new LinkedHashMap<>();
    private Character[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    CaesarCipher(String message, int shift) {
        this.message = message;
        this.shift = (shift%26);

        //puts all char of alphabet into two maps
        for (int i = 1; i<27; i++){
            integerLinkedHashMap.put(alphabet[i-1], i);
            characterLinkedHashMap.put(i, alphabet[i-1]);
        }
        //edge case
        integerLinkedHashMap.put('z', 0);
        characterLinkedHashMap.put(0, 'z');
    }

    //encrypts message with a shift
    public String encrypt(){
        for (int i = 0; i < message.length(); i++){
            encryptedMessage += characterLinkedHashMap.get(((integerLinkedHashMap.get(message.charAt(i)) + shift)%26));
        }
        return encryptedMessage;
    }

    //decrypts message with a shift
    public String decrypt(){
        for (int i = 0; i < message.length(); i++){
            if(((integerLinkedHashMap.get(message.charAt(i)) - shift)%26) <= 0) {
                decryptedMessage += characterLinkedHashMap.get(((integerLinkedHashMap.get(message.charAt(i)) - shift) % 26) + 26);
            }
            else{
                decryptedMessage += characterLinkedHashMap.get(((integerLinkedHashMap.get(message.charAt(i)) - shift)%26));
            }
        }
        return decryptedMessage;
    }

    /*public String returnintmap(){
        for (int i = 0; i < integerLinkedHashMap.size(); i++){
            intmapstring += integerLinkedHashMap.get(alphabet[i]);
        }
        return intmapstring;
    }

    public String returncharmap(){
        for (int i = 0; i < characterLinkedHashMap.size(); i++){
            charmapstring += characterLinkedHashMap.get(i);
        }
        return charmapstring;
    }*/
}

public class Main {
    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher("hello", 3);
        System.out.println(caesarCipher.encrypt());
        CaesarCipher caesarCipher2 = new CaesarCipher("khoor", 3);
        System.out.println(caesarCipher2.decrypt());
    }
}

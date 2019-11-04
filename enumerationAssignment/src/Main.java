public class Main {
    public static void main(String[] args) {
        EnumTest enumTest = new EnumTest(Rainbow.RED);
        EnumTest enumTest1 = new EnumTest(Rainbow.BLUE);
        enumTest.printColor();
        enumTest1.printColor();
    }
}

public class Main {
    public static void printMove(int n, int from, int to){
        System.out.println("From: " + from + " To: " + to);
    }

    public static void hanoi (int n, int from, int to, int spare){
        if (n == 1){
            printMove(n, from, to);
        }
        else{
            hanoi(n-1, from, spare, to);
            hanoi(1, from, to, spare);
            hanoi(n-1, spare, to, from);
        }
    }
    public static void main(String[] args) {
        hanoi(3,1,3,2);
    }
}

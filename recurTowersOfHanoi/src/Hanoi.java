public class Hanoi {
    public String Hanoi (int n, int from, int to, int spare){
        if (n == 1){
            System.out.println("Plate " + n + " From " + from + " To " + to);
        }
        else{
            Hanoi(n-1, from, spare, to);
            System.out.println("Plate " + n + " From " + from + " To " + to);
            Hanoi(n-1, spare, to, from);
        }
        return "Done";
    }
}

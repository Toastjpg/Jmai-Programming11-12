import java.util.ArrayList;

public class IntegerSet {
    ArrayList numbers = new ArrayList();

    //Requires: int
    //Modifies: this
    //Effects: inserts integer into set unless it's already there, in which case it does nothing
    public void insert(Integer num) {
        if (contains(num) == false) {
            numbers.add(num);
        }
    }

    //Requires: int
    //Modifies: this
    //Effects: if the integer is in the set remove it, otherwise do nothing
    public void remove(Integer num) {
        if (contains(num) == true) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i).equals(num)) {
                    numbers.remove(i);
                }
            }
        }
    }

    //Requires: int
    //Modifies: this
    //Effects: returns numbers ArrayList size
    public int size () {
        return numbers.size();
    }

    //Requires: int
    //Modifies: this
    //Effects: return true if the set contains the int, otherwise return false
    public boolean contains (int i){
        for (int x = 0; x < numbers.size(); x++) {
            if (numbers.get(x).equals(i)) {
                return true;
            }
        }
        return false;
    }
}

import java.util.List;

/**
 * This class holds a list of lists that can be combined, discarded or mutated
 *
 * @param <T> The object type that the lists can hold, can not be changed.
 *           All methods assume hold Type - T object
 *
 *
 */
public class ListHolder<T> {
    List<List<T>> listOfLists;

    /**
     * Combines the first two lists in listsOfLists and removes the second list.
     * If there is less than 2 lists nothing happens
     */
    public void combineFirstTwo(){
        if(listOfLists.size() < 2){
            return;
        }
        else{
            List<T> list1 = listOfLists.get(0);
            List<T> list2 = listOfLists.get(1);
            list1.addAll(list2);
            listOfLists.remove(1);
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void addValue(int[] array, int value){
        int[] addedValue = new int[array.length + 1];
        addedValue[array.length] = value;
        for (int i = 0; i < array.length; i++){
            addedValue[i] = array[i];
        }
        System.out.println(Arrays.toString(addedValue));
    }
    public static void deleteValue(int[] array){
        int[] deletedValue = new int[array.length - 1];
        int popValue = array[array.length - 1];
        for (int i = 0; i < deletedValue.length; i++){
            deletedValue[i] = array[i];
        }
        System.out.println(Arrays.toString(deletedValue));
        System.out.println("Deleted Value: " + popValue);
    }
    public static void insertValue(int[] array, int value, int pos){
        int[] insertValue = new int[array.length + 1];
        insertValue[pos] = value;
        for (int i = 0; i < array.length; i++){
            if (i < pos){
                insertValue[i] = array[i];
            }
            else{
                insertValue[i + 1] = array[i];
            }
        }
        System.out.println(Arrays.toString(insertValue));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Creates initial array called nums
        int[] nums = new int[4];
        //Inputs scanner int into each pos of array
        for (int i = 0; i < nums.length; i++){
            nums[i] = scanner.nextInt();
        }

        //addValue(nums, value);
        //deleteValue(nums);
        //insertValue(nums, value, pos);

    }
}

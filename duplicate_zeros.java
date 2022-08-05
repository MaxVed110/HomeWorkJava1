import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.stream.IntStream;

/*
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
*/

public class duplicate_zeros {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 0, 2, 3, 0, 4, 5, 0 };
        duplicateZeros(arr);
        //duplicateZerosTwo(arr);
        for (Integer item : arr) {
            System.out.println(item);
        }
    }
    
    // первый вариант
    public static void duplicateZeros(int[] arr) {
        Integer[] arr_integer = IntStream.of(arr).boxed().toArray(Integer[]::new); 
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, arr_integer);
        for (int i = 0; i < list.size() - 1; i++) { // на случай, если исходная последовательность содержит нули,
                                                    // итерация до -1, чтобы исключить переполнение
            if (list.get(i) == 0) {
                list.add(i + 1, 0);
                list.remove(list.size() - 1);
                arr[i] = list.get(i);
                arr[i + 1] = list.get(i + 1);
                i++;
            } else {
                arr[i] = list.get(i);
            }
            arr[list.size() - 1] = list.get(list.size() - 1);
        }
    }

    // второй вариант
    public static void duplicateZerosTwo(int[] array) {
        Integer[] arr_integer = IntStream.of(array).boxed().toArray(Integer[]::new);
        Vector<Integer> vector = new Vector<>();
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, arr_integer);
        vector.addAll(list);
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) == 0) {
                vector.add(i + 1, 0);
                vector.removeElementAt(vector.size() - 1);
                i++;
            }
        }
        for (int i = 0; i < vector.size(); i++) {
            array[i] = vector.get(i);
        }
    }
}

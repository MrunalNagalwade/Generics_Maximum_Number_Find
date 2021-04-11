package generics;

import javafx.collections.FXCollections;

import java.util.Arrays;
/*import javafx.collections.ObservableList;*/

public class Max_number <E> {
    public static  <E> E findMaxValue(E[] inputArray )
    {
        int size = inputArray.length;
        Arrays.sort(inputArray);
        return inputArray[size-1];
    }
}

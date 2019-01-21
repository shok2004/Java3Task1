import java.util.ArrayList;
import java.util.Arrays;
/*1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
        2. Написать метод, который преобразует массив в ArrayList;*/
public class Main {
        static void swapObj(Object[] array, int firstIndex, int secondIndex) {
        Object oneVal = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = oneVal;
    }
    static <T> ArrayList <T> convertToList(T[] array) {
        return new ArrayList <>(Arrays.asList(array));
    }
}
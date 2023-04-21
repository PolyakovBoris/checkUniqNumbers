import java.util.SortedSet;
import java.util.TreeSet;

public class checkIFNumberRepeat {
    public static void arrayToSet(int[] array){
        SortedSet<String> set = new TreeSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(String.valueOf(array[i]));
        }
        System.out.println("\n всего " + set.size() + " уникальных элементов:");
        System.out.println(set);
    }
}

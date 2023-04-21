import java.util.concurrent.ThreadLocalRandom;

public class createArray {
    public static int[] createArrayAndFill(int sizeArray){
        int[] array = new int [sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(10, 100);
            System.out.print(array[i] + " ");
        }
        return array;
    }
}

import java.util.Arrays;

public class App {
    public static void main(String args[]) {
        int[] data = { -2, 45, 0, 11, -9 };
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(data);
        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}

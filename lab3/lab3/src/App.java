import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {5, 2, 9, 1, 5, 6, 8, 2, 1, 5, 12, 14, 22};
        CountingSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

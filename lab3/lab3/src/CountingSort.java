public class CountingSort {
    public static void sort(int[] arr, int max) {
        int[] count = new int[max + 1]; // создаем массив для подсчета

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++; // увеличиваем счетчик в соответствии с числом
        }

        int j = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[j] = i; // заполняем массив отсортированными элементами
                j++;
                count[i]--;
            }
        }
    }
}

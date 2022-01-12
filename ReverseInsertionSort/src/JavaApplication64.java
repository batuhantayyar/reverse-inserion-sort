
import java.util.Arrays;

//Batuhan TAYYAR 02205076043 3.grup (2.öğretim)



public class JavaApplication64{

    public static void main(String[] args) {
        int A[] = new int[10];
        populateArray(A);
        System.out.println(" Sorting Yapmadan Önce : ");
        printArray(A);
        //diziyi sıralama
        insertionSort(A);
        System.out.println(" Sorting Yaptıktan Sonra : ");
        printArray(A);
    }

    /**
     * Bu yöntem, eklemeli sıralama algoritmasını kullanarak tamsayı dizisini sıralayacaktır.
     */
    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int valueToSort = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > valueToSort) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = valueToSort;
        }
    }

    public static void printArray(int[] B) {
        System.out.println(Arrays.toString(B));
    }

    public static void populateArray(int[] B) {
        for (int i = 0; i < B.length; i++) {
            B[i] = (int) (Math.random() * 100);
        }
    }
}

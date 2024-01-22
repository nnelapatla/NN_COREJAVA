package arrays;

public class SelectionSort {


        public static void main(String[] args) {

            int arr[] = {3, 1, 0, 9, 8, 6, 2, 5, 4, 7};
            sortnumbers(arr);
            for (int i : arr) {
                System.out.print(i);
            }
        }

        public static void sortnumbers(int[] arr) {

            for (int i = 0; i < arr.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[min] < arr[j]) {
                        min = j;

                    }
                }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }


package Lab8;

public class Ex1a {

    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void main(String[] args) {

        // create an integer array with 10 elements
        int arr[] = { 45, 3, 7, 98, 38, 89, 37, 57, 39, 100 };

        // call the bubbleSort methord in th emain function
        Ex1a sort = new Ex1a();

        sort.bubbleSort(arr);

        System.out.print("Shorted array  : ");

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}

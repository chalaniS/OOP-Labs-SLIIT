package Lab7;

public class Ex1d {

    public <E extends Number> void bubbleSort(E[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[i].doubleValue() > arr[j + 1].doubleValue()) {
                    E temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public <E extends Number> void printArray(E arr[]) {
        System.out.print("Shorted array  : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Float arr1[] = { 45f, 4f, 56f, 12f, 31f, 20f };
        Double arr2[] = { 5.0, 9.0, 6.0, 1.0, 3.0, 10.0 };

        Ex1d s1 = new Ex1d();
        s1.bubbleSort(arr1);
        s1.printArray(arr1);
        s1.bubbleSort(arr2);
        s1.printArray(arr2);

    }

}

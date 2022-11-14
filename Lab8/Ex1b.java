package Lab8;

public class Ex1b<T extends Number> {

    T t[];

    public void add(T val[]) {
        this.t = val;
    }

    public T[] get() {
        return t;
    }

    void bubbleSort() {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = 0; j < t.length - i - 1; j++) {
                if (t[i].doubleValue() > t[j + 1].doubleValue()) {
                    T temp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = temp;
                }
            }
        }
    }

    public void printArray() {

        System.out.print("Shorted array  : ");

        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Float arr1[] = { 45f, 4f, 56f, 12f, 31f, 20f };
        Double arr2[] = { 5.0, 9.0, 6.0, 1.0, 3.0, 10.0 };

        Ex1b<Float> s1 = new Ex1b<Float>();
        s1.add(arr1);
        s1.bubbleSort();
        s1.printArray();

        Ex1b<Double> s2 = new Ex1b<Double>();
        s2.add(arr2);
        s2.bubbleSort();
        s2.printArray();

    }

}

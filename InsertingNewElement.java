public class InsertingNewElement {
    public static void main(String[] args) {
        int arr[] = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = 20;
        int n = 6; 
        int key = 26; 

        System.out.println("Before Insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        n = insertEnd(arr, n, key, capacity);

        System.out.println("\n\nAfter Insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int insertEnd(int arr[], int n, int key, int capacity) {
        if (n < capacity) {
            arr[n] = key; 
            n++;
        } else {
            System.out.println("Array is full, cannot insert " + key);
        }
        return n; 
    }
}

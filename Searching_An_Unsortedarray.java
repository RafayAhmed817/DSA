public class Searching_An_Unsortedarray {
    
    public static int findElement(int num[], int n, int key) {
        for (int i = 0; i < n; i++) {
            if (num[i] == key) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int num[] = {12, 34, 10, 6, 40};
        int key = 40;
        int n = num.length;
        int position = findElement(num, n, key);
        
        if (position == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + position);
        }
    }
}
    


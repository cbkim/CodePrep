public class Q2Sol1 {

    /*
     * Function to print product array for a given array arr[] of size n
     */
    void productArray(int arr[], int n) {

        // Base case
        if (n == 1) {
            System.out.print(0);
            return;
        }
        // Initialize memory to all arrays
        int left[] = new int[n]; // Prefix
        int right[] = new int[n]; // Surfix
        int prod[] = new int[n];

        int i, j;

        /*
         * Left most element of left array is always 1
         */
        left[0] = 1;

        /*
         * Rightmost most element of right array is always 1
         */
        right[n - 1] = 1;

        /* Construct the left array / prefix */
        System.out.print("print prefix / left array : ");
        for (i = 1; i < n; i++){
            left[i] = arr[i - 1] * left[i - 1];
             System.out.print(left[i]+ " ");
        }
        System.out.println("");
        // print prefix / left array
        /* Construct the right array */
        System.out.print("print suffix / right array : ");
        for (j = n - 2; j >= 0; j--){
            right[j] = arr[j + 1] * right[j + 1];
            System.out.print(right[j]+ " ");
        }
         System.out.println("");

        /*
         * Construct the product array using left[] and right[]
         */
        for (i = 0; i < n; i++)
            prod[i] = left[i] * right[i];

        System.out.print("product array is: ");
        /* print the constructed prod array */
        for (i = 0; i < n; i++)
            System.out.print(prod[i] + " ");

        System.out.println("");
        return;
    }

    /* Driver program to test the above function */
    public static void main(String[] args) {
        Q2Sol1 pa = new Q2Sol1();
        int arr[] = { 5, 4, 3, 2, 1};
        int n = arr.length; 
        pa.productArray(arr, n);
    }
}
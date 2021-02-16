import java.util.Arrays;

public class Q1Sol2 {

    public static void main(String args[]) {
        int x = 10;
        int a[] = { 10, 15, 3, 7 };
        System.out.println(containsPairWithSum(a, x));
    }

    public static boolean containsPairWithSum(int[] a, int x) {
        Arrays.sort(a);
        for (int i = 0, j = a.length - 1; i < j;) {
            int sum = a[i] + a[j];
            if (sum < x)
                i++;
            else if (sum > x)
                j--;
            else
                return true;
        }
        return false;
    }
    
}
/**
Proof by induction: Let a[0,n] be an array of length n+1 and p = (p1, p2) where p1, p2 are integers and p1 <= p2 (w.l.o.g.). 
Assume a[0,n] contains p1 and p2. In the case that it does not, the algorithm is obviously correct.
Base case (i = 0, j = n): a[0,-1] does not contain p1 and a[n,n+1] does not contain p2.
Hypothesis: a[0,i-1] does not contain a[i] and a[j+1,n] does not contain p2.
Step case (i to i + 1 or j to j - 1):
Assume p1 = a[i]. Then, since p1 + a[j] < p1 + p2, index j must be increased. 
But from the hypothesis we know that a[j+1,n-1] does not contain p2. Contradiction. 
It follows that p1 != a[i].j to j - 1 analogously.
Because each iteration, a[0,i-1] and a[j+1,n], does not contain p1, and p2, a[i,j]does contain p1 and p2.
Eventually, a[i] = p1 and a[j] = p2 and the algorithm returns true.
 */
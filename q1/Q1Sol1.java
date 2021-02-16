import java.util.HashSet;

public class Q1Sol1 {
    public static void main(String args[]) {

        Integer k = 17;
        Integer ar[] = { 10, 15, 3, 7 };
        System.out.println(containsPairWithSum(ar, k));
    }

    public static boolean containsPairWithSum(Integer ar[], Integer k) {
        boolean flag = false;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < ar.length; i++) {
            if (hashSet.contains(k - ar[i])) {
                flag = true; 
            }
            hashSet.add(ar[i]);
        }
        return flag;
    }
}
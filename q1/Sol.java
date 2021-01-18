import java.util.HashSet;

public class Sol {
    public static void main(String args[]) {
        System.out.println("Sol 1");
        boolean flag = false;
        Integer k=17;
        Integer ar[]={10, 15, 3, 7};
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < ar.length; i++) {
            if (hashSet.contains(k - ar[i])){
                flag = true;
                System.out.println(k+"="+ar[i]+"+"+(k - ar[i])); 
            }
            hashSet.add(ar[i]);
        }
        if (flag)
           System.out.println("YES PRESENT");
        else
            System.out.println("NOT PRESENT");
    }
}
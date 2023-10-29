//J07009 LỚP INTSET - 2

import java.io.File;
import java.io.IOException;
import java.util.*;

public class J07009 {
    private static class IntSet {
        private Set<Integer> arr;

        public IntSet(TreeSet<Integer> arr){
            this.arr = arr;
        }
        public IntSet(int[] arr) {
            this.arr = new TreeSet<>();
            for (int i:arr) this.arr.add(i);
        }

        public IntSet intersection(IntSet o){
           TreeSet<Integer> set = new TreeSet<>();
            for (int i:o.arr) {
                if (arr.contains(i)) {
                    set.add(i);
                }
            }
            return new IntSet(set);
        }

        @Override
        public String toString() {
            String res = "";
            for (Integer i:arr) res += i+" ";
            return res;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
}

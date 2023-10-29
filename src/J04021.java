//J04021 LỚP INTSET

import java.util.*;

public class J04021 {
    private static class IntSet {
        private List<Integer> arr;

        public IntSet(Set<Integer> arr){
            this.arr = new ArrayList<>();
            for (Integer i:arr) this.arr.add(i);
        }
        public IntSet(int[] arr) {
            this.arr = new ArrayList<>();
            for (int i:arr) this.arr.add(i);
        }

        public IntSet union(IntSet o){
            Set<Integer> set = new TreeSet<>();
            for (int i:arr) set.add(i);
            for (int i:o.arr) set.add(i);
            return new IntSet(set);
        }

        @Override
        public String toString() {
            String res = "";
            for (Integer i:arr) res += i+" ";
            return res;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}

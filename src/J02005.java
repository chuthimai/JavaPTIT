//J02005 GIAO CỦA HAI DÃY SỐ

import java.util.*;

public class J02005 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        Set<Integer> arr1 = new HashSet<Integer>(),
                arr2 = new HashSet<Integer>(),
                intersection = new HashSet<Integer>();

        for (int i=0; i<n; i++) arr1.add(scanner.nextInt());
        for (int i=0; i<m; i++) arr2.add(scanner.nextInt());

        for (Integer num: arr1){
            if (arr2.contains(num)) intersection.add(num);
        }
        List<Integer> sortedIntersection = new ArrayList<>(intersection);
        Collections.sort(sortedIntersection);

        for (Integer val: sortedIntersection) System.out.print(val + " ");
    }
}

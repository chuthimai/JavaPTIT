//J02006 HỢP CỦA HAI DÃY SỐ

import java.util.*;

public class J02006 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        Set<Integer> union = new HashSet<Integer>();

        for (int i=0; i<n; i++) union.add(scanner.nextInt());
        for (int i=0; i<m; i++) union.add(scanner.nextInt());

        List<Integer> sortedIntersection = new ArrayList<>(union);
        Collections.sort(sortedIntersection);

        for (Integer val: sortedIntersection) System.out.print(val + " ");
    }
}

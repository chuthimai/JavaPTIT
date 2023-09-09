//J02020 LIỆT KÊ TỔ HỢP - 1

import java.util.ArrayList;
import java.util.Scanner;

public class J02020 {
    static int count = 0, n, k;
    static ArrayList<Integer> nums, res;
    static void printArr(ArrayList<Integer> arr){
        for (Integer num: arr) System.out.print(num+" ");
        System.out.println();
    }

    static void backtracking(int n){
        for (Integer num: nums){
            if (res.size() == 0) res.add(num);
            else if (num > res.get(res.size()-1)) {
                res.add(num);
            }else continue;
            if (res.size() == k) {
                printArr(res);
                count ++;
            }
            else backtracking(n+1);
            res.remove(res.size()-1);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        nums = new ArrayList<Integer>();
        res = new ArrayList<Integer>();
        for (int i=1; i<=n; i++) nums.add(i);
        backtracking(0);
        System.out.println("Tong cong co " + count + " to hop");
    }
}

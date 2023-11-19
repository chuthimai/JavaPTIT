//J03016 CHIA HẾT CHO 11

import java.util.Scanner;

public class J03016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j=0; j<n; j++){
            String[] arr = sc.next().split("");
            int odd = 0, even = 0;
            int l = arr.length;
            for (int i=0; i<l; i++){
                if (i%2 == 0) even += Integer.parseInt(arr[i]);
                else odd += Integer.parseInt(arr[i]);
            }
            if (Math.abs(odd - even)%11==0) System.out.println("1");
            else System.out.println("0");
        }
    }
}

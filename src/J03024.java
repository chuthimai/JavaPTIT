//J03024 SỐ ƯU THẾ

import java.util.Scanner;

public class J03024 {
    static int check(String num){
        int len = num.length();
        int chan = 0, le = 0;
        if (num.charAt(0) == '0') return -1;
        for (int i=0; i<len; i++){
            if (num.charAt(i) < '0' || num.charAt(i) > '9') return -1;
            if (num.charAt(i) % 2 == 0) chan++;
            else le++;
        }
        if (le == chan) return 0;
        if (len%2==0 && chan>le) return 1;
        if (len%2==1 && chan<le) return 1;
        return 0;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i=0; i<times; i++){
            String num = scanner.next();
            if (check(num) == -1) System.out.println("INVALID");
            else if (check(num) == 0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}

//J01026 SỐ CHÍNH PHƯƠNG

import java.util.Scanner;

public class J01026 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i=0; i<times; i++){
            int num = scanner.nextInt();
            int num_sqrt = (int)Math.sqrt(num);
            if (num == num_sqrt * num_sqrt) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

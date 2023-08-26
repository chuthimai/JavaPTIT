//J01024 SỐ TAM PHÂN

import java.util.Scanner;

public class J01024 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        for (int i=0; i<times; i++){
            String num = scanner.next();
            boolean is_true = true;
            for (int j=0; j<num.length(); j++){
                if (num.charAt(j) > '2') is_true = false;
            }
            if (is_true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

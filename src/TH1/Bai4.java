package TH1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int num2 = 0, num6 = 0;
        for (int i=0; i<num.length(); i++){
            if (num.charAt(i) == '2') num2++;
            else if (num.charAt(i) == '6') num6++;
        }
        if ((num2 + num6 == 2) || (num2 + num6 == 6)) System.out.println("YES");
        else System.out.println("NO");
    }
}
